package com.xiaochangmc.hideandseek.event;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoin implements Listener {
    Plugin plugin=com.xiaochangmc.hideandseek.main.getPlugin(com.xiaochangmc.hideandseek.main.class);
    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent event){
        String playerName = event.getPlayer().getName();
        //event.setJoinMessage("欢迎"+ ChatColor.GREEN +playerName+ChatColor.WHITE+" 进入"+ChatColor.YELLOW+"XiaochangServer"+ChatColor.WHITE+"插件测试服！");
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(event.getPlayer(), plugin.getConfig().getString("welcome_message"))));
    }
}
