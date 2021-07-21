package at.martinthedragon.nucleartech.containers

import at.martinthedragon.nucleartech.containers.slots.ExperienceResultSlot
import at.martinthedragon.nucleartech.recipes.RecipeTypes
import at.martinthedragon.nucleartech.tileentities.BlastFurnaceTileEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.container.Container
import net.minecraft.item.ItemStack
import net.minecraft.network.PacketBuffer
import net.minecraft.tileentity.AbstractFurnaceTileEntity
import net.minecraft.util.IIntArray
import net.minecraftforge.items.CapabilityItemHandler
import net.minecraftforge.items.SlotItemHandler
import net.minecraft.util.IntArray as MinecraftIntArray

class BlastFurnaceContainer(
    windowID: Int,
    val playerInventory: PlayerInventory,
    val tileEntity: BlastFurnaceTileEntity,
    val data: IIntArray = MinecraftIntArray(2)
) : Container(ContainerTypes.blastFurnaceContainer.get(), windowID) {
    private val inv = tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).orElseThrow(::Error)
    private val level = playerInventory.player.level

    init {
        addSlot(SlotItemHandler(inv, 0, 80, 18))
        addSlot(SlotItemHandler(inv, 1, 80, 54))
        addSlot(SlotItemHandler(inv, 2, 8, 36))
        addSlot(ExperienceResultSlot(tileEntity, playerInventory.player, inv, 3, 134, 36))
        addPlayerInventory(this::addSlot, playerInventory, 8, 84)
        addDataSlots(data)
    }

    override fun quickMoveStack(player: PlayerEntity, index: Int): ItemStack {
        var returnStack = ItemStack.EMPTY
        val slot = slots[index]
        if (slot != null && slot.hasItem()) {
            val itemStack = slot.item
            returnStack = itemStack.copy()
            if (index == 3) {
                if (!moveItemStackTo(itemStack, 4, slots.size, true)) return ItemStack.EMPTY
                slot.onQuickCraft(itemStack, returnStack)
            } else if (index != 0 && index != 1 && index != 2) {
                var successful = false
                when {
                    canBlast(itemStack) && (moveItemStackTo(itemStack, 0, 1, false) || moveItemStackTo(itemStack, 1, 2, false)) -> successful = true
                    AbstractFurnaceTileEntity.isFuel(itemStack) && moveItemStackTo(itemStack, 2, 3, false) -> successful = true
                }
                if (!successful && !tryMoveInPlayerInventory(index, 4, itemStack)) return ItemStack.EMPTY
            } else if (!moveItemStackTo(itemStack, 4, slots.size, false)) return ItemStack.EMPTY

            if (itemStack.isEmpty) slot.set(ItemStack.EMPTY)
            else slot.setChanged()

            if (itemStack.count == returnStack.count) return ItemStack.EMPTY

            slot.onTake(player, itemStack)
        }
        return returnStack
    }

    fun canBlast() = tileEntity.canBlast()

    private fun canBlast(itemStack: ItemStack) =
        level.recipeManager.getRecipeFor(RecipeTypes.BLASTING, Inventory(itemStack), level).isPresent

    override fun stillValid(player: PlayerEntity) = playerInventory.stillValid(player)

    fun getBurnTime() = data[0]

    fun getBlastProgress() = data[1]

    companion object {
        fun fromNetwork(windowId: Int, playerInventory: PlayerInventory, buffer: PacketBuffer) =
            BlastFurnaceContainer(windowId, playerInventory, getTileEntityForContainer(buffer))
    }
}
