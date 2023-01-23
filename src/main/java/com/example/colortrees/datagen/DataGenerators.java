package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = colortrees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            generator.addProvider(new CTRecipes(generator));
            generator.addProvider(new CTLootTables(generator));
            CTBlockTags blockTags = new CTBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new CTItemTags(generator, blockTags, event.getExistingFileHelper()));
        }

        if (event.includeClient()) {
            generator.addProvider(new CTBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new CTItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new CTLanguageProvider(generator, "en_us"));
        }
    }
}
