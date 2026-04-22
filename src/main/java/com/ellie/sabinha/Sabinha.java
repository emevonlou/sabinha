package com.ellie.sabinha;

import org.bukkit.plugin.java.JavaPlugin;

public class Sabinha extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Sabinha acordou 🐦✨");
        getCommand("sabinha").setExecutor(new SabinhaCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Sabinha foi dormir 🌙");
    }
}
