package com.xiaochangmc.hideandseek.commands;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hideandseek implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
           ((Player) commandSender).getPlayer().sendMessage("你好鸭！");
        }
        else{
            System.out.println("[HideAndSeek]"+ Color.RED +"该指令只能由玩家执行！");
        }

        return false;
    }
}
