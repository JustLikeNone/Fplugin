package me.fplugin.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class EventManager implements Listener {

    @EventHandler
    public void entityDamage(EntityDamageEvent event){
        Entity damagedEntity = event.getEntity();
        if (event.getCause() != EntityDamageEvent.DamageCause.FALL || damagedEntity.getType() == EntityType.PIG){
            return;
        }


        damagedEntity.getWorld().createExplosion(damagedEntity,4.0f);
    }

    @EventHandler
    public void entityDamageByEntity(EntityDamageByEntityEvent event){
        if (event.getEntityType() != EntityType.VILLAGER) {
            return;
        }


    Entity de = event.getEntity();
        de.getWorld().spawnEntity(de.getLocation(), EntityType.IRON_GOLEM);
    }
}
