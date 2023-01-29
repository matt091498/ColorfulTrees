package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;
import com.example.colortrees.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CTBlockTags extends BlockTagsProvider {
    
    public CTBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, colortrees.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE)
            .add(Registration.BLACK_OAK_LOG.get())
            .add(Registration.RED_OAK_LOG.get())
            .add(Registration.GREEN_OAK_LOG.get())
            .add(Registration.BROWN_OAK_LOG.get())
            .add(Registration.BLUE_OAK_LOG.get())
            .add(Registration.PURPLE_OAK_LOG.get())
            .add(Registration.CYAN_OAK_LOG.get())
            .add(Registration.LIGHT_GRAY_OAK_LOG.get())
            .add(Registration.GRAY_OAK_LOG.get())
            .add(Registration.PINK_OAK_LOG.get())
            .add(Registration.LIME_OAK_LOG.get())
            .add(Registration.YELLOW_OAK_LOG.get())
            .add(Registration.LIGHT_BLUE_OAK_LOG.get())
            .add(Registration.MAGENTA_OAK_LOG.get())
            .add(Registration.ORANGE_OAK_LOG.get())
            .add(Registration.WHITE_OAK_LOG.get())

            .add(Registration.BLACK_BIRCH_LOG.get())
            .add(Registration.RED_BIRCH_LOG.get())
            .add(Registration.GREEN_BIRCH_LOG.get())
            .add(Registration.BROWN_BIRCH_LOG.get())
            .add(Registration.BLUE_BIRCH_LOG.get())
            .add(Registration.PURPLE_BIRCH_LOG.get())
            .add(Registration.CYAN_BIRCH_LOG.get())
            .add(Registration.LIGHT_GRAY_BIRCH_LOG.get())
            .add(Registration.GRAY_BIRCH_LOG.get())
            .add(Registration.PINK_BIRCH_LOG.get())
            .add(Registration.LIME_BIRCH_LOG.get())
            .add(Registration.YELLOW_BIRCH_LOG.get())
            .add(Registration.LIGHT_BLUE_BIRCH_LOG.get())
            .add(Registration.MAGENTA_BIRCH_LOG.get())
            .add(Registration.ORANGE_BIRCH_LOG.get())
            .add(Registration.WHITE_BIRCH_LOG.get())

            .add(Registration.BLACK_PLANKS.get())
            .add(Registration.RED_PLANKS.get())
            .add(Registration.GREEN_PLANKS.get())
            .add(Registration.BROWN_PLANKS.get())
            .add(Registration.BLUE_PLANKS.get())
            .add(Registration.PURPLE_PLANKS.get())
            .add(Registration.CYAN_PLANKS.get())
            .add(Registration.LIGHT_GRAY_PLANKS.get())
            .add(Registration.GRAY_PLANKS.get())
            .add(Registration.PINK_PLANKS.get())
            .add(Registration.LIME_PLANKS.get())
            .add(Registration.YELLOW_PLANKS.get())
            .add(Registration.LIGHT_BLUE_PLANKS.get())
            .add(Registration.MAGENTA_PLANKS.get())
            .add(Registration.ORANGE_PLANKS.get())
            .add(Registration.WHITE_PLANKS.get())

            .add(Registration.BLACK_STAIRS.get())
            .add(Registration.RED_STAIRS.get())
            .add(Registration.GREEN_STAIRS.get())
            .add(Registration.BROWN_STAIRS.get())
            .add(Registration.BLUE_STAIRS.get())
            .add(Registration.PURPLE_STAIRS.get())
            .add(Registration.CYAN_STAIRS.get())
            .add(Registration.LIGHT_GRAY_STAIRS.get())
            .add(Registration.GRAY_STAIRS.get())
            .add(Registration.PINK_STAIRS.get())
            .add(Registration.LIME_STAIRS.get())
            .add(Registration.YELLOW_STAIRS.get())
            .add(Registration.LIGHT_BLUE_STAIRS.get())
            .add(Registration.MAGENTA_STAIRS.get())
            .add(Registration.ORANGE_STAIRS.get())
            .add(Registration.WHITE_STAIRS.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
            .add(Registration.BLACK_OAK_LEAVES.get())
            .add(Registration.RED_OAK_LEAVES.get())
            .add(Registration.GREEN_OAK_LEAVES.get())
            .add(Registration.BROWN_OAK_LEAVES.get())
            .add(Registration.BLUE_OAK_LEAVES.get())
            .add(Registration.PURPLE_OAK_LEAVES.get())
            .add(Registration.CYAN_OAK_LEAVES.get())
            .add(Registration.LIGHT_GRAY_OAK_LEAVES.get())
            .add(Registration.GRAY_OAK_LEAVES.get())
            .add(Registration.PINK_OAK_LEAVES.get())
            .add(Registration.LIME_OAK_LEAVES.get())
            .add(Registration.YELLOW_OAK_LEAVES.get())
            .add(Registration.LIGHT_BLUE_OAK_LEAVES.get())
            .add(Registration.MAGENTA_OAK_LEAVES.get())
            .add(Registration.ORANGE_OAK_LEAVES.get())
            .add(Registration.WHITE_OAK_LEAVES.get());

        tag(BlockTags.LOGS)
            .add(Registration.BLACK_OAK_LOG.get())
            .add(Registration.RED_OAK_LOG.get())
            .add(Registration.GREEN_OAK_LOG.get())
            .add(Registration.BROWN_OAK_LOG.get())
            .add(Registration.BLUE_OAK_LOG.get())
            .add(Registration.PURPLE_OAK_LOG.get())
            .add(Registration.CYAN_OAK_LOG.get())
            .add(Registration.LIGHT_GRAY_OAK_LOG.get())
            .add(Registration.GRAY_OAK_LOG.get())
            .add(Registration.PINK_OAK_LOG.get())
            .add(Registration.LIME_OAK_LOG.get())
            .add(Registration.YELLOW_OAK_LOG.get())
            .add(Registration.LIGHT_BLUE_OAK_LOG.get())
            .add(Registration.MAGENTA_OAK_LOG.get())
            .add(Registration.ORANGE_OAK_LOG.get())
            .add(Registration.WHITE_OAK_LOG.get())

            .add(Registration.BLACK_BIRCH_LOG.get())
            .add(Registration.RED_BIRCH_LOG.get())
            .add(Registration.GREEN_BIRCH_LOG.get())
            .add(Registration.BROWN_BIRCH_LOG.get())
            .add(Registration.BLUE_BIRCH_LOG.get())
            .add(Registration.PURPLE_BIRCH_LOG.get())
            .add(Registration.CYAN_BIRCH_LOG.get())
            .add(Registration.LIGHT_GRAY_BIRCH_LOG.get())
            .add(Registration.GRAY_BIRCH_LOG.get())
            .add(Registration.PINK_BIRCH_LOG.get())
            .add(Registration.LIME_BIRCH_LOG.get())
            .add(Registration.YELLOW_BIRCH_LOG.get())
            .add(Registration.LIGHT_BLUE_BIRCH_LOG.get())
            .add(Registration.MAGENTA_BIRCH_LOG.get())
            .add(Registration.ORANGE_BIRCH_LOG.get())
            .add(Registration.WHITE_BIRCH_LOG.get());

        tag(BlockTags.LOGS_THAT_BURN)
            .add(Registration.BLACK_OAK_LOG.get())
            .add(Registration.RED_OAK_LOG.get())
            .add(Registration.GREEN_OAK_LOG.get())
            .add(Registration.BROWN_OAK_LOG.get())
            .add(Registration.BLUE_OAK_LOG.get())
            .add(Registration.PURPLE_OAK_LOG.get())
            .add(Registration.CYAN_OAK_LOG.get())
            .add(Registration.LIGHT_GRAY_OAK_LOG.get())
            .add(Registration.GRAY_OAK_LOG.get())
            .add(Registration.PINK_OAK_LOG.get())
            .add(Registration.LIME_OAK_LOG.get())
            .add(Registration.YELLOW_OAK_LOG.get())
            .add(Registration.LIGHT_BLUE_OAK_LOG.get())
            .add(Registration.MAGENTA_OAK_LOG.get())
            .add(Registration.ORANGE_OAK_LOG.get())
            .add(Registration.WHITE_OAK_LOG.get())

            .add(Registration.BLACK_BIRCH_LOG.get())
            .add(Registration.RED_BIRCH_LOG.get())
            .add(Registration.GREEN_BIRCH_LOG.get())
            .add(Registration.BROWN_BIRCH_LOG.get())
            .add(Registration.BLUE_BIRCH_LOG.get())
            .add(Registration.PURPLE_BIRCH_LOG.get())
            .add(Registration.CYAN_BIRCH_LOG.get())
            .add(Registration.LIGHT_GRAY_BIRCH_LOG.get())
            .add(Registration.GRAY_BIRCH_LOG.get())
            .add(Registration.PINK_BIRCH_LOG.get())
            .add(Registration.LIME_BIRCH_LOG.get())
            .add(Registration.YELLOW_BIRCH_LOG.get())
            .add(Registration.LIGHT_BLUE_BIRCH_LOG.get())
            .add(Registration.MAGENTA_BIRCH_LOG.get())
            .add(Registration.ORANGE_BIRCH_LOG.get())
            .add(Registration.WHITE_BIRCH_LOG.get());

        tag(BlockTags.OAK_LOGS)
            .add(Registration.BLACK_OAK_LOG.get())
            .add(Registration.RED_OAK_LOG.get())
            .add(Registration.GREEN_OAK_LOG.get())
            .add(Registration.BROWN_OAK_LOG.get())
            .add(Registration.BLUE_OAK_LOG.get())
            .add(Registration.PURPLE_OAK_LOG.get())
            .add(Registration.CYAN_OAK_LOG.get())
            .add(Registration.LIGHT_GRAY_OAK_LOG.get())
            .add(Registration.GRAY_OAK_LOG.get())
            .add(Registration.PINK_OAK_LOG.get())
            .add(Registration.LIME_OAK_LOG.get())
            .add(Registration.YELLOW_OAK_LOG.get())
            .add(Registration.LIGHT_BLUE_OAK_LOG.get())
            .add(Registration.MAGENTA_OAK_LOG.get())
            .add(Registration.ORANGE_OAK_LOG.get())
            .add(Registration.WHITE_OAK_LOG.get());

        tag(BlockTags.BIRCH_LOGS)
            .add(Registration.BLACK_BIRCH_LOG.get())
            .add(Registration.RED_BIRCH_LOG.get())
            .add(Registration.GREEN_BIRCH_LOG.get())
            .add(Registration.BROWN_BIRCH_LOG.get())
            .add(Registration.BLUE_BIRCH_LOG.get())
            .add(Registration.PURPLE_BIRCH_LOG.get())
            .add(Registration.CYAN_BIRCH_LOG.get())
            .add(Registration.LIGHT_GRAY_BIRCH_LOG.get())
            .add(Registration.GRAY_BIRCH_LOG.get())
            .add(Registration.PINK_BIRCH_LOG.get())
            .add(Registration.LIME_BIRCH_LOG.get())
            .add(Registration.YELLOW_BIRCH_LOG.get())
            .add(Registration.LIGHT_BLUE_BIRCH_LOG.get())
            .add(Registration.MAGENTA_BIRCH_LOG.get())
            .add(Registration.ORANGE_BIRCH_LOG.get())
            .add(Registration.WHITE_BIRCH_LOG.get());

        tag(BlockTags.PLANKS)
            .add(Registration.BLACK_PLANKS.get())
            .add(Registration.RED_PLANKS.get())
            .add(Registration.GREEN_PLANKS.get())
            .add(Registration.BROWN_PLANKS.get())
            .add(Registration.BLUE_PLANKS.get())
            .add(Registration.PURPLE_PLANKS.get())
            .add(Registration.CYAN_PLANKS.get())
            .add(Registration.LIGHT_GRAY_PLANKS.get())
            .add(Registration.GRAY_PLANKS.get())
            .add(Registration.PINK_PLANKS.get())
            .add(Registration.LIME_PLANKS.get())
            .add(Registration.YELLOW_PLANKS.get())
            .add(Registration.LIGHT_BLUE_PLANKS.get())
            .add(Registration.MAGENTA_PLANKS.get())
            .add(Registration.ORANGE_PLANKS.get())
            .add(Registration.WHITE_PLANKS.get());

        tag(BlockTags.LEAVES)
            .add(Registration.BLACK_OAK_LEAVES.get())
            .add(Registration.RED_OAK_LEAVES.get())
            .add(Registration.GREEN_OAK_LEAVES.get())
            .add(Registration.BROWN_OAK_LEAVES.get())
            .add(Registration.BLUE_OAK_LEAVES.get())
            .add(Registration.PURPLE_OAK_LEAVES.get())
            .add(Registration.CYAN_OAK_LEAVES.get())
            .add(Registration.LIGHT_GRAY_OAK_LEAVES.get())
            .add(Registration.GRAY_OAK_LEAVES.get())
            .add(Registration.PINK_OAK_LEAVES.get())
            .add(Registration.LIME_OAK_LEAVES.get())
            .add(Registration.YELLOW_OAK_LEAVES.get())
            .add(Registration.LIGHT_BLUE_OAK_LEAVES.get())
            .add(Registration.MAGENTA_OAK_LEAVES.get())
            .add(Registration.ORANGE_OAK_LEAVES.get())
            .add(Registration.WHITE_OAK_LEAVES.get());

        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
            .add(Registration.BLACK_OAK_LEAVES.get())
            .add(Registration.RED_OAK_LEAVES.get())
            .add(Registration.GREEN_OAK_LEAVES.get())
            .add(Registration.BROWN_OAK_LEAVES.get())
            .add(Registration.BLUE_OAK_LEAVES.get())
            .add(Registration.PURPLE_OAK_LEAVES.get())
            .add(Registration.CYAN_OAK_LEAVES.get())
            .add(Registration.LIGHT_GRAY_OAK_LEAVES.get())
            .add(Registration.GRAY_OAK_LEAVES.get())
            .add(Registration.PINK_OAK_LEAVES.get())
            .add(Registration.LIME_OAK_LEAVES.get())
            .add(Registration.YELLOW_OAK_LEAVES.get())
            .add(Registration.LIGHT_BLUE_OAK_LEAVES.get())
            .add(Registration.MAGENTA_OAK_LEAVES.get())
            .add(Registration.ORANGE_OAK_LEAVES.get())
            .add(Registration.WHITE_OAK_LEAVES.get());

        tag(BlockTags.STAIRS)
            .add(Registration.BLACK_STAIRS.get())
            .add(Registration.RED_STAIRS.get())
            .add(Registration.GREEN_STAIRS.get())
            .add(Registration.BROWN_STAIRS.get())
            .add(Registration.BLUE_STAIRS.get())
            .add(Registration.PURPLE_STAIRS.get())
            .add(Registration.CYAN_STAIRS.get())
            .add(Registration.LIGHT_GRAY_STAIRS.get())
            .add(Registration.GRAY_STAIRS.get())
            .add(Registration.PINK_STAIRS.get())
            .add(Registration.LIME_STAIRS.get())
            .add(Registration.YELLOW_STAIRS.get())
            .add(Registration.LIGHT_BLUE_STAIRS.get())
            .add(Registration.MAGENTA_STAIRS.get())
            .add(Registration.ORANGE_STAIRS.get())
            .add(Registration.WHITE_STAIRS.get());

        tag(BlockTags.WOODEN_STAIRS)
            .add(Registration.BLACK_STAIRS.get())
            .add(Registration.RED_STAIRS.get())
            .add(Registration.GREEN_STAIRS.get())
            .add(Registration.BROWN_STAIRS.get())
            .add(Registration.BLUE_STAIRS.get())
            .add(Registration.PURPLE_STAIRS.get())
            .add(Registration.CYAN_STAIRS.get())
            .add(Registration.LIGHT_GRAY_STAIRS.get())
            .add(Registration.GRAY_STAIRS.get())
            .add(Registration.PINK_STAIRS.get())
            .add(Registration.LIME_STAIRS.get())
            .add(Registration.YELLOW_STAIRS.get())
            .add(Registration.LIGHT_BLUE_STAIRS.get())
            .add(Registration.MAGENTA_STAIRS.get())
            .add(Registration.ORANGE_STAIRS.get())
            .add(Registration.WHITE_STAIRS.get());
    }

    @Override
    public String getName() {
        return "Colorful Trees Tags";
    }
}
