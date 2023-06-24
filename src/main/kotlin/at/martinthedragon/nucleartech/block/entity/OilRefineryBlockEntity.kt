package at.martinthedragon.nucleartech.block.entity

import at.martinthedragon.nucleartech.LangKeys
import at.martinthedragon.nucleartech.api.block.entities.SoundLoopBlockEntity
import at.martinthedragon.nucleartech.api.block.entities.TickingServerBlockEntity
import at.martinthedragon.nucleartech.capability.item.AccessLimitedInputItemHandler
import at.martinthedragon.nucleartech.capability.item.AccessLimitedOutputItemHandler
import at.martinthedragon.nucleartech.energy.EnergyStorageExposed
import at.martinthedragon.nucleartech.energy.transferEnergy
import at.martinthedragon.nucleartech.fluid.*
import at.martinthedragon.nucleartech.item.FluidIdentifierItem
import at.martinthedragon.nucleartech.item.canTransferItem
import at.martinthedragon.nucleartech.item.transferItemsBetweenItemHandlers
import at.martinthedragon.nucleartech.item.upgrades.*
import at.martinthedragon.nucleartech.menu.NTechContainerMenu
import at.martinthedragon.nucleartech.menu.OilRefineryMenu
import at.martinthedragon.nucleartech.menu.slots.data.FluidStackDataSlot
import at.martinthedragon.nucleartech.menu.slots.data.IntDataSlot
import net.minecraft.core.BlockPos
import net.minecraft.core.NonNullList
import net.minecraft.nbt.CompoundTag
import net.minecraft.sounds.SoundEvent
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.material.Fluid
import net.minecraft.world.level.material.Fluids
import net.minecraft.world.phys.AABB
import net.minecraftforge.energy.CapabilityEnergy
import net.minecraftforge.fluids.FluidAttributes
import net.minecraftforge.fluids.FluidStack
import net.minecraftforge.fluids.capability.CapabilityFluidHandler
import net.minecraftforge.fluids.capability.IFluidHandler

