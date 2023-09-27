package me.fplugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Kill_On_Placing_Torch implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
       Material type =  event.getBlockPlaced().getType();
       if (type == Material.TORCH) {
           Player player = event.getPlayer();
           player.setHealth(0d);
       }
    }
}
