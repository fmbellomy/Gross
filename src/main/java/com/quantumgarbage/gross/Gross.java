package com.quantumgarbage.gross;

import org.bukkit.plugin.java.JavaPlugin;
public final class Gross extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventHandlers(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
