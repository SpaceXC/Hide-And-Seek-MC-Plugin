package com.xiaochangmc.hideandseek.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class setkiller implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Inventory gui = Bukkit.createInventory(null,27, ChatColor.RED+"设置杀手");
        int Index = 0;
        if(commandSender instanceof Player){
            for (Player player:Bukkit.getOnlinePlayers()) {
                ((Player)commandSender).openInventory(gui);
                ItemStack skull = new ItemStack(Material.PLAYER_HEAD,1);
                SkullMeta meta = (SkullMeta) skull.getItemMeta();
                meta.setOwningPlayer((OfflinePlayer) player);
                meta.setDisplayName(ChatColor.YELLOW+((Player)player).getName());
                skull.setItemMeta(meta);
                gui.setItem(Index,skull);
                Index++;
            }
        }
        else{
            System.out.println(ChatColor.RED+"此命令只能由玩家执行！");
        }
        return false;
    }
}