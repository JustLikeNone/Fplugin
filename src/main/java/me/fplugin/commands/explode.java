package me.fplugin.commands;


import me.fplugin.CommandBase;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class explode {
    public explode() {
        new CommandBase("explode",0,1,true){
            @Override
            public boolean onCommand(CommandSender sender, String[] args){
                Player player = (Player) sender;
                float explosionPower;
                if (args.length == 0){
                    explosionPower = 4f;
                }else {
                    explosionPower = Float.parseFloat(args[0]);
                }
                player.getWorld().createExplosion(player,explosionPower);
                return true;
            }
        };
    }
}