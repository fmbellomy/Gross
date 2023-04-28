package com.quantumgarbage.gross;

import static org.bukkit.entity.EntityType.ITEM_FRAME;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import java.util.UUID;
public class EventHandlers implements Listener {
    private static final UUID CROW = UUID.fromString("490a39fc-f7f9-4aab-bb26-81e188bbd8aa");
    @EventHandler
    public void badCrow(PlayerInteractAtEntityEvent e){
        boolean isCrow = (e.getPlayer().getUniqueId().equals(CROW));
        boolean isBad = (e.getRightClicked().getType().equals(ITEM_FRAME));
        e.setCancelled(isCrow && isBad);
    }
}