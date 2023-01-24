package com.example.colortrees.datagen;

import com.example.colortrees.setup.Registration;

import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.BiConsumer;

public class CTLootTables implements LootTableSubProvider {
    
    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> builder) {

        // Loot tables for Colored Oak Logs
        builder.accept(Registration.BLACK_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("black_oak_log", Registration.BLACK_OAK_LOG.get()));
        builder.accept(Registration.RED_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("red_oak_log", Registration.RED_OAK_LOG.get()));
        builder.accept(Registration.GREEN_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("green_oak_log", Registration.GREEN_OAK_LOG.get()));
        builder.accept(Registration.BROWN_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("brown_oak_log", Registration.BROWN_OAK_LOG.get()));
        builder.accept(Registration.BLUE_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("blue_oak_log", Registration.BLUE_OAK_LOG.get()));
        builder.accept(Registration.PURPLE_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("purple_oak_log", Registration.PURPLE_OAK_LOG.get()));
        builder.accept(Registration.CYAN_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("cyan_oak_log", Registration.CYAN_OAK_LOG.get()));
        builder.accept(Registration.LIGHT_GRAY_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("light_gray_oak_log", Registration.LIGHT_GRAY_OAK_LOG.get()));
        builder.accept(Registration.GRAY_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("gray_oak_log", Registration.GRAY_OAK_LOG.get()));
        builder.accept(Registration.PINK_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("pink_oak_log", Registration.PINK_OAK_LOG.get()));
        builder.accept(Registration.LIME_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("lime_oak_log", Registration.LIME_OAK_LOG.get()));
        builder.accept(Registration.YELLOW_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("yellow_oak_log", Registration.YELLOW_OAK_LOG.get()));
        builder.accept(Registration.LIGHT_BLUE_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("light_blue_oak_log", Registration.LIGHT_BLUE_OAK_LOG.get()));
        builder.accept(Registration.MAGENTA_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("magenta_oak_log", Registration.MAGENTA_OAK_LOG.get()));
        builder.accept(Registration.ORANGE_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("orange_oak_log", Registration.ORANGE_OAK_LOG.get()));
        builder.accept(Registration.WHITE_OAK_LOG.getId(), BaseLootTableProvider.createSimpleTable("white_oak_log", Registration.WHITE_OAK_LOG.get()));

        // Loot tables for Colored Birch Logs
        builder.accept(Registration.BLACK_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("black_birch_log", Registration.BLACK_BIRCH_LOG.get()));
        builder.accept(Registration.RED_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("red_birch_log", Registration.RED_BIRCH_LOG.get()));
        builder.accept(Registration.GREEN_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("green_birch_log", Registration.GREEN_BIRCH_LOG.get()));
        builder.accept(Registration.BROWN_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("brown_birch_log", Registration.BROWN_BIRCH_LOG.get()));
        builder.accept(Registration.BLUE_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("blue_birch_log", Registration.BLUE_BIRCH_LOG.get()));
        builder.accept(Registration.PURPLE_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("purple_birch_log", Registration.PURPLE_BIRCH_LOG.get()));
        builder.accept(Registration.CYAN_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("cyan_birch_log", Registration.CYAN_BIRCH_LOG.get()));
        builder.accept(Registration.LIGHT_GRAY_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("light_gray_birch_log", Registration.LIGHT_GRAY_BIRCH_LOG.get()));
        builder.accept(Registration.GRAY_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("gray_birch_log", Registration.GRAY_BIRCH_LOG.get()));
        builder.accept(Registration.PINK_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("pink_birch_log", Registration.PINK_BIRCH_LOG.get()));
        builder.accept(Registration.LIME_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("lime_birch_log", Registration.LIME_BIRCH_LOG.get()));
        builder.accept(Registration.YELLOW_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("yellow_birch_log", Registration.YELLOW_BIRCH_LOG.get()));
        builder.accept(Registration.LIGHT_BLUE_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("light_blue_birch_log", Registration.LIGHT_BLUE_BIRCH_LOG.get()));
        builder.accept(Registration.MAGENTA_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("magenta_birch_log", Registration.MAGENTA_BIRCH_LOG.get()));
        builder.accept(Registration.ORANGE_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("orange_birch_log", Registration.ORANGE_BIRCH_LOG.get()));
        builder.accept(Registration.WHITE_BIRCH_LOG.getId(), BaseLootTableProvider.createSimpleTable("white_birch_log", Registration.WHITE_BIRCH_LOG.get()));

        // Loot tables for Colored Planks
        builder.accept(Registration.BLACK_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("black_oak_planks", Registration.BLACK_PLANKS.get()));
        builder.accept(Registration.RED_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("red_oak_planks", Registration.RED_PLANKS.get()));
        builder.accept(Registration.GREEN_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("green_oak_planks", Registration.GREEN_PLANKS.get()));
        builder.accept(Registration.BROWN_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("brown_oak_planks", Registration.BROWN_PLANKS.get()));
        builder.accept(Registration.BLUE_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("blue_oak_planks", Registration.BLUE_PLANKS.get()));
        builder.accept(Registration.PURPLE_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("purple_oak_planks", Registration.PURPLE_PLANKS.get()));
        builder.accept(Registration.CYAN_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("cyan_oak_planks", Registration.CYAN_PLANKS.get()));
        builder.accept(Registration.LIGHT_GRAY_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("light_gray_oak_planks", Registration.LIGHT_GRAY_PLANKS.get()));
        builder.accept(Registration.GRAY_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("gray_oak_planks", Registration.GRAY_PLANKS.get()));
        builder.accept(Registration.PINK_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("pink_oak_planks", Registration.PINK_PLANKS.get()));
        builder.accept(Registration.LIME_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("lime_oak_planks", Registration.LIME_PLANKS.get()));
        builder.accept(Registration.YELLOW_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("yellow_oak_planks", Registration.YELLOW_PLANKS.get()));
        builder.accept(Registration.LIGHT_BLUE_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("light_blue_oak_planks", Registration.LIGHT_BLUE_PLANKS.get()));
        builder.accept(Registration.MAGENTA_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("magenta_oak_planks", Registration.MAGENTA_PLANKS.get()));
        builder.accept(Registration.ORANGE_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("orange_oak_planks", Registration.ORANGE_PLANKS.get()));
        builder.accept(Registration.WHITE_PLANKS.getId(), BaseLootTableProvider.createSimpleTable("white_oak_planks", Registration.WHITE_PLANKS.get()));

        // Loot tables for Colored Leaves
        builder.accept(Registration.BLACK_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("black_oak_leaves", Registration.BLACK_OAK_LEAVES.get()));
        builder.accept(Registration.RED_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("red_oak_leaves", Registration.RED_OAK_LEAVES.get()));
        builder.accept(Registration.GREEN_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("green_oak_leaves", Registration.GREEN_OAK_LEAVES.get()));
        builder.accept(Registration.BROWN_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("brown_oak_leaves", Registration.BROWN_OAK_LEAVES.get()));
        builder.accept(Registration.BLUE_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("blue_oak_leaves", Registration.BLUE_OAK_LEAVES.get()));
        builder.accept(Registration.PURPLE_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("purple_oak_leaves", Registration.PURPLE_OAK_LEAVES.get()));
        builder.accept(Registration.CYAN_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("cyan_oak_leaves", Registration.CYAN_OAK_LEAVES.get()));
        builder.accept(Registration.LIGHT_GRAY_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("light_gray_oak_leaves", Registration.LIGHT_GRAY_OAK_LEAVES.get()));
        builder.accept(Registration.GRAY_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("gray_oak_leaves", Registration.GRAY_OAK_LEAVES.get()));
        builder.accept(Registration.PINK_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("pink_oak_leaves", Registration.PINK_OAK_LEAVES.get()));
        builder.accept(Registration.LIME_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("lime_oak_leaves", Registration.LIME_OAK_LEAVES.get()));
        builder.accept(Registration.YELLOW_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("yellow_oak_leaves", Registration.YELLOW_OAK_LEAVES.get()));
        builder.accept(Registration.LIGHT_BLUE_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("light_blue_oak_leaves", Registration.LIGHT_BLUE_OAK_LEAVES.get()));
        builder.accept(Registration.MAGENTA_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("magenta_oak_leaves", Registration.MAGENTA_OAK_LEAVES.get()));
        builder.accept(Registration.ORANGE_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("orange_oak_leaves", Registration.ORANGE_OAK_LEAVES.get()));
        builder.accept(Registration.WHITE_OAK_LEAVES.getId(), BaseLootTableProvider.createSimpleTable("white_oak_leaves", Registration.WHITE_OAK_LEAVES.get()));
    }
}
