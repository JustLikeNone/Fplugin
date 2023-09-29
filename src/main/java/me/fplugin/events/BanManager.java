package me.fplugin.events;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BanManager implements Listener {

    @EventHandler
    public void badMessageBan(AsyncChatEvent event){
        if (event.message().contains(Component.text("Fuck")));
        try {
            Entity pl = event.getPlayer();
            String player = pl.getName();
            Bukkit.getBanList(BanList.Type.NAME).addBan(player, "bec hes stupid", null, "console");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
