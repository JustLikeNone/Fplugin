package me.fplugin;

import me.fplugin.commands.*;
import me.fplugin.events.EventManager;
import me.fplugin.events.Kill_On_Placing_Torch;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fplugin extends JavaPlugin {
    private static Fplugin instance;

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("FPlugin has been enabled");

        Bukkit.getPluginManager().registerEvents(new EventManager(), this);
        /*Bukkit.getPluginManager().registerEvents(new Kill_On_Placing_Torch(), this);*/
        new heal();
        new Feed();
        new explode();

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin is Shutting down");
    }

    public static Fplugin getInstance() {
        return instance;
    }
}
