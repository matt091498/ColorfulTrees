package com.example.colortrees.datagen;

import com.example.colortrees.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class CTRecipes extends RecipeProvider {

    public CTRecipes(DataGenerator generator) {
        super(generator);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(Registration.BLANK_PAINT_ROLLER.get())
            .pattern("x")
            .pattern("y")
            .pattern("z")
            .define('x', Items.WHITE_WOOL)
            .define('y', Items.IRON_INGOT)
            .define('z', Items.STICK);
        


        // Define recipes for Paint items
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.BLACK_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_PAINT_ITEM.get())
            .requires(Items.RED_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_PAINT_ITEM.get())
            .requires(Items.GREEN_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_PAINT_ITEM.get())
            .requires(Items.BROWN_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_PAINT_ITEM.get())
            .requires(Items.BLUE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_PAINT_ITEM.get())
            .requires(Items.PURPLE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_PAINT_ITEM.get())
            .requires(Items.CYAN_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_PAINT_ITEM.get())
            .requires(Items.LIGHT_GRAY_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_PAINT_ITEM.get())
            .requires(Items.GRAY_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_PAINT_ITEM.get())
            .requires(Items.PINK_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_PAINT_ITEM.get())
            .requires(Items.LIME_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_PAINT_ITEM.get())
            .requires(Items.YELLOW_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_PAINT_ITEM.get())
            .requires(Items.LIGHT_BLUE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_PAINT_ITEM.get())
            .requires(Items.MAGENTA_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_PAINT_ITEM.get())
            .requires(Items.ORANGE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_PAINT_ITEM.get())
            .requires(Items.WHITE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);



        // Define recipes for Paint Roller items
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.RED_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.GREEN_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.BROWN_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.BLUE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.PURPLE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.CYAN_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.GRAY_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.PINK_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.LIME_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.YELLOW_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.MAGENTA_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.ORANGE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.WHITE_PAINT_ITEM.get())
            .save(consumer);



        // Define recipes for Colored Oak Log blocks
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_OAK_LOG_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_OAK_LOG_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_OAK_LOG_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_OAK_LOG_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_OAK_LOG_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_OAK_LOG_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_OAK_LOG_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_OAK_LOG_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_OAK_LOG_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_OAK_LOG_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_OAK_LOG_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_OAK_LOG_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_OAK_LOG_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_OAK_LOG_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_OAK_LOG_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_OAK_LOG_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);



        // Define recipes for Colored Birch Log blocks
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_BIRCH_LOG_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_BIRCH_LOG_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_BIRCH_LOG_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_BIRCH_LOG_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_BIRCH_LOG_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_BIRCH_LOG_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_BIRCH_LOG_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_BIRCH_LOG_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_BIRCH_LOG_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_BIRCH_LOG_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_BIRCH_LOG_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_BIRCH_LOG_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_BIRCH_LOG_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_BIRCH_LOG_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_BIRCH_LOG_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_BIRCH_LOG_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);



        // Define recipes for Colored Oak Planks blocks
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_PLANKS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_PLANKS_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_PLANKS_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_PLANKS_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_PLANKS_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_PLANKS_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_PLANKS_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_PLANKS_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_PLANKS_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_PLANKS_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_PLANKS_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_PLANKS_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_PLANKS_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_PLANKS_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_PLANKS_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_PLANKS_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
            
            

        // Define recipes for Colored Oak Leaves blocks
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_OAK_LEAVES_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_OAK_LEAVES_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_OAK_LEAVES_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_OAK_LEAVES_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_OAK_LEAVES_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_OAK_LEAVES_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_OAK_LEAVES_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_OAK_LEAVES_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_OAK_LEAVES_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_OAK_LEAVES_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_OAK_LEAVES_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_OAK_LEAVES_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_OAK_LEAVES_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_OAK_LEAVES_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_OAK_LEAVES_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_OAK_LEAVES_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);



        // Define recipes for Colored Stairs
        ShapelessRecipeBuilder.shapeless(Registration.BLACK_STAIRS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.RED_STAIRS_ITEM.get())
            .requires(Registration.RED_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GREEN_STAIRS_ITEM.get())
            .requires(Registration.GREEN_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BROWN_STAIRS_ITEM.get())
            .requires(Registration.BROWN_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.BLUE_STAIRS_ITEM.get())
            .requires(Registration.BLUE_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PURPLE_STAIRS_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.CYAN_STAIRS_ITEM.get())
            .requires(Registration.CYAN_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_GRAY_STAIRS_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.GRAY_STAIRS_ITEM.get())
            .requires(Registration.GRAY_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PINK_STAIRS_ITEM.get())
            .requires(Registration.PINK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIME_STAIRS_ITEM.get())
            .requires(Registration.LIME_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.YELLOW_STAIRS_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LIGHT_BLUE_STAIRS_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.MAGENTA_STAIRS_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.ORANGE_STAIRS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.WHITE_STAIRS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
    }
}
