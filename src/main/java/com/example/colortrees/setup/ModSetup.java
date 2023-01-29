package com.example.colortrees.setup;

import com.example.colortrees.colortrees;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = colortrees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

    public static final String TAB_NAME = "colortrees";

    @SubscribeEvent
    public static void onCustomTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(colortrees.MODID, "colorfultrees"), builder -> {
            builder.title(Component.translatable("itemGroup." + TAB_NAME))
                .icon(() -> new ItemStack(Registration.RED_OAK_LOG_ITEM.get()))
                .displayItems((enabledFlags, populator, hasPermissions) -> {
                    populator.accept(Registration.BLACK_OAK_LOG.get());
                    populator.accept(Registration.RED_OAK_LOG.get());
                    populator.accept(Registration.GREEN_OAK_LOG.get());
                    populator.accept(Registration.BROWN_OAK_LOG.get());
                    populator.accept(Registration.BLUE_OAK_LOG.get());
                    populator.accept(Registration.PURPLE_OAK_LOG.get());
                    populator.accept(Registration.CYAN_OAK_LOG.get());
                    populator.accept(Registration.LIGHT_GRAY_OAK_LOG.get());
                    populator.accept(Registration.GRAY_OAK_LOG.get());
                    populator.accept(Registration.PINK_OAK_LOG.get());
                    populator.accept(Registration.LIME_OAK_LOG.get());
                    populator.accept(Registration.YELLOW_OAK_LOG.get());
                    populator.accept(Registration.LIGHT_BLUE_OAK_LOG.get());
                    populator.accept(Registration.MAGENTA_OAK_LOG.get());
                    populator.accept(Registration.ORANGE_OAK_LOG.get());
                    populator.accept(Registration.WHITE_OAK_LOG.get());

                    populator.accept(Registration.BLACK_BIRCH_LOG.get());
                    populator.accept(Registration.RED_BIRCH_LOG.get());
                    populator.accept(Registration.GREEN_BIRCH_LOG.get());
                    populator.accept(Registration.BROWN_BIRCH_LOG.get());
                    populator.accept(Registration.BLUE_BIRCH_LOG.get());
                    populator.accept(Registration.PURPLE_BIRCH_LOG.get());
                    populator.accept(Registration.CYAN_BIRCH_LOG.get());
                    populator.accept(Registration.LIGHT_GRAY_BIRCH_LOG.get());
                    populator.accept(Registration.GRAY_BIRCH_LOG.get());
                    populator.accept(Registration.PINK_BIRCH_LOG.get());
                    populator.accept(Registration.LIME_BIRCH_LOG.get());
                    populator.accept(Registration.YELLOW_BIRCH_LOG.get());
                    populator.accept(Registration.LIGHT_BLUE_BIRCH_LOG.get());
                    populator.accept(Registration.MAGENTA_BIRCH_LOG.get());
                    populator.accept(Registration.ORANGE_BIRCH_LOG.get());
                    populator.accept(Registration.WHITE_BIRCH_LOG.get());

                    populator.accept(Registration.BLACK_PLANKS.get());
                    populator.accept(Registration.RED_PLANKS.get());
                    populator.accept(Registration.GREEN_PLANKS.get());
                    populator.accept(Registration.BROWN_PLANKS.get());
                    populator.accept(Registration.BLUE_PLANKS.get());
                    populator.accept(Registration.PURPLE_PLANKS.get());
                    populator.accept(Registration.CYAN_PLANKS.get());
                    populator.accept(Registration.LIGHT_GRAY_PLANKS.get());
                    populator.accept(Registration.GRAY_PLANKS.get());
                    populator.accept(Registration.PINK_PLANKS.get());
                    populator.accept(Registration.LIME_PLANKS.get());
                    populator.accept(Registration.YELLOW_PLANKS.get());
                    populator.accept(Registration.LIGHT_BLUE_PLANKS.get());
                    populator.accept(Registration.MAGENTA_PLANKS.get());
                    populator.accept(Registration.ORANGE_PLANKS.get());
                    populator.accept(Registration.WHITE_PLANKS.get());

                    populator.accept(Registration.BLACK_OAK_LEAVES.get());
                    populator.accept(Registration.RED_OAK_LEAVES.get());
                    populator.accept(Registration.GREEN_OAK_LEAVES.get());
                    populator.accept(Registration.BROWN_OAK_LEAVES.get());
                    populator.accept(Registration.BLUE_OAK_LEAVES.get());
                    populator.accept(Registration.PURPLE_OAK_LEAVES.get());
                    populator.accept(Registration.CYAN_OAK_LEAVES.get());
                    populator.accept(Registration.LIGHT_GRAY_OAK_LEAVES.get());
                    populator.accept(Registration.GRAY_OAK_LEAVES.get());
                    populator.accept(Registration.PINK_OAK_LEAVES.get());
                    populator.accept(Registration.LIME_OAK_LEAVES.get());
                    populator.accept(Registration.YELLOW_OAK_LEAVES.get());
                    populator.accept(Registration.LIGHT_BLUE_OAK_LEAVES.get());
                    populator.accept(Registration.MAGENTA_OAK_LEAVES.get());
                    populator.accept(Registration.ORANGE_OAK_LEAVES.get());
                    populator.accept(Registration.WHITE_OAK_LEAVES.get());

                    populator.accept(Registration.BLACK_STAIRS.get());
                    populator.accept(Registration.RED_STAIRS.get());
                    populator.accept(Registration.GREEN_STAIRS.get());
                    populator.accept(Registration.BROWN_STAIRS.get());
                    populator.accept(Registration.BLUE_STAIRS.get());
                    populator.accept(Registration.PURPLE_STAIRS.get());
                    populator.accept(Registration.CYAN_STAIRS.get());
                    populator.accept(Registration.LIGHT_GRAY_STAIRS.get());
                    populator.accept(Registration.GRAY_STAIRS.get());
                    populator.accept(Registration.PINK_STAIRS.get());
                    populator.accept(Registration.LIME_STAIRS.get());
                    populator.accept(Registration.YELLOW_STAIRS.get());
                    populator.accept(Registration.LIGHT_BLUE_STAIRS.get());
                    populator.accept(Registration.MAGENTA_STAIRS.get());
                    populator.accept(Registration.ORANGE_STAIRS.get());
                    populator.accept(Registration.WHITE_STAIRS.get());

                    populator.accept(Registration.BLACK_PAINT_ITEM.get());
                    populator.accept(Registration.RED_PAINT_ITEM.get());
                    populator.accept(Registration.GREEN_PAINT_ITEM.get());
                    populator.accept(Registration.BROWN_PAINT_ITEM.get());
                    populator.accept(Registration.BLUE_PAINT_ITEM.get());
                    populator.accept(Registration.PURPLE_PAINT_ITEM.get());
                    populator.accept(Registration.CYAN_PAINT_ITEM.get());
                    populator.accept(Registration.LIGHT_GRAY_PAINT_ITEM.get());
                    populator.accept(Registration.GRAY_PAINT_ITEM.get());
                    populator.accept(Registration.PINK_PAINT_ITEM.get());
                    populator.accept(Registration.LIME_PAINT_ITEM.get());
                    populator.accept(Registration.YELLOW_PAINT_ITEM.get());
                    populator.accept(Registration.LIGHT_BLUE_PAINT_ITEM.get());
                    populator.accept(Registration.MAGENTA_PAINT_ITEM.get());
                    populator.accept(Registration.ORANGE_PAINT_ITEM.get());
                    populator.accept(Registration.WHITE_PAINT_ITEM.get());

                    populator.accept(Registration.BLANK_PAINT_ROLLER.get());
                    populator.accept(Registration.BLACK_PAINT_ROLLER.get());
                    populator.accept(Registration.RED_PAINT_ROLLER.get());
                    populator.accept(Registration.GREEN_PAINT_ROLLER.get());
                    populator.accept(Registration.BROWN_PAINT_ROLLER.get());
                    populator.accept(Registration.BLUE_PAINT_ROLLER.get());
                    populator.accept(Registration.PURPLE_PAINT_ROLLER.get());
                    populator.accept(Registration.CYAN_PAINT_ROLLER.get());
                    populator.accept(Registration.LIGHT_GRAY_PAINT_ROLLER.get());
                    populator.accept(Registration.GRAY_PAINT_ROLLER.get());
                    populator.accept(Registration.PINK_PAINT_ROLLER.get());
                    populator.accept(Registration.LIME_PAINT_ROLLER.get());
                    populator.accept(Registration.YELLOW_PAINT_ROLLER.get());
                    populator.accept(Registration.LIGHT_BLUE_PAINT_ROLLER.get());
                    populator.accept(Registration.MAGENTA_PAINT_ROLLER.get());
                    populator.accept(Registration.ORANGE_PAINT_ROLLER.get());
                    populator.accept(Registration.WHITE_PAINT_ROLLER.get());
                });
        });
    }

    public static void init(FMLCommonSetupEvent event) {

    }
}