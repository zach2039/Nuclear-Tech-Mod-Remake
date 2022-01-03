package at.martinthedragon.nucleartech

import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraftforge.common.Tags

// look up forge tags here: https://github.com/Dente222/Minecraft-Forge-Tag-List
object NuclearTags {
    object Blocks {
        private fun tag(name: String): Tags.IOptionalNamedTag<Block> =
            BlockTags.createOptional(ntm(name))
        private fun forgeTag(name: String): Tags.IOptionalNamedTag<Block> =
            BlockTags.createOptional(ResourceLocation("forge", name))

        val ORES_URANIUM = forgeTag("ores/uranium")
        val ORES_THORIUM = forgeTag("ores/thorium")
        val ORES_PLUTONIUM = forgeTag("ores/plutonium")
        val ORES_TITANIUM = forgeTag("ores/titanium")
        val ORES_SULFUR = forgeTag("ores/sulfur")
        val ORES_NITER = forgeTag("ores/salpeter")
        val ORES_TUNGSTEN = forgeTag("ores/tungsten")
        val ORES_ALUMINIUM = forgeTag("ores/aluminium")
        val ORES_FLUORITE = forgeTag("ores/fluorite")
        val ORES_BERYLLIUM = forgeTag("ores/beryllium")
        val ORES_LEAD = forgeTag("ores/lead")
        val ORES_OIL = forgeTag("ores/oil")
        val ORES_LIGNITE = forgeTag("ores/lignite")
        val ORES_ASBESTOS = forgeTag("ores/asbestos")
        val ORES_RARE_EARTH = forgeTag("ores/rare_earth")

        val ORES_TRINITITE = forgeTag("ores/trinitite")

        val STORAGE_BLOCKS_URANIUM = forgeTag("storage_blocks/uranium")
        val STORAGE_BLOCKS_NEPTUNIUM = forgeTag("storage_blocks/neptunium")
        val STORAGE_BLOCKS_MOX = forgeTag("storage_blocks/mox")
        val STORAGE_BLOCKS_PLUTONIUM = forgeTag("storage_blocks/plutonium")
        val STORAGE_BLOCKS_THORIUM = forgeTag("storage_blocks/thorium")
        val STORAGE_BLOCKS_TITANIUM = forgeTag("storage_blocks/titanium")
        val STORAGE_BLOCKS_SULFUR = forgeTag("storage_blocks/sulfur")
        val STORAGE_BLOCKS_NITER = forgeTag("storage_blocks/salpeter")
        val STORAGE_BLOCKS_COPPER = forgeTag("storage_blocks/copper")
        val STORAGE_BLOCKS_TUNGSTEN = forgeTag("storage_blocks/tungsten")
        val STORAGE_BLOCKS_ALUMINIUM = forgeTag("storage_blocks/aluminium")
        val STORAGE_BLOCKS_FLUORITE = forgeTag("storage_blocks/fluorite")
        val STORAGE_BLOCKS_BERYLLIUM = forgeTag("storage_blocks/beryllium")
        val STORAGE_BLOCKS_COBALT = forgeTag("storage_blocks/cobalt")
        val STORAGE_BLOCKS_STEEL = forgeTag("storage_blocks/steel")
        val STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead")
        val STORAGE_BLOCKS_LITHIUM = forgeTag("storage_blocks/lithium")
        val STORAGE_BLOCKS_PHOSPHORUS = forgeTag("storage_blocks/phosphorus")
        val STORAGE_BLOCKS_YELLOWCAKE = forgeTag("storage_blocks/yellow_cake_uranium")
        val STORAGE_BLOCKS_SCRAP = forgeTag("storage_blocks/scrap")
        val STORAGE_BLOCK_ASBESTOS = forgeTag("storage_blocks/asbestos")
        val STORAGE_BLOCK_NUCLEAR_WASTE = forgeTag("storage_blocks/nuclear_waste")