class OilRefineryBlockEntity(pos: BlockPos, state: BlockState) : BaseMachineBlockEntity(BlockEntityTypes.oilRefineryBlockEntityType.get(), pos, state),
    TickingServerBlockEntity
{


    override val mainInventory: NonNullList<ItemStack> = NonNullList.withSize(12, ItemStack.EMPTY)

    override val defaultName = LangKeys.CONTAINER_OIL_REFINERY.get()

    override fun createMenu(windowID: Int, inventory: Inventory) = OilRefineryMenu(windowID, inventory, this)

    override fun isItemValid(slot: Int, stack: ItemStack): Boolean = when(slot) {
        0 -> stack.getCapability(CapabilityEnergy.ENERGY).isPresent
        1 -> stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).isPresent
        2 -> true
        3 -> stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).isPresent
        4 -> true
        5 -> stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).isPresent
        6 -> true
        7 -> stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).isPresent
        8 -> true
        9 -> stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY).isPresent
        10 -> true
        else -> false
    }

    override fun trackContainerMenu(menu: NTechContainerMenu<*>) {
        menu.track(IntDataSlot.create(this::energy, this::energy::set))

        val isClient = isClientSide()
        menu.track(FluidStackDataSlot.create(hotOilTank, isClient))
        menu.track(FluidStackDataSlot.create(outputHeavyOilTank, isClient))
        menu.track(FluidStackDataSlot.create(outputLightOilTank, isClient))
        menu.track(FluidStackDataSlot.create(outputNaphthaTank, isClient))
        menu.track(FluidStackDataSlot.create(outputPetroleumTank, isClient))
    }

    override val shouldPlaySoundLoop = false
    override val soundLoopEvent: SoundEvent get() = throw IllegalStateException("No sound loop for oil refineries")
    @Suppress("LeakingThis")
    override val soundLoopStateMachine = SoundLoopBlockEntity.NoopStateMachine(this)

    override fun inventoryChanged(slot: Int) {
        super.inventoryChanged(slot)
    }

    val energyStorage = EnergyStorageExposed(MAX_ENERGY, 1_000, 0)

    var energy: Int
        get() = energyStorage.energyStored
        private set(value) { energyStorage.energy = value }

    private var forcedType: Fluid = NTechFluids.oilHot.source.get()
    val hotOilTank = FluidInputTank(MAX_INPUT) { it.fluid.isSame(forcedType) }.apply { forceFluid(FluidStack(forcedType, 0)) }
    val outputHeavyOilTank = FluidOutputTank(MAX_OUTPUT).apply { forceFluid(FluidStack(NTechFluids.oilHeavy.source.get(), 0)) }
    val outputLightOilTank = FluidOutputTank(MAX_OUTPUT).apply { forceFluid(FluidStack(NTechFluids.oilLight.source.get(), 0)) }
    val outputNaphthaTank = FluidOutputTank(MAX_OUTPUT).apply { forceFluid(FluidStack(NTechFluids.naphtha.source.get(), 0)) }
    val outputPetroleumTank = FluidOutputTank(MAX_OUTPUT).apply { forceFluid(FluidStack(NTechFluids.petroleum.source.get(), 0)) }

    private fun updateTankTypes() {
        hotOilTank.forceFluid(FluidStack(forcedType, 0))
        outputHeavyOilTank.forceFluid(FluidStack(NTechFluids.oilHeavy.source.get(), 0))
        outputLightOilTank.forceFluid(FluidStack(NTechFluids.oilLight.source.get(), 0))
        outputNaphthaTank.forceFluid(FluidStack(NTechFluids.naphtha.source.get(), 0))
        outputPetroleumTank.forceFluid(FluidStack(NTechFluids.petroleum.source.get(), 0))
    }

    override fun serverTick(level: Level, pos: BlockPos, state: BlockState) {

        if (energy > 0) {
            val energyItemSlot = mainInventory[0]
            if (!energyItemSlot.isEmpty) transferEnergy(energyStorage, energyItemSlot)
        }

        val fluidId = mainInventory[0]
        if (!fluidId.isEmpty) {
            val fluid = FluidIdentifierItem.getFluid(fluidId)
            if (!fluid.isSame(Fluids.EMPTY) && !fluid.isSame(forcedType)) {
                forcedType = fluid
                updateTankTypes()
            }
            if (canTransferItem(mainInventory[0], mainInventory[1], this))
                transferItemsBetweenItemHandlers(AccessLimitedOutputItemHandler(this, 0), AccessLimitedInputItemHandler(this, 1), 1)
        }
    }

    override fun getRenderBoundingBox(): AABB = AABB(blockPos.offset(-1, 0, -1), blockPos.offset(1, 8, 1))

    override fun saveAdditional(tag: CompoundTag) {
        super.saveAdditional(tag)
        tag.putInt("Energy", energy)

        tag.put("HotOilTank", hotOilTank.writeToNBT(CompoundTag()))
        tag.put("OutputHeavyOilTank", outputHeavyOilTank.writeToNBT(CompoundTag()))
        tag.put("OutputLightOilTank", outputLightOilTank.writeToNBT(CompoundTag()))
        tag.put("OutputNaphthaTank", outputNaphthaTank.writeToNBT(CompoundTag()))
        tag.put("OutputPetroleumTank", outputPetroleumTank.writeToNBT(CompoundTag()))
    }

    override fun load(tag: CompoundTag) {
        super.load(tag)
        energy = tag.getInt("Energy")

        hotOilTank.readFromNBT(tag.getCompound("HotOilTank"))
        outputHeavyOilTank.readFromNBT(tag.getCompound("OutputHeavyOilTank"))
        outputLightOilTank.readFromNBT(tag.getCompound("OutputLightOilTank"))
        outputNaphthaTank.readFromNBT(tag.getCompound("OutputNaphthaTank"))
        outputPetroleumTank.readFromNBT(tag.getCompound("OutputPetroleumTank"))
    }

    private val fluidCapabilityDelegate = object : IFluidHandler {
        override fun getTanks() = 5

        override fun getFluidInTank(tank: Int): FluidStack = when (tank) {
            0 -> hotOilTank.fluid
            1 -> outputHeavyOilTank.fluid
            2 -> outputLightOilTank.fluid
            3 -> outputNaphthaTank.fluid
            4 -> outputPetroleumTank.fluid
            else -> FluidStack.EMPTY
        }

        override fun getTankCapacity(tank: Int): Int = when (tank) {
            0 -> hotOilTank.capacity
            1 -> outputHeavyOilTank.capacity
            2 -> outputLightOilTank.capacity
            3 -> outputNaphthaTank.capacity
            4 -> outputPetroleumTank.capacity
            else -> 0
        }

        override fun isFluidValid(tank: Int, stack: FluidStack): Boolean = when (tank) {
            0 -> hotOilTank.isFluidValid(stack)
            1 -> outputHeavyOilTank.isFluidValid(stack)
            2 -> outputLightOilTank.isFluidValid(stack)
            3 -> outputNaphthaTank.isFluidValid(stack)
            4 -> outputPetroleumTank.isFluidValid(stack)
            else -> false
        }

        override fun fill(resource: FluidStack, action: IFluidHandler.FluidAction): Int {
            if (resource.isEmpty) return 0

            return hotOilTank.fill(resource, action)
        }

        override fun drain(resource: FluidStack, action: IFluidHandler.FluidAction): FluidStack {
            if (resource.isEmpty) return FluidStack.EMPTY

            var stack = FluidStack.EMPTY
            if (outputHeavyOilTank.fluid.fluid == resource.fluid) {
                stack = outputHeavyOilTank.drain(resource, action)
            }
            if (outputLightOilTank.fluid.fluid == resource.fluid) {
                val output2 = outputLightOilTank.drain(FluidStack(resource, resource.amount - stack.amount), action)
                if (stack.isEmpty) stack = output2
                else stack.grow(output2.amount)
            }
            if (outputNaphthaTank.fluid.fluid == resource.fluid) {
                val output3 = outputNaphthaTank.drain(FluidStack(resource, resource.amount - stack.amount), action)
                if (stack.isEmpty) stack = output3
                else stack.grow(output3.amount)
            }
            if (outputPetroleumTank.fluid.fluid == resource.fluid) {
                val output4 = outputPetroleumTank.drain(FluidStack(resource, resource.amount - stack.amount), action)
                if (stack.isEmpty) stack = output4
                else stack.grow(output4.amount)
            }

            return stack
        }

        override fun drain(maxDrain: Int, action: IFluidHandler.FluidAction): FluidStack {
            var stack = outputHeavyOilTank.drain(maxDrain, action)
            if (stack.isEmpty || outputLightOilTank.fluid.fluid == stack.fluid) {
                val output2 = outputLightOilTank.drain(maxDrain - stack.amount, action)
                if (stack.isEmpty) stack = output2
                else stack.grow(output2.amount)
            }
            if (stack.isEmpty ||outputNaphthaTank.fluid.fluid == stack.fluid) {
                val output3 = outputNaphthaTank.drain(maxDrain - stack.amount, action)
                if (stack.isEmpty) stack = output3
                else stack.grow(output3.amount)
            }
            if (stack.isEmpty ||outputPetroleumTank.fluid.fluid == stack.fluid) {
                val output4 = outputPetroleumTank.drain(maxDrain - stack.amount, action)
                if (stack.isEmpty) stack = output4
                else stack.grow(output4.amount)
            }

            return stack
        }
    }

    override fun registerCapabilityHandlers() {
        super.registerCapabilityHandlers()
        registerCapabilityHandler(CapabilityEnergy.ENERGY, this::energyStorage)
        registerCapabilityHandler(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, this::fluidCapabilityDelegate)
    }

    companion object {
        const val MAX_ENERGY = 1_000
        const val ENERGY_CONSUMPTION_RATE = 5
        const val MAX_INPUT = FluidAttributes.BUCKET_VOLUME * 64
        const val MAX_OUTPUT = FluidAttributes.BUCKET_VOLUME * 24
    }
}
