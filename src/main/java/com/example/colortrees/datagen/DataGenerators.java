package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = colortrees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(event.includeServer(), new CTRecipes(generator));
        generator.addProvider(event.includeServer(), new CTLootTables(generator));
        CTBlockTags blockTags = new CTBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new CTItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CTBlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CTItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CTLanguageProvider(generator, "en_us"));
    }
}
