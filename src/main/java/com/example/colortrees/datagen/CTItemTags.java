package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;

import net.minecraft.data.PackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class CTItemTags extends ItemTagsProvider {

    public CTItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, blockTags, colortrees.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

    }

    @Override
    public String getName() {
        return "Colorful Trees Tags";
    }
}
