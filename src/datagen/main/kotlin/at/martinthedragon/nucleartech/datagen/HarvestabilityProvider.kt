package at.martinthedragon.nucleartech.datagen

import at.martinthedragon.nucleartech.NuclearTech
import at.martinthedragon.nucleartech.block.NTechBlocks
import at.martinthedragon.nucleartech.datagen.tag.add
import net.minecraft.data.DataGenerator
import net.minecraft.data.tags.BlockTagsProvider
import net.minecraft.tags.BlockTags
import net.minecraftforge.common.Tags
import net.minecraftforge.common.data.ExistingFileHelper

class HarvestabilityProvider(dataGenerator: DataGenerator, existingFileHelper: ExistingFileHelper) : BlockTagsProvider(dataGenerator, NuclearTech.MODID, existingFileHelper) {
    override fun getName() = "Nuclear Tech Mod Block Harvestability"

    override fun addTags() {
        toolTypes()
        materialLevel()
    }

    private fun toolTypes() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
            NTechBlocks.uraniumOre, NTechBlocks.deepslateUraniumOre, NTechBlocks.netherUraniumOre, NTechBlocks.scorchedNetherUraniumOre, NTechBlocks.meteorUraniumOre,  NTechBlocks.uraniumBlock, NTechBlocks.u233Block, NTechBlocks.u235Block, NTechBlocks.u238Block, NTechBlocks.uraniumFuelBlock,
            NTechBlocks.scorchedUraniumOre, NTechBlocks.scorchedDeepslateUraniumOre,
            NTechBlocks.netherPlutoniumOre, NTechBlocks.plutoniumBlock, NTechBlocks.pu238Block, NTechBlocks.pu239Block, NTechBlocks.pu240Block, NTechBlocks.plutoniumFuelBlock,
            NTechBlocks.thoriumOre, NTechBlocks.deepslateThoriumOre, NTechBlocks.meteorThoriumOre, NTechBlocks.thoriumBlock, NTechBlocks.thoriumFuelBlock,
            NTechBlocks.titaniumOre, NTechBlocks.deepslateTitaniumOre, NTechBlocks.meteorTitaniumOre, NTechBlocks.titaniumBlock,
            NTechBlocks.sulfurOre, NTechBlocks.deepslateSulfurOre, NTechBlocks.netherSulfurOre, NTechBlocks.meteorSulfurOre, NTechBlocks.sulfurBlock,
            NTechBlocks.niterOre, NTechBlocks.deepslateNiterOre, NTechBlocks.niterBlock,
            NTechBlocks.tungstenOre, NTechBlocks.deepslateTungstenOre, NTechBlocks.netherTungstenOre, NTechBlocks.meteorTungstenOre, NTechBlocks.tungstenBlock,
            NTechBlocks.aluminiumOre, NTechBlocks.deepslateAluminiumOre, NTechBlocks.meteorAluminiumOre, NTechBlocks.aluminiumBlock,
            NTechBlocks.fluoriteOre, NTechBlocks.deepslateFluoriteOre, NTechBlocks.fluoriteBlock,
            NTechBlocks.berylliumOre, NTechBlocks.deepslateBerylliumOre, NTechBlocks.berylliumBlock,
            NTechBlocks.leadOre, NTechBlocks.deepslateLeadOre, NTechBlocks.meteorLeadOre, NTechBlocks.leadBlock,
            NTechBlocks.oilDeposit, NTechBlocks.emptyOilDeposit, NTechBlocks.deepslateOilDeposit, NTechBlocks.emptyDeepslateOilDeposit,
            NTechBlocks.ligniteOre,
            NTechBlocks.asbestosOre, NTechBlocks.deepslateAsbestosOre, NTechBlocks.asbestosBlock,
            NTechBlocks.schrabidiumOre, NTechBlocks.deepslateSchrabidiumOre, NTechBlocks.netherSchrabidiumOre,  NTechBlocks.schrabidiumBlock, NTechBlocks.soliniumBlock, NTechBlocks.schrabidiumFuelBlock,
            NTechBlocks.australianOre, NTechBlocks.deepslateAustralianOre, NTechBlocks.australiumBlock,
            NTechBlocks.weidite, NTechBlocks.weidaniumBlock,
            NTechBlocks.reiite, NTechBlocks.reiiumBlock,
            NTechBlocks.brightblendeOre, NTechBlocks.unobtainiumBlock,
            NTechBlocks.dellite, NTechBlocks.daffergonBlock,
            NTechBlocks.dollarGreenMineral, NTechBlocks.verticiumBlock,
            NTechBlocks.rareEarthOre, NTechBlocks.deepslateRareEarthOre,
            NTechBlocks.cobaltOre, NTechBlocks.deepslateCobaltOre,
            NTechBlocks.netherPhosphorusOre,
            NTechBlocks.meteorCopperOre,
            NTechBlocks.meteorLithiumOre, NTechBlocks.lithiumBlock,
            NTechBlocks.starmetalOre, NTechBlocks.starmetalBlock,
            NTechBlocks.trixite,
            NTechBlocks.basaltSulfurOre, NTechBlocks.basaltFluoriteOre, NTechBlocks.basaltAsbestosOre, NTechBlocks.basaltVolcanicGemOre,
            NTechBlocks.neptuniumBlock,
            NTechBlocks.moxFuelBlock,
            NTechBlocks.redCopperBlock,
            NTechBlocks.advancedAlloyBlock,
            NTechBlocks.cobaltBlock,
            NTechBlocks.steelBlock,
            NTechBlocks.electricalScrapBlock,
            NTechBlocks.trinititeBlock,
            NTechBlocks.nuclearWasteBlock,
            NTechBlocks.euphemiumBlock,
            NTechBlocks.schrabidiumCluster, NTechBlocks.euphemiumEtchedSchrabidiumCluster,
            NTechBlocks.magnetizedTungstenBlock,
            NTechBlocks.combineSteelBlock,
            NTechBlocks.deshReinforcedBlock,
            NTechBlocks.titaniumDecoBlock, NTechBlocks.redCopperDecoBlock, NTechBlocks.tungstenDecoBlock, NTechBlocks.aluminiumDecoBlock, NTechBlocks.steelDecoBlock, NTechBlocks.leadDecoBlock, NTechBlocks.berylliumDecoBlock,
            NTechBlocks.asbestosRoof,
            NTechBlocks.meteorite,
            NTechBlocks.meteoriteCobblestone,
            NTechBlocks.brokenMeteorite,
            NTechBlocks.hotMeteoriteCobblestone,
            NTechBlocks.meteoriteTreasure,
            NTechBlocks.steelBeam,
            NTechBlocks.steelScaffold,
            NTechBlocks.steelGrate,
            NTechBlocks.slakedSellafite, NTechBlocks.sellafite, NTechBlocks.hotSellafite, NTechBlocks.boilingSellafite, NTechBlocks.blazingSellafite, NTechBlocks.infernalSellafite, NTechBlocks.sellafiteCorium,
            NTechBlocks.corium, NTechBlocks.corebblestone,
            NTechBlocks.siren,
            NTechBlocks.safe,
            NTechBlocks.steamPressBase, NTechBlocks.steamPressFrame, NTechBlocks.steamPressFrame, NTechBlocks.blastFurnace,
            NTechBlocks.combustionGenerator,
            NTechBlocks.electricFurnace,
            NTechBlocks.shredder,
            NTechBlocks.ironAnvil, NTechBlocks.leadAnvil, NTechBlocks.steelAnvil, NTechBlocks.meteoriteAnvil, NTechBlocks.starmetalAnvil, NTechBlocks.ferrouraniumAnvil, NTechBlocks.bismuthAnvil, NTechBlocks.schrabidateAnvil, NTechBlocks.dineutroniumAnvil, NTechBlocks.murkyAnvil,
            NTechBlocks.rbmkColumn,
            NTechBlocks.rbmkRod, NTechBlocks.rbmkModeratedRod, NTechBlocks.rbmkReaSimRod, NTechBlocks.rbmkModeratedReaSimRod,
            NTechBlocks.rbmkReflector, NTechBlocks.rbmkModerator, NTechBlocks.rbmkAbsorber,
            NTechBlocks.rbmkBoilerColumn, NTechBlocks.rbmkBoiler,
            NTechBlocks.rbmkBlank,
            NTechBlocks.rbmkManualControlRod, NTechBlocks.rbmkModeratedControlRod, NTechBlocks.rbmkAutoControlRod,
            NTechBlocks.rbmkInlet, NTechBlocks.rbmkOutlet,
            NTechBlocks.rbmkConsole,
            NTechBlocks.rbmkDebris, NTechBlocks.rbmkBurningDebris, NTechBlocks.rbmkRadioactiveDebris,
            NTechBlocks.coatedCable,
            NTechBlocks.coatedUniversalFluidDuct,
            NTechBlocks.assembler,
            NTechBlocks.chemPlant,
            NTechBlocks.oilRefinery,
            NTechBlocks.turbine,
            NTechBlocks.smallCoolingTower, NTechBlocks.largeCoolingTower,
            NTechBlocks.oilDerrick,
            NTechBlocks.pumpjack,
            NTechBlocks.centrifuge,
            NTechBlocks.littleBoy, NTechBlocks.fatMan,
            NTechBlocks.genericMultiBlockPart, NTechBlocks.genericMultiBlockPort,
            NTechBlocks.oilPipe,
            NTechBlocks.decoRbmkBlock,
            NTechBlocks.decoRbmkSmoothBlock,
        )
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
            NTechBlocks.oilSand,
            NTechBlocks.whitePhosphorusBlock,
            NTechBlocks.redPhosphorusBlock,
            NTechBlocks.yellowcakeBlock,
            NTechBlocks.scrapBlock,
            NTechBlocks.deadGrass,
            NTechBlocks.glowingMycelium,
            NTechBlocks.trinitite,
            NTechBlocks.redTrinitite,
        )
        tag(BlockTags.MINEABLE_WITH_AXE).add(
            NTechBlocks.insulatorRoll,
            NTechBlocks.fiberglassRoll,
            NTechBlocks.hazmatBlock,
            NTechBlocks.glowingMushroomBlock,
            NTechBlocks.glowingMushroomStem,
            NTechBlocks.charredLog,
            NTechBlocks.charredPlanks,
        )
    }

    private fun materialLevel() {
        tag(Tags.Blocks.NEEDS_WOOD_TOOL).add(
            NTechBlocks.ligniteOre,
            NTechBlocks.whitePhosphorusBlock,
            NTechBlocks.redPhosphorusBlock,
        )
        tag(BlockTags.NEEDS_STONE_TOOL).add(
            NTechBlocks.sulfurOre, NTechBlocks.deepslateSulfurOre, NTechBlocks.netherSulfurOre, NTechBlocks.sulfurBlock,
            NTechBlocks.niterOre, NTechBlocks.deepslateNiterOre, NTechBlocks.niterBlock,
            NTechBlocks.aluminiumOre, NTechBlocks.deepslateAluminiumOre, NTechBlocks.aluminiumBlock,
            NTechBlocks.fluoriteOre, NTechBlocks.deepslateFluoriteOre, NTechBlocks.fluoriteBlock,
            NTechBlocks.netherPhosphorusOre,
            NTechBlocks.oilDeposit, NTechBlocks.emptyOilDeposit, NTechBlocks.deepslateOilDeposit, NTechBlocks.emptyDeepslateOilDeposit,
            NTechBlocks.basaltSulfurOre, NTechBlocks.basaltFluoriteOre, NTechBlocks.basaltAsbestosOre,
            NTechBlocks.redCopperBlock,
            NTechBlocks.lithiumBlock,
            NTechBlocks.electricalScrapBlock,
            NTechBlocks.trinititeBlock,
            NTechBlocks.nuclearWasteBlock,
            NTechBlocks.titaniumDecoBlock, NTechBlocks.redCopperDecoBlock, NTechBlocks.tungstenDecoBlock, NTechBlocks.aluminiumDecoBlock, NTechBlocks.steelDecoBlock, NTechBlocks.leadDecoBlock, NTechBlocks.berylliumDecoBlock,
            NTechBlocks.asbestosRoof,
            NTechBlocks.steelBeam,
            NTechBlocks.steelScaffold,
            NTechBlocks.steelGrate,
            NTechBlocks.slakedSellafite, NTechBlocks.sellafite, NTechBlocks.hotSellafite, NTechBlocks.boilingSellafite, NTechBlocks.blazingSellafite, NTechBlocks.infernalSellafite, NTechBlocks.sellafiteCorium,
            NTechBlocks.siren,
            NTechBlocks.safe,
            NTechBlocks.steamPressBase, NTechBlocks.steamPressFrame, NTechBlocks.steamPressTop,
            NTechBlocks.blastFurnace,
            NTechBlocks.combustionGenerator,
            NTechBlocks.electricFurnace,
            NTechBlocks.shredder,
            NTechBlocks.ironAnvil,
            NTechBlocks.leadAnvil,
            NTechBlocks.rbmkColumn,
            NTechBlocks.rbmkRod, NTechBlocks.rbmkModeratedRod, NTechBlocks.rbmkReaSimRod, NTechBlocks.rbmkModeratedReaSimRod,
            NTechBlocks.rbmkReflector, NTechBlocks.rbmkModerator, NTechBlocks.rbmkAbsorber,
            NTechBlocks.rbmkBoilerColumn, NTechBlocks.rbmkBoiler,
            NTechBlocks.rbmkBlank,
            NTechBlocks.rbmkManualControlRod, NTechBlocks.rbmkModeratedControlRod, NTechBlocks.rbmkAutoControlRod,
            NTechBlocks.rbmkInlet, NTechBlocks.rbmkOutlet,
            NTechBlocks.rbmkConsole,
            NTechBlocks.rbmkDebris, NTechBlocks.rbmkBurningDebris, NTechBlocks.rbmkRadioactiveDebris,
            NTechBlocks.coatedCable,
            NTechBlocks.coatedUniversalFluidDuct,
            NTechBlocks.assembler,
            NTechBlocks.chemPlant,
            NTechBlocks.oilRefinery,
            NTechBlocks.turbine,
            NTechBlocks.oilDerrick,
            NTechBlocks.pumpjack,
            NTechBlocks.centrifuge,
            NTechBlocks.genericMultiBlockPart, NTechBlocks.genericMultiBlockPort,
            NTechBlocks.oilPipe,
        )
        tag(BlockTags.NEEDS_IRON_TOOL).add(
            NTechBlocks.uraniumOre, NTechBlocks.deepslateUraniumOre, NTechBlocks.uraniumBlock, NTechBlocks.u233Block, NTechBlocks.u235Block, NTechBlocks.u238Block, NTechBlocks.uraniumFuelBlock,
            NTechBlocks.scorchedUraniumOre, NTechBlocks.scorchedDeepslateUraniumOre,
            NTechBlocks.netherPlutoniumOre, NTechBlocks.plutoniumBlock, NTechBlocks.pu238Block, NTechBlocks.pu239Block, NTechBlocks.pu240Block, NTechBlocks.plutoniumFuelBlock,
            NTechBlocks.thoriumOre, NTechBlocks.deepslateThoriumOre, NTechBlocks.thoriumBlock, NTechBlocks.thoriumFuelBlock,
            NTechBlocks.titaniumOre, NTechBlocks.deepslateTitaniumOre, NTechBlocks.titaniumBlock,
            NTechBlocks.tungstenOre, NTechBlocks.deepslateTungstenOre, NTechBlocks.netherTungstenOre, NTechBlocks.tungstenBlock,
            NTechBlocks.berylliumOre, NTechBlocks.deepslateBerylliumOre, NTechBlocks.berylliumBlock,
            NTechBlocks.cobaltBlock,
            NTechBlocks.leadOre, NTechBlocks.deepslateLeadOre,
            NTechBlocks.asbestosOre, NTechBlocks.deepslateAsbestosOre,
            NTechBlocks.rareEarthOre, NTechBlocks.deepslateRareEarthOre,
            NTechBlocks.cobaltOre, NTechBlocks.deepslateCobaltOre,
            NTechBlocks.trixite,
            NTechBlocks.basaltVolcanicGemOre,
            NTechBlocks.neptuniumBlock,
            NTechBlocks.moxFuelBlock,
            NTechBlocks.advancedAlloyBlock,
            NTechBlocks.steelBlock,
            NTechBlocks.asbestosBlock,
            NTechBlocks.corium, NTechBlocks.corebblestone,
            NTechBlocks.steelAnvil,
            NTechBlocks.decoRbmkBlock,
            NTechBlocks.decoRbmkSmoothBlock,
        )
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
            NTechBlocks.australianOre, NTechBlocks.deepslateAustralianOre, NTechBlocks.australiumBlock,
            NTechBlocks.weidite, NTechBlocks.weidaniumBlock,
            NTechBlocks.reiite, NTechBlocks.reiiumBlock,
            NTechBlocks.brightblendeOre, NTechBlocks.unobtainiumBlock,
            NTechBlocks.dellite, NTechBlocks.daffergonBlock,
            NTechBlocks.dollarGreenMineral, NTechBlocks.verticiumBlock,
            NTechBlocks.meteorUraniumOre,
            NTechBlocks.meteorThoriumOre,
            NTechBlocks.meteorTitaniumOre,
            NTechBlocks.meteorSulfurOre,
            NTechBlocks.meteorCopperOre,
            NTechBlocks.meteorTungstenOre,
            NTechBlocks.meteorAluminiumOre,
            NTechBlocks.meteorLeadOre,
            NTechBlocks.meteorLithiumOre,
            NTechBlocks.starmetalOre, NTechBlocks.starmetalBlock,
            NTechBlocks.magnetizedTungstenBlock,
            NTechBlocks.combineSteelBlock,
            NTechBlocks.deshReinforcedBlock,
            NTechBlocks.meteorite,
            NTechBlocks.meteoriteCobblestone,
            NTechBlocks.brokenMeteorite,
            NTechBlocks.hotMeteoriteCobblestone,
            NTechBlocks.meteoriteTreasure,
            NTechBlocks.meteoriteAnvil,
            NTechBlocks.starmetalAnvil,
            NTechBlocks.ferrouraniumAnvil,
            NTechBlocks.bismuthAnvil,
        )
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(
            NTechBlocks.schrabidiumOre, NTechBlocks.deepslateSchrabidiumOre, NTechBlocks.netherSchrabidiumOre, NTechBlocks.schrabidiumBlock,
            NTechBlocks.euphemiumBlock,
            NTechBlocks.schrabidiumCluster, NTechBlocks.euphemiumEtchedSchrabidiumCluster,
            NTechBlocks.schrabidateAnvil,
            NTechBlocks.dineutroniumAnvil,
            NTechBlocks.murkyAnvil,
        )
    }
}
