package com.ca75.hexpaw.block;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import com.ca75.hexpaw.HexPawUtilities;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

public class HexPawBlocks {

    /**
     * Create the registry for storing the modded blocks.
     */
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HexPawUtilities.MODID);

    // You can make slabs with <Block, SlabBlock>
    // The class is DeferredGolder<R, T extends R> so anything that extends R
    
    /**
     * Register each new block to the registry with its name followed by its instance.
     *
    public static final DeferredBlock<Block> CAT_TREE = BLOCKS.registerSimpleBlock(
            "cat_tree",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
    );
    // Creates a new Block with the id "hexpawutilities:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock(
            "example_block", 
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
    );
    */
    public static void register(IEventBus modBus) {
        BLOCKS.register(modBus);
    }
}