        val SAND_OIL = forgeTag("sand/oil")
        val GLOWING_MUSHROOM_GROW_BLOCK = tag("glowing_mushroom_grow_block")
        val GLOWING_MYCELIUM_SPREADABLE = tag("glowing_mycelium_spreadable")

        val ANVIL = tag("anvil")
    }

    object Items {
        private fun tag(name: String): Tags.IOptionalNamedTag<Item> =
            ItemTags.createOptional(ntm(name))
        private fun forgeTag(name: String): Tags.IOptionalNamedTag<Item> =
            ItemTags.createOptional(ResourceLocation("forge", name))

        // blocks
        val ORES_URANIUM = forgeTag("ores/uranium")
        val ORES_THORIUM = forgeTag("ores/thorium")
        val ORES_PLUTONIUM = forgeTag("ores/plutonium")
        val ORES_TITANIUM = forgeTag("ores/titanium")
        val ORES_SULFUR = forgeTag("ores/sulfur")
        val ORES_NITER = forgeTag("ores/salpeter")
        val ORES_TUNGSTEN = forgeTag("ores/tungsten")
        val ORES_ALUMINIUM = forgeTag("ores/aluminium")
        val ORES_FLUORITE = forgeTag("ores/fluorite")
        val ORES_BERYLLIUM = forgeTag("ores/beryllium")
        val ORES_LEAD = forgeTag("ores/lead")
        val ORES_OIL = forgeTag("ores/oil")
        val ORES_LIGNITE = forgeTag("ores/lignite")
        val ORES_ASBESTOS = forgeTag("ores/asbestos")
        val ORES_RARE_EARTH = forgeTag("ores/rare_earth")

        val ORES_TRINITITE = forgeTag("ores/trinitite")

        val STORAGE_BLOCKS_URANIUM = forgeTag("storage_blocks/uranium")
        val STORAGE_BLOCKS_NEPTUNIUM = forgeTag("storage_blocks/neptunium")
        val STORAGE_BLOCKS_MOX = forgeTag("storage_blocks/mox")
        val STORAGE_BLOCKS_PLUTONIUM = forgeTag("storage_blocks/plutonium")
        val STORAGE_BLOCKS_THORIUM = forgeTag("storage_blocks/thorium")
        val STORAGE_BLOCKS_TITANIUM = forgeTag("storage_blocks/titanium")
        val STORAGE_BLOCKS_SULFUR = forgeTag("storage_blocks/sulfur")
        val STORAGE_BLOCKS_NITER = forgeTag("storage_blocks/salpeter")
        val STORAGE_BLOCKS_COPPER = forgeTag("storage_blocks/copper")
        val STORAGE_BLOCKS_TUNGSTEN = forgeTag("storage_blocks/tungsten")
        val STORAGE_BLOCKS_ALUMINIUM = forgeTag("storage_blocks/aluminium")
        val STORAGE_BLOCKS_FLUORITE = forgeTag("storage_blocks/fluorite")
        val STORAGE_BLOCKS_BERYLLIUM = forgeTag("storage_blocks/beryllium")
        val STORAGE_BLOCKS_COBALT = forgeTag("storage_blocks/cobalt")
        val STORAGE_BLOCKS_STEEL = forgeTag("storage_blocks/steel")
        val STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead")
        val STORAGE_BLOCKS_LITHIUM = forgeTag("storage_blocks/lithium")
        val STORAGE_BLOCKS_PHOSPHORUS = forgeTag("storage_blocks/phosphorus")
        val STORAGE_BLOCKS_YELLOWCAKE = forgeTag("storage_blocks/yellow_cake_uranium")
        val STORAGE_BLOCKS_SCRAP = forgeTag("storage_blocks/scrap")
        val STORAGE_BLOCK_ASBESTOS = forgeTag("storage_blocks/asbestos")
        val STORAGE_BLOCK_NUCLEAR_WASTE = forgeTag("storage_blocks/nuclear_waste")

        val SAND_OIL = forgeTag("sand/oil")
        val GLOWING_MUSHROOM_GROW_BLOCK = tag("glowing_mushroom_grow_block")

