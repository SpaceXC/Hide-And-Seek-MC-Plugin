package com.xiaochangmc.hideandseek.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class menu implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Inventory gui = Bukkit.createInventory(null,27, ChatColor.BLUE+"菜单");

        if(commandSender instanceof Player){
            ((Player) commandSender).openInventory(gui);

            ItemStack setkiller = new ItemStack(Material.PLAYER_HEAD,1);
            setkiller.getItemMeta().setDisplayName(ChatColor.RED+"设置杀手");
            gui.setItem(0,setkiller);
        }
        else{
            System.out.println(Color.RED+"[ERROR]这条指令只能由玩家执行！");
        }
        return false;
    }
}