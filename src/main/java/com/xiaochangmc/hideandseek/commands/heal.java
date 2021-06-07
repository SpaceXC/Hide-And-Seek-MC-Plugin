package com.xiaochangmc.hideandseek.commands;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            if(((Player) commandSender).getHealth()<20){
                ((Player) commandSender).setHealth(20);
                commandSender.sendMessage(ChatColor.GREEN+"您已经完成回血！");
            }
            else{
                commandSender.sendMessage(ChatColor.YELLOW+"您不需要回血！");
                return false;
            }
        }
        else{
            commandSender.sendMessage(ChatColor.RED+"此命令只能由玩家执行！");
            return false;
        }
        return false;
    }
}
