package com.quantumgarbage.gross;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import java.util.UUID;

import static org.bukkit.entity.EntityType.ITEM_FRAME;
public class EventHandlers implements Listener {
    private static final UUID CROW = UUID.fromString("490a39fc-f7f9-4aab-bb26-81e188bbd8aa");
    @EventHandler
    public void badCrow(PlayerInteractAtEntityEvent e) {
        boolean isCrow = (e.getPlayer().getUniqueId().equals(CROW));
        boolean isBad = (e.getRightClicked().getType().equals(ITEM_FRAME));
        if (isCrow && isBad) {
            e.setCancelled(true);
            ItemFrame iframe = (ItemFrame) e.getRightClicked();
            iframe.setRotation(iframe.getRotation().rotateCounterClockwise());
        }
    }
}