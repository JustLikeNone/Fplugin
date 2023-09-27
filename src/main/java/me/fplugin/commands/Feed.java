package me.fplugin.commands;

import me.fplugin.CommandBase;
import me.fplugin.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed {
    public Feed(){
        new CommandBase("feed",0,1,true){
            @Override
            public boolean onCommand(CommandSender sender, String[] args){
                Player player = (Player) sender;
                player.setFoodLevel(20);
                return true;
            }

            @Override
            public String getUsage(){
                return "You've been Fed";
            }
        }.enableDelay(2);
    }
}
