package com.ca75.hexpaw.feature.farming;

import com.ca75.hexpaw.HexPawUtilities;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(modid = HexPawUtilities.MODID, value = Dist.CLIENT)
public class FarmHighlightLogic {
    
    static ItemStack mainHandItem = null;
    static ItemStack offHandItem = null;

    public static boolean isHoe(ItemStack stack) {
        return stack.getItem() instanceof HoeItem;
    }

    private static void getHands(Player player) {
        mainHandItem = player.getMainHandItem();
        offHandItem = player.getOffhandItem();
    }
    
    @SubscribeEvent
    public static void showTiles(PlayerTickEvent.Post event) {
         Player player = event.getEntity();

        // Only do this on the client
        if (!player.level().isClientSide()) return;

        getHands(player);
        if (isHoe(mainHandItem) || isHoe(offHandItem)) {
            System.out.println("Holding A Hoe");
        }
    }
}
