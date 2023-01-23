package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CTItemTags extends ItemTagsProvider {

    public CTItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, colortrees.MODID, helper);
    }

    @Override
    public String getName() {
        return "Colorful Trees Tags";
    }
}
