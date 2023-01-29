package com.example.colortrees.datagen;

import com.example.colortrees.setup.Registration;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class CTRecipes extends RecipeProvider {

    public CTRecipes(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BLANK_PAINT_ROLLER.get())
            .pattern("x")
            .pattern("y")
            .pattern("z")
            .define('x', Items.WHITE_WOOL)
            .define('y', Items.IRON_INGOT)
            .define('z', Items.STICK);
        


        // Define recipes for Paint items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.BLACK_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.RED_PAINT_ITEM.get())
            .requires(Items.RED_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.GREEN_PAINT_ITEM.get())
            .requires(Items.GREEN_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.BROWN_PAINT_ITEM.get())
            .requires(Items.BROWN_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.BLUE_PAINT_ITEM.get())
            .requires(Items.BLUE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.PURPLE_PAINT_ITEM.get())
            .requires(Items.PURPLE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.CYAN_PAINT_ITEM.get())
            .requires(Items.CYAN_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.LIGHT_GRAY_PAINT_ITEM.get())
            .requires(Items.LIGHT_GRAY_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.GRAY_PAINT_ITEM.get())
            .requires(Items.GRAY_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.PINK_PAINT_ITEM.get())
            .requires(Items.PINK_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.LIME_PAINT_ITEM.get())
            .requires(Items.LIME_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.YELLOW_PAINT_ITEM.get())
            .requires(Items.YELLOW_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.LIGHT_BLUE_PAINT_ITEM.get())
            .requires(Items.LIGHT_BLUE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.MAGENTA_PAINT_ITEM.get())
            .requires(Items.MAGENTA_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.ORANGE_PAINT_ITEM.get())
            .requires(Items.ORANGE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.WHITE_PAINT_ITEM.get())
            .requires(Items.WHITE_DYE)
            .requires(Items.WATER_BUCKET)
            .save(consumer);



        // Define recipes for Paint Roller items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.BLACK_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.RED_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.RED_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.GREEN_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.GREEN_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.BROWN_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.BROWN_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.BLUE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.BLUE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.PURPLE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.CYAN_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.CYAN_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.GRAY_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.GRAY_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.PINK_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.PINK_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.LIME_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.LIME_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.YELLOW_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.MAGENTA_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.ORANGE_PAINT_ITEM.get())
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Registration.WHITE_PAINT_ROLLER.get())
            .requires(Registration.BLANK_PAINT_ROLLER.get())
            .requires(Registration.WHITE_PAINT_ITEM.get())
            .save(consumer);



        // Define recipes for Colored Oak Log blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLACK_OAK_LOG_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.RED_OAK_LOG_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GREEN_OAK_LOG_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BROWN_OAK_LOG_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLUE_OAK_LOG_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PURPLE_OAK_LOG_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.CYAN_OAK_LOG_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_GRAY_OAK_LOG_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GRAY_OAK_LOG_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PINK_OAK_LOG_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIME_OAK_LOG_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.YELLOW_OAK_LOG_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_BLUE_OAK_LOG_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.MAGENTA_OAK_LOG_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.ORANGE_OAK_LOG_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.WHITE_OAK_LOG_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.OAK_LOG)
            .save(consumer);



        // Define recipes for Colored Birch Log blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLACK_BIRCH_LOG_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.RED_BIRCH_LOG_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GREEN_BIRCH_LOG_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BROWN_BIRCH_LOG_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLUE_BIRCH_LOG_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PURPLE_BIRCH_LOG_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.CYAN_BIRCH_LOG_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_GRAY_BIRCH_LOG_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GRAY_BIRCH_LOG_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PINK_BIRCH_LOG_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIME_BIRCH_LOG_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.YELLOW_BIRCH_LOG_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_BLUE_BIRCH_LOG_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.MAGENTA_BIRCH_LOG_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.ORANGE_BIRCH_LOG_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.WHITE_BIRCH_LOG_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.BIRCH_LOG)
            .save(consumer);



        // Define recipes for Colored Oak Planks blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLACK_PLANKS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.RED_PLANKS_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GREEN_PLANKS_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BROWN_PLANKS_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLUE_PLANKS_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PURPLE_PLANKS_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.CYAN_PLANKS_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_GRAY_PLANKS_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GRAY_PLANKS_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PINK_PLANKS_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIME_PLANKS_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.YELLOW_PLANKS_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_BLUE_PLANKS_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.MAGENTA_PLANKS_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.ORANGE_PLANKS_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.WHITE_PLANKS_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.OAK_PLANKS)
            .save(consumer);
            
            

        // Define recipes for Colored Oak Leaves blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLACK_OAK_LEAVES_ITEM.get())
            .requires(Registration.BLACK_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.RED_OAK_LEAVES_ITEM.get())
            .requires(Registration.RED_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GREEN_OAK_LEAVES_ITEM.get())
            .requires(Registration.GREEN_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BROWN_OAK_LEAVES_ITEM.get())
            .requires(Registration.BROWN_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLUE_OAK_LEAVES_ITEM.get())
            .requires(Registration.BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PURPLE_OAK_LEAVES_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.CYAN_OAK_LEAVES_ITEM.get())
            .requires(Registration.CYAN_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_GRAY_OAK_LEAVES_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GRAY_OAK_LEAVES_ITEM.get())
            .requires(Registration.GRAY_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PINK_OAK_LEAVES_ITEM.get())
            .requires(Registration.PINK_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIME_OAK_LEAVES_ITEM.get())
            .requires(Registration.LIME_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.YELLOW_OAK_LEAVES_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_BLUE_OAK_LEAVES_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.MAGENTA_OAK_LEAVES_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.ORANGE_OAK_LEAVES_ITEM.get())
            .requires(Registration.ORANGE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.WHITE_OAK_LEAVES_ITEM.get())
            .requires(Registration.WHITE_PAINT_ROLLER.get())
            .requires(Items.OAK_LEAVES)
            .save(consumer);




        // Define recipes for Colored Stairs
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLACK_STAIRS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.RED_STAIRS_ITEM.get())
            .requires(Registration.RED_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GREEN_STAIRS_ITEM.get())
            .requires(Registration.GREEN_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BROWN_STAIRS_ITEM.get())
            .requires(Registration.BROWN_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.BLUE_STAIRS_ITEM.get())
            .requires(Registration.BLUE_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PURPLE_STAIRS_ITEM.get())
            .requires(Registration.PURPLE_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.CYAN_STAIRS_ITEM.get())
            .requires(Registration.CYAN_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_GRAY_STAIRS_ITEM.get())
            .requires(Registration.LIGHT_GRAY_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.GRAY_STAIRS_ITEM.get())
            .requires(Registration.GRAY_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.PINK_STAIRS_ITEM.get())
            .requires(Registration.PINK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIME_STAIRS_ITEM.get())
            .requires(Registration.LIME_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.YELLOW_STAIRS_ITEM.get())
            .requires(Registration.YELLOW_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.LIGHT_BLUE_STAIRS_ITEM.get())
            .requires(Registration.LIGHT_BLUE_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.MAGENTA_STAIRS_ITEM.get())
            .requires(Registration.MAGENTA_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.ORANGE_STAIRS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Registration.WHITE_STAIRS_ITEM.get())
            .requires(Registration.BLACK_PAINT_ITEM.get())
            .requires(Items.OAK_STAIRS)
            .save(consumer);
    }
}
