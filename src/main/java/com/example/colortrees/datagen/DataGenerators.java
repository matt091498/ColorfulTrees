package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;
import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber(modid = colortrees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new CTRecipes(packOutput));
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(CTLootTables::new, LootContextParamSets.BLOCK))));
        CTBlockTags blockTags = new CTBlockTags(packOutput, lookupProvider, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new CTItemTags(packOutput, lookupProvider, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CTBlockStates(packOutput, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CTItemModels(packOutput, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CTLanguageProvider(packOutput, "en_us"));
    }
}
