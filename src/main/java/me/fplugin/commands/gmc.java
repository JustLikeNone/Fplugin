package me.fplugin.commands;

import me.fplugin.CommandBase;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmc {
    public gmc(){
        new CommandBase("gmc",0,1,true){
            @Override
            public boolean onCommand(CommandSender sender, String[] args) {
                Player player = (Player) sender;
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("you are now in Creative mode");
                return true;
            }
        };
    }
}
