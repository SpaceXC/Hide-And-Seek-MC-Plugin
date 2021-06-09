package com.xiaochangmc.hideandseek.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            //commandSender.sendMessage("您当前与服务器的延迟为：%player_ping%");
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',PlaceholderAPI.setPlaceholders((Player) commandSender,"当前与服务器的延迟为：&a%player_ping%ms。")));
        }
        else{
            commandSender.sendMessage("此命令只能由玩家执行！");
            return false;
        }
        return false;
    }
}