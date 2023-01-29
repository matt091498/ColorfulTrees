package com.example.colortrees.datagen;

import com.example.colortrees.colortrees;
import com.example.colortrees.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.colortrees.setup.ModSetup.TAB_NAME;

public class CTLanguageProvider extends LanguageProvider {

    public CTLanguageProvider(DataGenerator generator, String locale) {
        super(generator, colortrees.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Colorful Trees");

        add(Registration.BLACK_OAK_LOG.get(), "Black Oak Log");
        add(Registration.RED_OAK_LOG.get(), "Red Oak Log");
        add(Registration.GREEN_OAK_LOG.get(), "Green Oak Log");
        add(Registration.BROWN_OAK_LOG.get(), "Brown Oak Log");
        add(Registration.BLUE_OAK_LOG.get(), "Blue Oak Log");
        add(Registration.PURPLE_OAK_LOG.get(), "Purple Oak Log");
        add(Registration.CYAN_OAK_LOG.get(), "Cyan Oak Log");
        add(Registration.LIGHT_GRAY_OAK_LOG.get(), "Light Gray Oak Log");
        add(Registration.GRAY_OAK_LOG.get(), "Gray Oak Log");
        add(Registration.PINK_OAK_LOG.get(), "Pink Oak Log");
        add(Registration.LIME_OAK_LOG.get(), "Lime Oak Log");
        add(Registration.YELLOW_OAK_LOG.get(), "Yellow Oak Log");
        add(Registration.LIGHT_BLUE_OAK_LOG.get(), "Light Blue Oak Log");
        add(Registration.MAGENTA_OAK_LOG.get(), "Magenta Oak Log");
        add(Registration.ORANGE_OAK_LOG.get(), "Orange Oak Log");
        add(Registration.WHITE_OAK_LOG.get(), "White Oak Log");

        add(Registration.BLACK_BIRCH_LOG.get(), "Black Birch Log");
        add(Registration.RED_BIRCH_LOG.get(), "Red Birch Log");
        add(Registration.GREEN_BIRCH_LOG.get(), "Green Birch Log");
        add(Registration.BROWN_BIRCH_LOG.get(), "Brown Birch Log");
        add(Registration.BLUE_BIRCH_LOG.get(), "Blue Birch Log");
        add(Registration.PURPLE_BIRCH_LOG.get(), "Purple Birch Log");
        add(Registration.CYAN_BIRCH_LOG.get(), "Cyan Birch Log");
        add(Registration.LIGHT_GRAY_BIRCH_LOG.get(), "Light Gray Birch Log");
        add(Registration.GRAY_BIRCH_LOG.get(), "Gray Birch Log");
        add(Registration.PINK_BIRCH_LOG.get(), "Pink Birch Log");
        add(Registration.LIME_BIRCH_LOG.get(), "Lime Birch Log");
        add(Registration.YELLOW_BIRCH_LOG.get(), "Yellow Birch Log");
        add(Registration.LIGHT_BLUE_BIRCH_LOG.get(), "Light Blue Birch Log");
        add(Registration.MAGENTA_BIRCH_LOG.get(), "Magenta Birch Log");
        add(Registration.ORANGE_BIRCH_LOG.get(), "Orange Birch Log");
        add(Registration.WHITE_BIRCH_LOG.get(), "White Birch Log");

        add(Registration.BLACK_PLANKS.get(), "Black Planks");
        add(Registration.RED_PLANKS.get(), "Red Planks");
        add(Registration.GREEN_PLANKS.get(), "Green Planks");
        add(Registration.BROWN_PLANKS.get(), "Brown Planks");
        add(Registration.BLUE_PLANKS.get(), "Blue Planks");
        add(Registration.PURPLE_PLANKS.get(), "Purple Planks");
        add(Registration.CYAN_PLANKS.get(), "Cyan Planks");
        add(Registration.LIGHT_GRAY_PLANKS.get(), "Light Gray Planks");
        add(Registration.GRAY_PLANKS.get(), "Gray Planks");
        add(Registration.PINK_PLANKS.get(), "Pink Planks");
        add(Registration.LIME_PLANKS.get(), "Lime Planks");
        add(Registration.YELLOW_PLANKS.get(), "Yellow Planks");
        add(Registration.LIGHT_BLUE_PLANKS.get(), "Light Blue Planks");
        add(Registration.MAGENTA_PLANKS.get(), "Magenta Planks");
        add(Registration.ORANGE_PLANKS.get(), "Orange Planks");
        add(Registration.WHITE_PLANKS.get(), "White Planks");

        add(Registration.BLACK_OAK_LEAVES.get(), "Black Leaves");
        add(Registration.RED_OAK_LEAVES.get(), "Red Leaves");
        add(Registration.GREEN_OAK_LEAVES.get(), "Green Leaves");
        add(Registration.BROWN_OAK_LEAVES.get(), "Brown Leaves");
        add(Registration.BLUE_OAK_LEAVES.get(), "Blue Leaves");
        add(Registration.PURPLE_OAK_LEAVES.get(), "Purple Leaves");
        add(Registration.CYAN_OAK_LEAVES.get(), "Cyan Leaves");
        add(Registration.LIGHT_GRAY_OAK_LEAVES.get(), "Light Gray Leaves");
        add(Registration.GRAY_OAK_LEAVES.get(), "Gray Leaves");
        add(Registration.PINK_OAK_LEAVES.get(), "Pink Leaves");
        add(Registration.LIME_OAK_LEAVES.get(), "Lime Leaves");
        add(Registration.YELLOW_OAK_LEAVES.get(), "Yellow Leaves");
        add(Registration.LIGHT_BLUE_OAK_LEAVES.get(), "Light Blue Leaves");
        add(Registration.MAGENTA_OAK_LEAVES.get(), "Magenta Leaves");
        add(Registration.ORANGE_OAK_LEAVES.get(), "Orange Leaves");
        add(Registration.WHITE_OAK_LEAVES.get(), "White Leaves");

        add(Registration.BLACK_STAIRS.get(), "Black Stairs");
        add(Registration.RED_STAIRS.get(), "Red Stairs");
        add(Registration.GREEN_STAIRS.get(), "Green Stairs");
        add(Registration.BROWN_STAIRS.get(), "Brown Stairs");
        add(Registration.BLUE_STAIRS.get(), "Blue Stairs");
        add(Registration.PURPLE_STAIRS.get(), "Purple Stairs");
        add(Registration.CYAN_STAIRS.get(), "Cyan Stairs");
        add(Registration.LIGHT_GRAY_STAIRS.get(), "Light Gray Stairs");
        add(Registration.GRAY_STAIRS.get(), "Gray Stairs");
        add(Registration.PINK_STAIRS.get(), "Pink Stairs");
        add(Registration.LIME_STAIRS.get(), "Lime Stairs");
        add(Registration.YELLOW_STAIRS.get(), "Yellow Stairs");
        add(Registration.LIGHT_BLUE_STAIRS.get(), "Light Blue Stairs");
        add(Registration.MAGENTA_STAIRS.get(), "Magenta Stairs");
        add(Registration.ORANGE_STAIRS.get(), "Orange Stairs");
        add(Registration.WHITE_STAIRS.get(), "White Stairs");

        add(Registration.BLACK_PAINT_ITEM.get(), "Black Paint");
        add(Registration.RED_PAINT_ITEM.get(), "Red Paint");
        add(Registration.GREEN_PAINT_ITEM.get(), "Green Paint");
        add(Registration.BROWN_PAINT_ITEM.get(), "Brown Paint");
        add(Registration.BLUE_PAINT_ITEM.get(), "Blue Paint");
        add(Registration.PURPLE_PAINT_ITEM.get(), "Purple Paint");
        add(Registration.CYAN_PAINT_ITEM.get(), "Cyan Paint");
        add(Registration.LIGHT_GRAY_PAINT_ITEM.get(), "Light Gray Paint");
        add(Registration.GRAY_PAINT_ITEM.get(), "Gray Paint");
        add(Registration.PINK_PAINT_ITEM.get(), "Pink Paint");
        add(Registration.LIME_PAINT_ITEM.get(), "Lime Paint");
        add(Registration.YELLOW_PAINT_ITEM.get(), "Yellow Paint");
        add(Registration.LIGHT_BLUE_PAINT_ITEM.get(), "Light Blue Paint");
        add(Registration.MAGENTA_PAINT_ITEM.get(), "Magenta Paint");
        add(Registration.ORANGE_PAINT_ITEM.get(), "Orange Paint");
        add(Registration.WHITE_PAINT_ITEM.get(), "White Paint");

        add(Registration.BLANK_PAINT_ROLLER.get(), "Blank Paint Roller");
    }
}
