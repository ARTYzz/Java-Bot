package com.artyz;

import com.artyz.Bot.connectBot;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
       connectBot.connect();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
