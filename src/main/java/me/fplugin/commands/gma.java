package me.fplugin.commands;

import me.fplugin.CommandBase;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gma {
    public gma(){
        new CommandBase("gma",0,1,true){
            @Override
            public boolean onCommand(CommandSender sender, String[] args) {
                Player player = (Player) sender;
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("you are now in Adventure mode");
                return true;
            }
        };
    }
}