        val ANVIL = tag("anvil")

        // actualItems
        val INGOTS_URANIUM = forgeTag("ingots/uranium")
        val INGOTS_THORIUM = forgeTag("ingots/thorium")
        val INGOTS_PLUTONIUM = forgeTag("ingots/plutonium")
        val INGOTS_NEPTUNIUM = forgeTag("ingots/neptunium")
        val INGOTS_POLONIUM = forgeTag("ingots/polonium")
        val INGOTS_TITANIUM = forgeTag("ingots/titanium")
        val INGOTS_COPPER = forgeTag("ingots/copper")
        val INGOTS_TUNGSTEN = forgeTag("ingots/tungsten")
        val INGOTS_ALUMINIUM = forgeTag("ingots/aluminium")
        val INGOTS_STEEL = forgeTag("ingots/steel")
        val INGOTS_LEAD = forgeTag("ingots/lead")
        val INGOTS_BERYLLIUM = forgeTag("ingots/beryllium")
        val INGOTS_COBALT = forgeTag("ingots/cobalt")
        val INGOTS_POLYMER = forgeTag("ingots/polymer")
        val INGOTS_LANTHANUM = forgeTag("ingots/lanthanum")
        val INGOTS_ACTINIUM = forgeTag("ingots/actinium")
        val INGOTS_STARMETAL = forgeTag("ingots/starmetal")
        val INGOTS_PHOSPHORUS = forgeTag("ingots/phosphorus")
        val INGOTS_LITHIUM = forgeTag("ingots/lithium")

        val COKE = forgeTag("coal_coke")

        val DUSTS_SULFUR = forgeTag("dusts/sulfur")
        val DUSTS_NITER = forgeTag("dusts/salpeter")
        val DUSTS_FLUORITE = forgeTag("dusts/fluorite")
        val DUSTS_COAL = forgeTag("dusts/coal")
        val DUSTS_IRON = forgeTag("dusts/iron")
        val DUSTS_GOLD = forgeTag("dusts/gold")
        val DUSTS_LAPIS = forgeTag("dusts/lapis")
        val DUSTS_QUARTZ = forgeTag("dusts/quartz")
        val DUSTS_DIAMOND = forgeTag("dusts/diamond")
        val DUSTS_EMERALD = forgeTag("dusts/emerald")
        val DUSTS_URANIUM = forgeTag("dusts/uranium")
        val DUSTS_THORIUM = forgeTag("dusts/thorium")
        val DUSTS_PLUTONIUM = forgeTag("dusts/plutonium")
        val DUSTS_NEPTUNIUM = forgeTag("dusts/neptunium")
        val DUSTS_POLONIUM = forgeTag("dusts/polonium")
        val DUSTS_TITANIUM = forgeTag("dusts/titanium")
        val DUSTS_COPPER = forgeTag("dusts/copper")
        val DUSTS_TUNGSTEN = forgeTag("dusts/tungsten")
        val DUSTS_ALUMINIUM = forgeTag("dusts/aluminium")
        val DUSTS_STEEL = forgeTag("dusts/steel")
        val DUSTS_LEAD = forgeTag("dusts/lead")
        val DUSTS_BERYLLIUM = forgeTag("dusts/beryllium")
        val DUSTS_POLYMER = forgeTag("dusts/polymer")
        val DUSTS_LITHIUM = forgeTag("dusts/lithium")
        val DUSTS_NEODYMIUM = forgeTag("dusts/neodymium")
        val DUSTS_COBALT = forgeTag("dusts/cobalt")
        val DUSTS_NIOBIUM = forgeTag("dusts/niobium")
        val DUSTS_CERIUM = forgeTag("dusts/cerium")
        val DUSTS_LANTHANUM = forgeTag("dusts/lanthanum")
        val DUSTS_ACTINIUM = forgeTag("dusts/actinium")
        val DUSTS_ASBESTOS = forgeTag("dusts/asbestos")
        val DUSTS_ENCHANTMENT = forgeTag("dusts/enchantment")
        val DUSTS_METEORITE = forgeTag("dusts/meteorite")
        val DUSTS_DUST = forgeTag("dusts/dust")
        val DUSTS_PHOSPHORUS = forgeTag("dusts/phosphorus")
        val DUSTS_COLD = forgeTag("dusts/cold")
        val DUSTS_POISON = forgeTag("dusts/poison")
        val DUSTS_THERMITE = forgeTag("dusts/thermite")
        val DUSTS_ENERGY = forgeTag("dusts/energy")
        val DUSTS_CORDITE = forgeTag("dusts/cordite")
        val DUSTS_BALLISTITE = forgeTag("dusts/ballistite")

