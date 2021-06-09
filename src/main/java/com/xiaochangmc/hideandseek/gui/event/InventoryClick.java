package com.xiaochangmc.hideandseek.gui.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class InventoryClick implements Listener {
    @EventHandler
    public void ClickGUI(InventoryClickEvent event){
        /* 主菜单 */
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE+"菜单")||event.getView().getTitle().equalsIgnoreCase(ChatColor.RED+"设置杀手")){
            event.setCancelled(true);
            /* 菜单GUI事件 */
            if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED+"设置杀手")){
                /*Inventory setkiller = Bukkit.createInventory(null,27, ChatColor.RED+"设置杀手");
                int Index=0;
                for (Player player : org.bukkit.Bukkit.getOnlinePlayers()){
                    ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
                    SkullMeta meta = (SkullMeta)skull.getItemMeta();
                    meta.setOwner(player.getName());
                    meta.setDisplayName(ChatColor.YELLOW+player.getName());
                    Index++;
                }
                Bukkit.getPlayer("XiaochangMC").openInventory(setkiller);
                Bukkit.getPlayer("XiaochangMC").sendMessage("设置杀手");*/
            }
        }
    }
}
