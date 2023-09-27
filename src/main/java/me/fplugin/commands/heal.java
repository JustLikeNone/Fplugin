package me.fplugin.commands;

import me.fplugin.Msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender,  Command command,String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            Msg.send(commandSender, "&cOnly players can use this command");
            return true;
        }


    Player player = (Player) commandSender;
        player.setHealth(20d);
        player.setFoodLevel(20);
        return true;
    }
}
