package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;
import com.example.colortrees.setup.Registration;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CTBlockStates extends BlockStateProvider {
    
    public CTBlockStates(PackOutput packOutput, ExistingFileHelper helper) {
        super(packOutput, colortrees.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(Registration.BLACK_OAK_LOG.get());
        logBlock(Registration.RED_OAK_LOG.get());
        logBlock(Registration.GREEN_OAK_LOG.get());
        logBlock(Registration.BROWN_OAK_LOG.get());
        logBlock(Registration.BLUE_OAK_LOG.get());
        logBlock(Registration.PURPLE_OAK_LOG.get());
        logBlock(Registration.CYAN_OAK_LOG.get());
        logBlock(Registration.LIGHT_GRAY_OAK_LOG.get());
        logBlock(Registration.GRAY_OAK_LOG.get());
        logBlock(Registration.PINK_OAK_LOG.get());
        logBlock(Registration.LIME_OAK_LOG.get());
        logBlock(Registration.YELLOW_OAK_LOG.get());
        logBlock(Registration.LIGHT_BLUE_OAK_LOG.get());
        logBlock(Registration.MAGENTA_OAK_LOG.get());
        logBlock(Registration.ORANGE_OAK_LOG.get());
        logBlock(Registration.WHITE_OAK_LOG.get());
        
        logBlock(Registration.BLACK_BIRCH_LOG.get());
        logBlock(Registration.RED_BIRCH_LOG.get());
        logBlock(Registration.GREEN_BIRCH_LOG.get());
        logBlock(Registration.BROWN_BIRCH_LOG.get());
        logBlock(Registration.BLUE_BIRCH_LOG.get());
        logBlock(Registration.PURPLE_BIRCH_LOG.get());
        logBlock(Registration.CYAN_BIRCH_LOG.get());
        logBlock(Registration.LIGHT_GRAY_BIRCH_LOG.get());
        logBlock(Registration.GRAY_BIRCH_LOG.get());
        logBlock(Registration.PINK_BIRCH_LOG.get());
        logBlock(Registration.LIME_BIRCH_LOG.get());
        logBlock(Registration.YELLOW_BIRCH_LOG.get());
        logBlock(Registration.LIGHT_BLUE_BIRCH_LOG.get());
        logBlock(Registration.MAGENTA_BIRCH_LOG.get());
        logBlock(Registration.ORANGE_BIRCH_LOG.get());
        logBlock(Registration.WHITE_BIRCH_LOG.get());

        simpleBlock(Registration.BLACK_PLANKS.get());
        simpleBlock(Registration.RED_PLANKS.get());
        simpleBlock(Registration.GREEN_PLANKS.get());
        simpleBlock(Registration.BROWN_PLANKS.get());
        simpleBlock(Registration.BLUE_PLANKS.get());
        simpleBlock(Registration.PURPLE_PLANKS.get());
        simpleBlock(Registration.CYAN_PLANKS.get());
        simpleBlock(Registration.LIGHT_GRAY_PLANKS.get());
        simpleBlock(Registration.GRAY_PLANKS.get());
        simpleBlock(Registration.PINK_PLANKS.get());
        simpleBlock(Registration.LIME_PLANKS.get());
        simpleBlock(Registration.YELLOW_PLANKS.get());
        simpleBlock(Registration.LIGHT_BLUE_PLANKS.get());
        simpleBlock(Registration.MAGENTA_PLANKS.get());
        simpleBlock(Registration.ORANGE_PLANKS.get());
        simpleBlock(Registration.WHITE_PLANKS.get());

        simpleBlock(Registration.BLACK_OAK_LEAVES.get());
        simpleBlock(Registration.RED_OAK_LEAVES.get());
        simpleBlock(Registration.GREEN_OAK_LEAVES.get());
        simpleBlock(Registration.BROWN_OAK_LEAVES.get());
        simpleBlock(Registration.BLUE_OAK_LEAVES.get());
        simpleBlock(Registration.PURPLE_OAK_LEAVES.get());
        simpleBlock(Registration.CYAN_OAK_LEAVES.get());
        simpleBlock(Registration.LIGHT_GRAY_OAK_LEAVES.get());
        simpleBlock(Registration.GRAY_OAK_LEAVES.get());
        simpleBlock(Registration.PINK_OAK_LEAVES.get());
        simpleBlock(Registration.LIME_OAK_LEAVES.get());
        simpleBlock(Registration.YELLOW_OAK_LEAVES.get());
        simpleBlock(Registration.LIGHT_BLUE_OAK_LEAVES.get());
        simpleBlock(Registration.MAGENTA_OAK_LEAVES.get());
        simpleBlock(Registration.ORANGE_OAK_LEAVES.get());
        simpleBlock(Registration.WHITE_OAK_LEAVES.get());

        stairsBlock(Registration.BLACK_STAIRS.get(), blockTexture(Registration.BLACK_PLANKS.get()));
        stairsBlock(Registration.RED_STAIRS.get(), blockTexture(Registration.RED_PLANKS.get()));
        stairsBlock(Registration.GREEN_STAIRS.get(), blockTexture(Registration.GREEN_PLANKS.get()));
        stairsBlock(Registration.BROWN_STAIRS.get(), blockTexture(Registration.BROWN_PLANKS.get()));
        stairsBlock(Registration.BLUE_STAIRS.get(), blockTexture(Registration.BLUE_PLANKS.get()));
        stairsBlock(Registration.PURPLE_STAIRS.get(), blockTexture(Registration.PURPLE_PLANKS.get()));
        stairsBlock(Registration.CYAN_STAIRS.get(), blockTexture(Registration.CYAN_PLANKS.get()));
        stairsBlock(Registration.LIGHT_GRAY_STAIRS.get(), blockTexture(Registration.LIGHT_GRAY_PLANKS.get()));
        stairsBlock(Registration.GRAY_STAIRS.get(), blockTexture(Registration.GRAY_PLANKS.get()));
        stairsBlock(Registration.PINK_STAIRS.get(), blockTexture(Registration.PINK_PLANKS.get()));
        stairsBlock(Registration.LIME_STAIRS.get(), blockTexture(Registration.LIME_PLANKS.get()));
        stairsBlock(Registration.YELLOW_STAIRS.get(), blockTexture(Registration.YELLOW_PLANKS.get()));
        stairsBlock(Registration.LIGHT_BLUE_STAIRS.get(), blockTexture(Registration.LIGHT_BLUE_PLANKS.get()));
        stairsBlock(Registration.MAGENTA_STAIRS.get(), blockTexture(Registration.MAGENTA_PLANKS.get()));
        stairsBlock(Registration.ORANGE_STAIRS.get(), blockTexture(Registration.ORANGE_PLANKS.get()));
        stairsBlock(Registration.WHITE_STAIRS.get(), blockTexture(Registration.WHITE_PLANKS.get()));
    }
}
