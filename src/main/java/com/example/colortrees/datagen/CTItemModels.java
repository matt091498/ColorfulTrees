package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;
import com.example.colortrees.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CTItemModels extends ItemModelProvider {

    public CTItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, colortrees.MODID, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.BLACK_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/black_oak_log"));
        withExistingParent(Registration.RED_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/red_oak_log"));
        withExistingParent(Registration.GREEN_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/green_oak_log"));
        withExistingParent(Registration.BROWN_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/brown_oak_log"));
        withExistingParent(Registration.BLUE_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/blue_oak_log"));
        withExistingParent(Registration.PURPLE_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/purple_oak_log"));
        withExistingParent(Registration.CYAN_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/cyan_oak_log"));
        withExistingParent(Registration.LIGHT_GRAY_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/light_gray_oak_log"));
        withExistingParent(Registration.GRAY_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/gray_oak_log"));
        withExistingParent(Registration.PINK_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/pink_oak_log"));
        withExistingParent(Registration.LIME_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/lime_oak_log"));
        withExistingParent(Registration.YELLOW_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/yellow_oak_log"));
        withExistingParent(Registration.LIGHT_BLUE_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/light_blue_oak_log"));
        withExistingParent(Registration.MAGENTA_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/magenta_oak_log"));
        withExistingParent(Registration.ORANGE_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/orange_oak_log"));
        withExistingParent(Registration.WHITE_OAK_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/white_oak_log"));

        withExistingParent(Registration.BLACK_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/black_birch_log"));
        withExistingParent(Registration.RED_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/red_birch_log"));
        withExistingParent(Registration.GREEN_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/green_birch_log"));
        withExistingParent(Registration.BROWN_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/brown_birch_log"));
        withExistingParent(Registration.BLUE_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/blue_birch_log"));
        withExistingParent(Registration.PURPLE_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/purple_birch_log"));
        withExistingParent(Registration.CYAN_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/cyan_birch_log"));
        withExistingParent(Registration.LIGHT_GRAY_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/light_gray_birch_log"));
        withExistingParent(Registration.GRAY_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/gray_birch_log"));
        withExistingParent(Registration.PINK_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/pink_birch_log"));
        withExistingParent(Registration.LIME_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/lime_birch_log"));
        withExistingParent(Registration.YELLOW_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/yellow_birch_log"));
        withExistingParent(Registration.LIGHT_BLUE_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/light_blue_birch_log"));
        withExistingParent(Registration.MAGENTA_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/magenta_birch_log"));
        withExistingParent(Registration.ORANGE_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/orange_birch_log"));
        withExistingParent(Registration.WHITE_BIRCH_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/white_birch_log"));

        withExistingParent(Registration.BLACK_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/black_oak_planks"));
        withExistingParent(Registration.RED_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/red_oak_planks"));
        withExistingParent(Registration.GREEN_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/green_oak_planks"));
        withExistingParent(Registration.BROWN_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/brown_oak_planks"));
        withExistingParent(Registration.BLUE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/blue_oak_planks"));
        withExistingParent(Registration.PURPLE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/purple_oak_planks"));
        withExistingParent(Registration.CYAN_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/cyan_oak_planks"));
        withExistingParent(Registration.LIGHT_GRAY_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/light_gray_oak_planks"));
        withExistingParent(Registration.GRAY_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/gray_oak_planks"));
        withExistingParent(Registration.PINK_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/pink_oak_planks"));
        withExistingParent(Registration.LIME_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/lime_oak_planks"));
        withExistingParent(Registration.YELLOW_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/yellow_oak_planks"));
        withExistingParent(Registration.LIGHT_BLUE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/light_blue_oak_planks"));
        withExistingParent(Registration.MAGENTA_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/magenta_oak_planks"));
        withExistingParent(Registration.ORANGE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/orange_oak_planks"));
        withExistingParent(Registration.WHITE_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/white_oak_planks"));

        withExistingParent(Registration.BLACK_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/black_oak_leaves"));
        withExistingParent(Registration.RED_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/red_oak_leaves"));
        withExistingParent(Registration.GREEN_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/green_oak_leaves"));
        withExistingParent(Registration.BROWN_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/brown_oak_leaves"));
        withExistingParent(Registration.BLUE_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/blue_oak_leaves"));
        withExistingParent(Registration.PURPLE_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/purple_oak_leaves"));
        withExistingParent(Registration.CYAN_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/cyan_oak_leaves"));
        withExistingParent(Registration.LIGHT_GRAY_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/light_gray_oak_leaves"));
        withExistingParent(Registration.GRAY_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/gray_oak_leaves"));
        withExistingParent(Registration.PINK_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/pink_oak_leaves"));
        withExistingParent(Registration.LIME_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/lime_oak_leaves"));
        withExistingParent(Registration.YELLOW_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/yellow_oak_leaves"));
        withExistingParent(Registration.LIGHT_BLUE_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/light_blue_oak_leaves"));
        withExistingParent(Registration.MAGENTA_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/magenta_oak_leaves"));
        withExistingParent(Registration.ORANGE_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/orange_oak_leaves"));
        withExistingParent(Registration.WHITE_OAK_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/white_oak_leaves"));

        singleTexture(Registration.BLACK_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/black_paint"));
        singleTexture(Registration.RED_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/red_paint"));
        singleTexture(Registration.GREEN_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/green_paint"));
        singleTexture(Registration.BROWN_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/brown_paint"));
        singleTexture(Registration.BLUE_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blue_paint"));
        singleTexture(Registration.PURPLE_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/purple_paint"));
        singleTexture(Registration.CYAN_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cyan_paint"));
        singleTexture(Registration.LIGHT_GRAY_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/light_gray_paint"));
        singleTexture(Registration.GRAY_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/gray_paint"));
        singleTexture(Registration.PINK_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pink_paint"));
        singleTexture(Registration.LIME_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lime_paint"));
        singleTexture(Registration.YELLOW_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/yellow_paint"));
        singleTexture(Registration.LIGHT_BLUE_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/light_blue_paint"));
        singleTexture(Registration.MAGENTA_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/magenta_paint"));
        singleTexture(Registration.ORANGE_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/orange_paint"));
        singleTexture(Registration.WHITE_PAINT_ITEM.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/white_paint"));

        singleTexture(Registration.BLANK_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/paint_roller"));
        singleTexture(Registration.BLACK_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/black_paint_roller"));
        singleTexture(Registration.RED_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/red_paint_roller"));
        singleTexture(Registration.GREEN_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/green_paint_roller"));
        singleTexture(Registration.BROWN_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/brown_paint_roller"));
        singleTexture(Registration.BLUE_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/blue_paint_roller"));
        singleTexture(Registration.PURPLE_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/purple_paint_roller"));
        singleTexture(Registration.CYAN_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/cyan_paint_roller"));
        singleTexture(Registration.LIGHT_GRAY_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/light_gray_paint_roller"));
        singleTexture(Registration.GRAY_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/gray_paint_roller"));
        singleTexture(Registration.PINK_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/pink_paint_roller"));
        singleTexture(Registration.LIME_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/lime_paint_roller"));
        singleTexture(Registration.YELLOW_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/yellow_paint_roller"));
        singleTexture(Registration.LIGHT_BLUE_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/light_blue_paint_roller"));
        singleTexture(Registration.MAGENTA_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/magenta_paint_roller"));
        singleTexture(Registration.ORANGE_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/orange_paint_roller"));
        singleTexture(Registration.WHITE_PAINT_ROLLER.get().getRegistryName().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/white_paint_roller"));
    }   
}
