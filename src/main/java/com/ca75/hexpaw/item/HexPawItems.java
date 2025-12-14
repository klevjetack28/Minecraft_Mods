package com.ca75.hexpaw.item;

import com.ca75.hexpaw.HexPawUtilities;
import com.ca75.hexpaw.block.HexPawBlocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

public class HexPawItems {
    
    /**
     *  Create the items register that stores the items I create.
     */
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HexPawUtilities.MODID);

    /**
     *  All of the actual items I want to register I need to define them below.
     *
    public static final DeferredItem<BlockItem> CAT_TREE = ITEMS.registerSimpleBlockItem(
            "cat_tree",
            HexPawBlocks.CAT_TREE, 
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK = ITEMS.registerSimpleBlockItem(
            "example_block",
            HexPawBlocks.EXAMPLE_BLOCK, 
            new Item.Properties()
    );
    */
    public static void register(IEventBus event) {
        ITEMS.register(event);
    }
}
