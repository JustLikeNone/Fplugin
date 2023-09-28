package me.fplugin.commands;

import me.fplugin.CommandBase;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms {
    public gms(){
        new CommandBase("gms",0,1,true){
            @Override
            public boolean onCommand(CommandSender sender, String[] args) {
                Player player = (Player) sender;
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("you are now in Survival mode");
                return true;
            }
        };
    }
}
