package me.fplugin.commands;

import me.fplugin.CommandBase;
import me.fplugin.Msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal {
    public heal() {
        new CommandBase("heal", 0, -1, true) {
            @Override
            public boolean onCommand(CommandSender sender, String[] strings) {
                Player player = (Player) sender;
                player.setHealth(20d);
                player.setFoodLevel(20);
                return true;
            }

            @Override
            public String getUsage() {
                return "You've been healed";
            }
        };
    }
}
