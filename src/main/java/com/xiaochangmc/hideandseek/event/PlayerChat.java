package com.xiaochangmc.hideandseek.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class PlayerChat implements Listener {
    Plugin plugin=com.xiaochangmc.hideandseek.main.getPlugin(com.xiaochangmc.hideandseek.main.class);
    @EventHandler
    public void DetectMessage(AsyncPlayerChatEvent event){
        String message = event.getMessage();
        if(message.contains("sb")||message.contains("nmsl")){
            System.out.println("[HideAndSeek]"+event.getPlayer().getName()+"尝试在游戏内发送敏感内容，已拦截。原内容："+event.getMessage());
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED+"您发出的消息含有敏感词！已取消你的发送操作！请注意个人言行举止！");
        }
    }
}
