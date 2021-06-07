package com.xiaochangmc.hideandseek.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

public class set_killer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender.hasPermission("hideandseek.modifygame.setkiller")) {
            if (args.length == 1) {
                String chosenPlayerName = args[0];
                Player chosenPlayer = Bukkit.getPlayer(chosenPlayerName);
                if (chosenPlayer == null) {
                    commandSender.sendMessage("[HideAndSeek]"+ChatColor.RED+"玩家"+chosenPlayerName+"不在服务器中！");
                    return false;
                }
            }
            else {
                commandSender.sendMessage("[HideAndSeek] " + ChatColor.RED + "你输入的指令语法不正确！");
            }
            return false;
        }
        else{
            commandSender.sendMessage(ChatColor.RED+"你没有执行该指令的权限！");
            return false;
        }
    }
}