        // from Mekanism
        val YELLOWCAKE_URANIUM = forgeTag("yellow_cake_uranium")

        // crystals
        val GEMS_IRON = forgeTag("gems/iron")
        val GEMS_GOLD = forgeTag("gems/gold")
        val GEMS_REDSTONE = forgeTag("gems/redstone")
        val GEMS_DIAMOND = forgeTag("gems/diamond")
        val GEMS_URANIUM = forgeTag("gems/uranium")
        val GEMS_THORIUM = forgeTag("gems/thorium")
        val GEMS_PLUTONIUM = forgeTag("gems/plutonium")
        val GEMS_TITANIUM = forgeTag("gems/titanium")
        val GEMS_SULFUR = forgeTag("gems/sulfur")
        val GEMS_NITER = forgeTag("gems/salpeter")
        val GEMS_COPPER = forgeTag("gems/copper")
        val GEMS_TUNGSTEN = forgeTag("gems/tungsten")
        val GEMS_ALUMINIUM = forgeTag("gems/aluminium")
        val GEMS_FLUORITE = forgeTag("gems/fluorite")
        val GEMS_BERYLLIUM = forgeTag("gems/beryllium")
        val GEMS_LEAD = forgeTag("gems/lead")
        val GEMS_RARE_EARTH = forgeTag("gems/rare_earth")
        val GEMS_PHOSPHORUS = forgeTag("gems/phosphorus")
        val GEMS_LITHIUM = forgeTag("gems/lithium")
        val GEMS_STARMETAL = forgeTag("gems/starmetal")
        val GEMS_TRIXITE = forgeTag("gems/trixite")

        val GEMS_NEODYMIUM = forgeTag("gems/neodymium")
        val GEMS_COBALT = forgeTag("gems/cobalt")
        val GEMS_NIOBIUM = forgeTag("gems/niobium")
        val GEMS_CERIUM = forgeTag("gems/cerium")
        val GEMS_LANTHANUM = forgeTag("gems/lanthanum")
        val GEMS_ACTINIUM = forgeTag("gems/actinium")

        val ORE_CRYSTALS = tag("ore_crystals")
        val RARE_EARTH_FRAGMENTS = tag("rare_earth_fragments")

        val BIOMASS = forgeTag("biomass")
        val COMPRESSED_BIOMASS = forgeTag("biomass/compressed")

        val NUGGETS_URANIUM = forgeTag("nuggets/uranium")
        val NUGGETS_THORIUM = forgeTag("nuggets/thorium")
        val NUGGETS_PLUTONIUM = forgeTag("nuggets/plutonium")
        val NUGGETS_NEPTUNIUM = forgeTag("nuggets/neptunium")
        val NUGGETS_POLONIUM = forgeTag("nuggets/polonium")
        val NUGGETS_LEAD = forgeTag("nuggets/lead")
        val NUGGETS_BERYLLIUM = forgeTag("nuggets/beryllium")
        val NUGGETS_MERCURY = forgeTag("nuggets/mercury")

