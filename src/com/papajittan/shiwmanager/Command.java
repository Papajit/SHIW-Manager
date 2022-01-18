package com.papajittan.shiwmanager;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String string, String[] args) {
        var cmd = command.getName();
        if(cmd.equalsIgnoreCase("classcheck")){
            if(args.length <= 0){
                commandSender.sendMessage(ChatColor.RED + "Please enter player name that you want to check!");
                return true;
            }
            PluginSupporter.Data playercalss = PluginSupporter.GetPlayerClass(args[0]);
            if(playercalss == null){
                commandSender.sendMessage(ChatColor.RED + "I can't find the player's class!");
                return true;
            }
            String playerclass = playercalss.Class;
            commandSender.sendMessage(ChatColor.GREEN + args[0] + "'s" + ChatColor.GOLD + " class is " + ChatColor.RED + playerclass);
            return true;
        }
        return true;
    }
}
