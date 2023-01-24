package com.example.colortrees.setup;

import com.example.colortrees.custom_item.paint_roller_item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.colortrees.colortrees.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final BlockBehaviour.Properties WOOD_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOD)
        .strength(3f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();
    public static final Item.Properties ROLLER_PROPERTIES = new Item.Properties()
        .durability(64);

    // Registration for Colored Oak Logs
    public static final RegistryObject<RotatedPillarBlock> BLACK_OAK_LOG = BLOCKS.register("black_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BLACK_OAK_LOG_ITEM = fromBlock(BLACK_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> RED_OAK_LOG = BLOCKS.register("red_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> RED_OAK_LOG_ITEM = fromBlock(RED_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> GREEN_OAK_LOG = BLOCKS.register("green_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> GREEN_OAK_LOG_ITEM = fromBlock(GREEN_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> BROWN_OAK_LOG = BLOCKS.register("brown_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BROWN_OAK_LOG_ITEM = fromBlock(BROWN_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> BLUE_OAK_LOG = BLOCKS.register("blue_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BLUE_OAK_LOG_ITEM = fromBlock(BLUE_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> PURPLE_OAK_LOG = BLOCKS.register("purple_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_OAK_LOG_ITEM = fromBlock(PURPLE_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> CYAN_OAK_LOG = BLOCKS.register("cyan_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> CYAN_OAK_LOG_ITEM = fromBlock(CYAN_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> LIGHT_GRAY_OAK_LOG = BLOCKS.register("light_gray_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_OAK_LOG_ITEM = fromBlock(LIGHT_GRAY_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> GRAY_OAK_LOG = BLOCKS.register("gray_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> GRAY_OAK_LOG_ITEM = fromBlock(GRAY_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> PINK_OAK_LOG = BLOCKS.register("pink_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> PINK_OAK_LOG_ITEM = fromBlock(PINK_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> LIME_OAK_LOG = BLOCKS.register("lime_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIME_OAK_LOG_ITEM = fromBlock(LIME_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> YELLOW_OAK_LOG = BLOCKS.register("yellow_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_OAK_LOG_ITEM = fromBlock(YELLOW_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> LIGHT_BLUE_OAK_LOG = BLOCKS.register("light_blue_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_OAK_LOG_ITEM = fromBlock(LIGHT_BLUE_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> MAGENTA_OAK_LOG = BLOCKS.register("magenta_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_OAK_LOG_ITEM = fromBlock(MAGENTA_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> ORANGE_OAK_LOG = BLOCKS.register("orange_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_OAK_LOG_ITEM = fromBlock(ORANGE_OAK_LOG);
    public static final RegistryObject<RotatedPillarBlock> WHITE_OAK_LOG = BLOCKS.register("white_oak_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> WHITE_OAK_LOG_ITEM = fromBlock(WHITE_OAK_LOG);

    // Registration for Colored Birch Logs
    public static final RegistryObject<RotatedPillarBlock> BLACK_BIRCH_LOG = BLOCKS.register("black_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BLACK_BIRCH_LOG_ITEM = fromBlock(BLACK_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> RED_BIRCH_LOG = BLOCKS.register("red_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> RED_BIRCH_LOG_ITEM = fromBlock(RED_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> GREEN_BIRCH_LOG = BLOCKS.register("green_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> GREEN_BIRCH_LOG_ITEM = fromBlock(GREEN_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> BROWN_BIRCH_LOG = BLOCKS.register("brown_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BROWN_BIRCH_LOG_ITEM = fromBlock(BROWN_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> BLUE_BIRCH_LOG = BLOCKS.register("blue_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BLUE_BIRCH_LOG_ITEM = fromBlock(BLUE_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> PURPLE_BIRCH_LOG = BLOCKS.register("purple_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_BIRCH_LOG_ITEM = fromBlock(PURPLE_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> CYAN_BIRCH_LOG = BLOCKS.register("cyan_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> CYAN_BIRCH_LOG_ITEM = fromBlock(CYAN_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> LIGHT_GRAY_BIRCH_LOG = BLOCKS.register("light_gray_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_BIRCH_LOG_ITEM = fromBlock(LIGHT_GRAY_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> GRAY_BIRCH_LOG = BLOCKS.register("gray_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> GRAY_BIRCH_LOG_ITEM = fromBlock(GRAY_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> PINK_BIRCH_LOG = BLOCKS.register("pink_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> PINK_BIRCH_LOG_ITEM = fromBlock(PINK_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> LIME_BIRCH_LOG = BLOCKS.register("lime_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIME_BIRCH_LOG_ITEM = fromBlock(LIME_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> YELLOW_BIRCH_LOG = BLOCKS.register("yellow_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_BIRCH_LOG_ITEM = fromBlock(YELLOW_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> LIGHT_BLUE_BIRCH_LOG = BLOCKS.register("light_blue_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_BIRCH_LOG_ITEM = fromBlock(LIGHT_BLUE_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> MAGENTA_BIRCH_LOG = BLOCKS.register("magenta_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_BIRCH_LOG_ITEM = fromBlock(MAGENTA_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> ORANGE_BIRCH_LOG = BLOCKS.register("orange_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_BIRCH_LOG_ITEM = fromBlock(ORANGE_BIRCH_LOG);
    public static final RegistryObject<RotatedPillarBlock> WHITE_BIRCH_LOG = BLOCKS.register("white_birch_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES));
    public static final RegistryObject<Item> WHITE_BIRCH_LOG_ITEM = fromBlock(WHITE_BIRCH_LOG);

    // Registration for Colored Planks
    public static final RegistryObject<Block> BLACK_PLANKS = BLOCKS.register("black_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BLACK_PLANKS_ITEM = fromBlock(BLACK_PLANKS);
    public static final RegistryObject<Block> RED_PLANKS = BLOCKS.register("red_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> RED_PLANKS_ITEM = fromBlock(RED_PLANKS);
    public static final RegistryObject<Block> GREEN_PLANKS = BLOCKS.register("green_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> GREEN_PLANKS_ITEM = fromBlock(GREEN_PLANKS);
    public static final RegistryObject<Block> BROWN_PLANKS = BLOCKS.register("brown_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BROWN_PLANKS_ITEM = fromBlock(BROWN_PLANKS);
    public static final RegistryObject<Block> BLUE_PLANKS = BLOCKS.register("blue_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> BLUE_PLANKS_ITEM = fromBlock(BLUE_PLANKS);
    public static final RegistryObject<Block> PURPLE_PLANKS = BLOCKS.register("purple_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_PLANKS_ITEM = fromBlock(PURPLE_PLANKS);
    public static final RegistryObject<Block> CYAN_PLANKS = BLOCKS.register("cyan_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> CYAN_PLANKS_ITEM = fromBlock(CYAN_PLANKS);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = BLOCKS.register("light_gray_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANKS_ITEM = fromBlock(LIGHT_GRAY_PLANKS);
    public static final RegistryObject<Block> GRAY_PLANKS = BLOCKS.register("gray_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> GRAY_PLANKS_ITEM = fromBlock(GRAY_PLANKS);
    public static final RegistryObject<Block> PINK_PLANKS = BLOCKS.register("pink_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> PINK_PLANKS_ITEM = fromBlock(PINK_PLANKS);
    public static final RegistryObject<Block> LIME_PLANKS = BLOCKS.register("lime_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIME_PLANKS_ITEM = fromBlock(LIME_PLANKS);
    public static final RegistryObject<Block> YELLOW_PLANKS = BLOCKS.register("yellow_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_PLANKS_ITEM = fromBlock(YELLOW_PLANKS);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = BLOCKS.register("light_blue_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANKS_ITEM = fromBlock(LIGHT_BLUE_PLANKS);
    public static final RegistryObject<Block> MAGENTA_PLANKS = BLOCKS.register("magenta_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_PLANKS_ITEM = fromBlock(MAGENTA_PLANKS);
    public static final RegistryObject<Block> ORANGE_PLANKS = BLOCKS.register("orange_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_PLANKS_ITEM = fromBlock(ORANGE_PLANKS);
    public static final RegistryObject<Block> WHITE_PLANKS = BLOCKS.register("white_oak_planks", () -> new Block(WOOD_PROPERTIES));
    public static final RegistryObject<Item> WHITE_PLANKS_ITEM = fromBlock(WHITE_PLANKS);

    // Registration for Colored Oak Leaves
    public static final RegistryObject<LeavesBlock> BLACK_OAK_LEAVES = BLOCKS.register("black_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> BLACK_OAK_LEAVES_ITEM = fromBlock(BLACK_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> RED_OAK_LEAVES = BLOCKS.register("red_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> RED_OAK_LEAVES_ITEM = fromBlock(RED_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> GREEN_OAK_LEAVES = BLOCKS.register("green_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> GREEN_OAK_LEAVES_ITEM = fromBlock(GREEN_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> BROWN_OAK_LEAVES = BLOCKS.register("brown_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> BROWN_OAK_LEAVES_ITEM = fromBlock(BROWN_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> BLUE_OAK_LEAVES = BLOCKS.register("blue_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> BLUE_OAK_LEAVES_ITEM = fromBlock(BLUE_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> PURPLE_OAK_LEAVES = BLOCKS.register("purple_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> PURPLE_OAK_LEAVES_ITEM = fromBlock(PURPLE_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> CYAN_OAK_LEAVES = BLOCKS.register("cyan_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> CYAN_OAK_LEAVES_ITEM = fromBlock(CYAN_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> LIGHT_GRAY_OAK_LEAVES = BLOCKS.register("light_gray_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> LIGHT_GRAY_OAK_LEAVES_ITEM = fromBlock(LIGHT_GRAY_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> GRAY_OAK_LEAVES = BLOCKS.register("gray_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> GRAY_OAK_LEAVES_ITEM = fromBlock(GRAY_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> PINK_OAK_LEAVES = BLOCKS.register("pink_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> PINK_OAK_LEAVES_ITEM = fromBlock(PINK_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> LIME_OAK_LEAVES = BLOCKS.register("lime_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> LIME_OAK_LEAVES_ITEM = fromBlock(LIME_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> YELLOW_OAK_LEAVES = BLOCKS.register("yellow_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> YELLOW_OAK_LEAVES_ITEM = fromBlock(YELLOW_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> LIGHT_BLUE_OAK_LEAVES = BLOCKS.register("light_blue_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> LIGHT_BLUE_OAK_LEAVES_ITEM = fromBlock(LIGHT_BLUE_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> MAGENTA_OAK_LEAVES = BLOCKS.register("magenta_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> MAGENTA_OAK_LEAVES_ITEM = fromBlock(MAGENTA_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> ORANGE_OAK_LEAVES = BLOCKS.register("orange_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> ORANGE_OAK_LEAVES_ITEM = fromBlock(ORANGE_OAK_LEAVES);
    public static final RegistryObject<LeavesBlock> WHITE_OAK_LEAVES = BLOCKS.register("white_oak_leaves", 
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> WHITE_OAK_LEAVES_ITEM = fromBlock(WHITE_OAK_LEAVES);

    // Registration for Paint Items
    public static final RegistryObject<Item> BLACK_PAINT_ITEM = ITEMS.register("black_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RED_PAINT_ITEM = ITEMS.register("red_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> GREEN_PAINT_ITEM = ITEMS.register("green_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BROWN_PAINT_ITEM = ITEMS.register("brown_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BLUE_PAINT_ITEM = ITEMS.register("blue_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_PAINT_ITEM = ITEMS.register("purple_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CYAN_PAINT_ITEM = ITEMS.register("cyan_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_PAINT_ITEM = ITEMS.register("light_gray_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> GRAY_PAINT_ITEM = ITEMS.register("gray_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PINK_PAINT_ITEM = ITEMS.register("pink_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LIME_PAINT_ITEM = ITEMS.register("lime_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_PAINT_ITEM = ITEMS.register("yellow_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_PAINT_ITEM = ITEMS.register("light_blue_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_PAINT_ITEM = ITEMS.register("magenta_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_PAINT_ITEM = ITEMS.register("orange_paint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> WHITE_PAINT_ITEM = ITEMS.register("white_paint", () -> new Item(ITEM_PROPERTIES));

    // Registration for Paint Roller items
    public static final RegistryObject<Item> BLANK_PAINT_ROLLER = ITEMS.register("paint_roller", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BLACK_PAINT_ROLLER = ITEMS.register("black_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> RED_PAINT_ROLLER = ITEMS.register("red_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> GREEN_PAINT_ROLLER = ITEMS.register("green_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> BROWN_PAINT_ROLLER = ITEMS.register("brown_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> BLUE_PAINT_ROLLER = ITEMS.register("blue_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> PURPLE_PAINT_ROLLER = ITEMS.register("purple_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> CYAN_PAINT_ROLLER = ITEMS.register("cyan_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> LIGHT_GRAY_PAINT_ROLLER = ITEMS.register("light_gray_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> GRAY_PAINT_ROLLER = ITEMS.register("gray_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> PINK_PAINT_ROLLER = ITEMS.register("pink_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> LIME_PAINT_ROLLER = ITEMS.register("lime_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> YELLOW_PAINT_ROLLER = ITEMS.register("yellow_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> LIGHT_BLUE_PAINT_ROLLER = ITEMS.register("light_blue_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> MAGENTA_PAINT_ROLLER = ITEMS.register("magenta_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> ORANGE_PAINT_ROLLER = ITEMS.register("orange_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> WHITE_PAINT_ROLLER = ITEMS.register("white_paint_roller", 
        () -> new paint_roller_item(new Item.Properties().durability(64)));

    // Registration for Block Items
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