        val PLATES = forgeTag("plates")
        val PLATES_IRON = forgeTag("plates/iron")
        val PLATES_GOLD = forgeTag("plates/gold")
        val PLATES_TITANIUM = forgeTag("plates/titanium")
        val PLATES_ALUMINIUM = forgeTag("plates/aluminium")
        val PLATES_STEEL = forgeTag("plates/steel")
        val PLATES_LEAD = forgeTag("plates/lead")
        val PLATES_COPPER = forgeTag("plates/copper")
        val PLATES_NEUTRON_REFLECTOR = forgeTag("plates/neutron_reflector")
        val PLATES_INSULATOR = forgeTag("plates/insulator")
        val PLATES_KEVLAR = forgeTag("plates/kevlar")

        val BOLTS = forgeTag("bolts")
        val BOLTS_TUNGSTEN = forgeTag("bolts/tungsten")

        val FABRIC_HAZMAT = forgeTag("fabric_hazmat")

        val FILTERS = forgeTag("filters")
        val FILTERS_CARBON = forgeTag("filters/carbon")

        val WIRES = forgeTag("wires")
        val WIRES_ALUMINIUM = forgeTag("wires/aluminium")
        val WIRES_COPPER = forgeTag("wires/copper")
        val WIRES_TUNGSTEN = forgeTag("wires/tungsten")
        val WIRES_SUPER_CONDUCTOR = forgeTag("wires/super_conductor")
        val WIRES_GOLD = forgeTag("wires/gold")

        val COILS = forgeTag("coils")
        val COILS_COPPER = forgeTag("coils/copper")
        val COILS_SUPER_CONDUCTOR = forgeTag("coils/super_conductor")
        val COILS_GOLD = forgeTag("coils/gold")

        val FISSILE_FUELS = forgeTag("fissile_fuels")
        val FISSILE_FUELS_URANIUM = forgeTag("fissile_fuels/uranium")
        val FISSILE_FUELS_THORIUM = forgeTag("fissile_fuels/thorium")
        val FISSILE_FUELS_PLUTONIUM = forgeTag("fissile_fuels/plutonium")
        val FISSILE_FUELS_MOX = forgeTag("fissile_fuels/mox")

        val SCRAP = forgeTag("scrap")
        val NUCLEAR_WASTE = forgeTag("nuclear_waste")

        val WASTES = forgeTag("wastes")
        val WASTES_SCRAP = forgeTag("wastes/scrap")
        val WASTES_NUCLEAR_WASTE = forgeTag("wastes/nuclear_waste")
        val WASTES_HOT_URANIUM = forgeTag("wastes/hot_uranium")
        val WASTES_HOT_THORIUM = forgeTag("wastes/hot_thorium")
        val WASTES_HOT_PLUTONIUM = forgeTag("wastes/hot_plutonium")
        val WASTES_HOT_MOX = forgeTag("wastes/hot_mox")
        val WASTES_URANIUM = forgeTag("wastes/uranium")
        val WASTES_THORIUM = forgeTag("wastes/thorium")
        val WASTES_PLUTONIUM = forgeTag("wastes/plutonium")
        val WASTES_MOX = forgeTag("wastes/mox")

        val HOT_WASTES = tag("hot_wastes")
        val COLD_WASTES = tag("cold_wastes")

        val MACHINE_TEMPLATE_FOLDER_RESULTS = tag("machine_template_folder_results")
        val STAMPS = tag("stamps")
        val FOLDER_STAMPS = tag("stamps/template_folder")
        val FLAT_STAMPS = tag("stamps/flat")
        val PLATE_STAMPS = tag("stamps/plate")
        val WIRE_STAMPS = tag("stamps/wire")
        val CIRCUIT_STAMPS = tag("stamps/circuit")
        val STONE_STAMPS = tag("stamps/stone")
        val IRON_STAMPS = tag("stamps/iron")
        val STEEL_STAMPS = tag("stamps/steel")
        val TITANIUM_STAMPS = tag("stamps/titanium")
        val OBSIDIAN_STAMPS = tag("stamps/obsidian")
        val SCHRABIDIUM_STAMPS = tag("stamps/schrabidium")
        val SIREN_TRACKS = tag("siren_tracks")

        val SHREDDER_BLADES = tag("shredder_blades")
    }
}
