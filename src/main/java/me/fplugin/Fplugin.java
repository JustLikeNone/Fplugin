package me.fplugin;

import me.fplugin.commands.Feed;
import me.fplugin.commands.heal;
import me.fplugin.events.Kill_On_Placing_Torch;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fplugin extends JavaPlugin {
    private static Fplugin instance;

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("FPlugin has seen enabled");

        Bukkit.getPluginManager().registerEvents(new Kill_On_Placing_Torch(), this);
        getCommand("heal").setExecutor(new heal());
        new Feed();

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin is Shutting down");
    }

    public static Fplugin getInstance() {
        return instance;
    }
}
