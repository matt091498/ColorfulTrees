package com.example.colortrees.datagen;

import com.example.colortrees.setup.Registration;

import net.minecraft.data.DataGenerator;

public class CTLootTables extends BaseLootTableProvider {

    public CTLootTables(DataGenerator generator) {
        super(generator);
    }
    
    @Override
    protected void addTables() {

        // Loot tables for Colored Oak Logs
        lootTables.put(Registration.BLACK_OAK_LOG.get(), createSimpleTable("black_oak_log", Registration.BLACK_OAK_LOG.get()));
        lootTables.put(Registration.RED_OAK_LOG.get(), createSimpleTable("red_oak_log", Registration.RED_OAK_LOG.get()));
        lootTables.put(Registration.GREEN_OAK_LOG.get(), createSimpleTable("green_oak_log", Registration.GREEN_OAK_LOG.get()));
        lootTables.put(Registration.BROWN_OAK_LOG.get(), createSimpleTable("brown_oak_log", Registration.BROWN_OAK_LOG.get()));
        lootTables.put(Registration.BLUE_OAK_LOG.get(), createSimpleTable("blue_oak_log", Registration.BLUE_OAK_LOG.get()));
        lootTables.put(Registration.PURPLE_OAK_LOG.get(), createSimpleTable("purple_oak_log", Registration.PURPLE_OAK_LOG.get()));
        lootTables.put(Registration.CYAN_OAK_LOG.get(), createSimpleTable("cyan_oak_log", Registration.CYAN_OAK_LOG.get()));
        lootTables.put(Registration.LIGHT_GRAY_OAK_LOG.get(), createSimpleTable("light_gray_oak_log", Registration.LIGHT_GRAY_OAK_LOG.get()));
        lootTables.put(Registration.GRAY_OAK_LOG.get(), createSimpleTable("gray_oak_log", Registration.GRAY_OAK_LOG.get()));
        lootTables.put(Registration.PINK_OAK_LOG.get(), createSimpleTable("pink_oak_log", Registration.PINK_OAK_LOG.get()));
        lootTables.put(Registration.LIME_OAK_LOG.get(), createSimpleTable("lime_oak_log", Registration.LIME_OAK_LOG.get()));
        lootTables.put(Registration.YELLOW_OAK_LOG.get(), createSimpleTable("yellow_oak_log", Registration.YELLOW_OAK_LOG.get()));
        lootTables.put(Registration.LIGHT_BLUE_OAK_LOG.get(), createSimpleTable("light_blue_oak_log", Registration.LIGHT_BLUE_OAK_LOG.get()));
        lootTables.put(Registration.MAGENTA_OAK_LOG.get(), createSimpleTable("magenta_oak_log", Registration.MAGENTA_OAK_LOG.get()));
        lootTables.put(Registration.ORANGE_OAK_LOG.get(), createSimpleTable("orange_oak_log", Registration.ORANGE_OAK_LOG.get()));
        lootTables.put(Registration.WHITE_OAK_LOG.get(), createSimpleTable("white_oak_log", Registration.WHITE_OAK_LOG.get()));

        // Loot tables for Colored Birch Logs
        lootTables.put(Registration.BLACK_BIRCH_LOG.get(), createSimpleTable("black_birch_log", Registration.BLACK_BIRCH_LOG.get()));
        lootTables.put(Registration.RED_BIRCH_LOG.get(), createSimpleTable("red_birch_log", Registration.RED_BIRCH_LOG.get()));
        lootTables.put(Registration.GREEN_BIRCH_LOG.get(), createSimpleTable("green_birch_log", Registration.GREEN_BIRCH_LOG.get()));
        lootTables.put(Registration.BROWN_BIRCH_LOG.get(), createSimpleTable("brown_birch_log", Registration.BROWN_BIRCH_LOG.get()));
        lootTables.put(Registration.BLUE_BIRCH_LOG.get(), createSimpleTable("blue_birch_log", Registration.BLUE_BIRCH_LOG.get()));
        lootTables.put(Registration.PURPLE_BIRCH_LOG.get(), createSimpleTable("purple_birch_log", Registration.PURPLE_BIRCH_LOG.get()));
        lootTables.put(Registration.CYAN_BIRCH_LOG.get(), createSimpleTable("cyan_birch_log", Registration.CYAN_BIRCH_LOG.get()));
        lootTables.put(Registration.LIGHT_GRAY_BIRCH_LOG.get(), createSimpleTable("light_gray_birch_log", Registration.LIGHT_GRAY_BIRCH_LOG.get()));
        lootTables.put(Registration.GRAY_BIRCH_LOG.get(), createSimpleTable("gray_birch_log", Registration.GRAY_BIRCH_LOG.get()));
        lootTables.put(Registration.PINK_BIRCH_LOG.get(), createSimpleTable("pink_birch_log", Registration.PINK_BIRCH_LOG.get()));
        lootTables.put(Registration.LIME_BIRCH_LOG.get(), createSimpleTable("lime_birch_log", Registration.LIME_BIRCH_LOG.get()));
        lootTables.put(Registration.YELLOW_BIRCH_LOG.get(), createSimpleTable("yellow_birch_log", Registration.YELLOW_BIRCH_LOG.get()));
        lootTables.put(Registration.LIGHT_BLUE_BIRCH_LOG.get(), createSimpleTable("light_blue_birch_log", Registration.LIGHT_BLUE_BIRCH_LOG.get()));
        lootTables.put(Registration.MAGENTA_BIRCH_LOG.get(), createSimpleTable("magenta_birch_log", Registration.MAGENTA_BIRCH_LOG.get()));
        lootTables.put(Registration.ORANGE_BIRCH_LOG.get(), createSimpleTable("orange_birch_log", Registration.ORANGE_BIRCH_LOG.get()));
        lootTables.put(Registration.WHITE_BIRCH_LOG.get(), createSimpleTable("white_birch_log", Registration.WHITE_BIRCH_LOG.get()));

        // Loot tables for Colored Planks
        lootTables.put(Registration.BLACK_PLANKS.get(), createSimpleTable("black_oak_planks", Registration.BLACK_PLANKS.get()));
        lootTables.put(Registration.RED_PLANKS.get(), createSimpleTable("red_oak_planks", Registration.RED_PLANKS.get()));
        lootTables.put(Registration.GREEN_PLANKS.get(), createSimpleTable("green_oak_planks", Registration.GREEN_PLANKS.get()));
        lootTables.put(Registration.BROWN_PLANKS.get(), createSimpleTable("brown_oak_planks", Registration.BROWN_PLANKS.get()));
        lootTables.put(Registration.BLUE_PLANKS.get(), createSimpleTable("blue_oak_planks", Registration.BLUE_PLANKS.get()));
        lootTables.put(Registration.PURPLE_PLANKS.get(), createSimpleTable("purple_oak_planks", Registration.PURPLE_PLANKS.get()));
        lootTables.put(Registration.CYAN_PLANKS.get(), createSimpleTable("cyan_oak_planks", Registration.CYAN_PLANKS.get()));
        lootTables.put(Registration.LIGHT_GRAY_PLANKS.get(), createSimpleTable("light_gray_oak_planks", Registration.LIGHT_GRAY_PLANKS.get()));
        lootTables.put(Registration.GRAY_PLANKS.get(), createSimpleTable("gray_oak_planks", Registration.GRAY_PLANKS.get()));
        lootTables.put(Registration.PINK_PLANKS.get(), createSimpleTable("pink_oak_planks", Registration.PINK_PLANKS.get()));
        lootTables.put(Registration.LIME_PLANKS.get(), createSimpleTable("lime_oak_planks", Registration.LIME_PLANKS.get()));
        lootTables.put(Registration.YELLOW_PLANKS.get(), createSimpleTable("yellow_oak_planks", Registration.YELLOW_PLANKS.get()));
        lootTables.put(Registration.LIGHT_BLUE_PLANKS.get(), createSimpleTable("light_blue_oak_planks", Registration.LIGHT_BLUE_PLANKS.get()));
        lootTables.put(Registration.MAGENTA_PLANKS.get(), createSimpleTable("magenta_oak_planks", Registration.MAGENTA_PLANKS.get()));
        lootTables.put(Registration.ORANGE_PLANKS.get(), createSimpleTable("orange_oak_planks", Registration.ORANGE_PLANKS.get()));
        lootTables.put(Registration.WHITE_PLANKS.get(), createSimpleTable("white_oak_planks", Registration.WHITE_PLANKS.get()));

        // Loot tables for Colored Leaves
        lootTables.put(Registration.BLACK_OAK_LEAVES.get(), createSimpleTable("black_oak_leaves", Registration.BLACK_OAK_LEAVES.get()));
        lootTables.put(Registration.RED_OAK_LEAVES.get(), createSimpleTable("red_oak_leaves", Registration.RED_OAK_LEAVES.get()));
        lootTables.put(Registration.GREEN_OAK_LEAVES.get(), createSimpleTable("green_oak_leaves", Registration.GREEN_OAK_LEAVES.get()));
        lootTables.put(Registration.BROWN_OAK_LEAVES.get(), createSimpleTable("brown_oak_leaves", Registration.BROWN_OAK_LEAVES.get()));
        lootTables.put(Registration.BLUE_OAK_LEAVES.get(), createSimpleTable("blue_oak_leaves", Registration.BLUE_OAK_LEAVES.get()));
        lootTables.put(Registration.PURPLE_OAK_LEAVES.get(), createSimpleTable("purple_oak_leaves", Registration.PURPLE_OAK_LEAVES.get()));
        lootTables.put(Registration.CYAN_OAK_LEAVES.get(), createSimpleTable("cyan_oak_leaves", Registration.CYAN_OAK_LEAVES.get()));
        lootTables.put(Registration.LIGHT_GRAY_OAK_LEAVES.get(), createSimpleTable("light_gray_oak_leaves", Registration.LIGHT_GRAY_OAK_LEAVES.get()));
        lootTables.put(Registration.GRAY_OAK_LEAVES.get(), createSimpleTable("gray_oak_leaves", Registration.GRAY_OAK_LEAVES.get()));
        lootTables.put(Registration.PINK_OAK_LEAVES.get(), createSimpleTable("pink_oak_leaves", Registration.PINK_OAK_LEAVES.get()));
        lootTables.put(Registration.LIME_OAK_LEAVES.get(), createSimpleTable("lime_oak_leaves", Registration.LIME_OAK_LEAVES.get()));
        lootTables.put(Registration.YELLOW_OAK_LEAVES.get(), createSimpleTable("yellow_oak_leaves", Registration.YELLOW_OAK_LEAVES.get()));
        lootTables.put(Registration.LIGHT_BLUE_OAK_LEAVES.get(), createSimpleTable("light_blue_oak_leaves", Registration.LIGHT_BLUE_OAK_LEAVES.get()));
        lootTables.put(Registration.MAGENTA_OAK_LEAVES.get(), createSimpleTable("magenta_oak_leaves", Registration.MAGENTA_OAK_LEAVES.get()));
        lootTables.put(Registration.ORANGE_OAK_LEAVES.get(), createSimpleTable("orange_oak_leaves", Registration.ORANGE_OAK_LEAVES.get()));
        lootTables.put(Registration.WHITE_OAK_LEAVES.get(), createSimpleTable("white_oak_leaves", Registration.WHITE_OAK_LEAVES.get()));

        // Loot tables for Colored Stairs
        lootTables.put(Registration.BLACK_STAIRS.get(), createSimpleTable("black_stairs", Registration.BLACK_STAIRS.get()));
        lootTables.put(Registration.RED_STAIRS.get(), createSimpleTable("red_stairs", Registration.RED_STAIRS.get()));
        lootTables.put(Registration.GREEN_STAIRS.get(), createSimpleTable("green_stairs", Registration.GREEN_STAIRS.get()));
        lootTables.put(Registration.BROWN_STAIRS.get(), createSimpleTable("brown_stairs", Registration.BROWN_STAIRS.get()));
        lootTables.put(Registration.BLUE_STAIRS.get(), createSimpleTable("blue_stairs", Registration.BLUE_STAIRS.get()));
        lootTables.put(Registration.PURPLE_STAIRS.get(), createSimpleTable("purple_stairs", Registration.PURPLE_STAIRS.get()));
        lootTables.put(Registration.CYAN_STAIRS.get(), createSimpleTable("cyan_stairs", Registration.CYAN_STAIRS.get()));
        lootTables.put(Registration.LIGHT_GRAY_STAIRS.get(), createSimpleTable("light_gray_stairs", Registration.LIGHT_GRAY_STAIRS.get()));
        lootTables.put(Registration.GRAY_STAIRS.get(), createSimpleTable("gray_stairs", Registration.GRAY_STAIRS.get()));
        lootTables.put(Registration.PINK_STAIRS.get(), createSimpleTable("pink_stairs", Registration.PINK_STAIRS.get()));
        lootTables.put(Registration.LIME_STAIRS.get(), createSimpleTable("lime_stairs", Registration.LIME_STAIRS.get()));
        lootTables.put(Registration.YELLOW_STAIRS.get(), createSimpleTable("yellow_stairs", Registration.YELLOW_STAIRS.get()));
        lootTables.put(Registration.LIGHT_BLUE_STAIRS.get(), createSimpleTable("light_blue_stairs", Registration.LIGHT_BLUE_STAIRS.get()));
        lootTables.put(Registration.MAGENTA_STAIRS.get(), createSimpleTable("magenta_stairs", Registration.MAGENTA_STAIRS.get()));
        lootTables.put(Registration.ORANGE_STAIRS.get(), createSimpleTable("orange_stairs", Registration.ORANGE_STAIRS.get()));
        lootTables.put(Registration.WHITE_STAIRS.get(), createSimpleTable("white_stairs", Registration.WHITE_STAIRS.get()));
    }
}
