package me.fplugin.commands;

import me.fplugin.CommandBase;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class i {
    public i(){
        new CommandBase("i",0,2, true){
            public boolean onCommand(CommandSender sender, String[] args){
                Player player = (Player) sender;;
                if (args.length != 3){
                    return false;
                }

                String type = args[0].toUpperCase();
                String name = args[1];
                int amount = Integer.parseInt(args[2]);

                Material material = Material.getMaterial(type);
                if (material == null){
                    return false;
                }

                ItemStack stack = new ItemStack(material, amount);
                ItemMeta meta = stack.getItemMeta();
                meta.setDisplayName(name);
                stack.setItemMeta(meta);

                player.getInventory().addItem(stack);
                return true;
            }
        };
    }
}
