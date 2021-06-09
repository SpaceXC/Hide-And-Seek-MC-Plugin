package com.xiaochangmc.hideandseek;

import com.xiaochangmc.hideandseek.commands.heal;
import com.xiaochangmc.hideandseek.commands.hideandseek;
import com.xiaochangmc.hideandseek.commands.ping;
import com.xiaochangmc.hideandseek.commands.set_killer;
import com.xiaochangmc.hideandseek.event.PlayerChat;
import com.xiaochangmc.hideandseek.event.PlayerJoin;
import com.xiaochangmc.hideandseek.gui.event.InventoryClick;
import com.xiaochangmc.hideandseek.gui.menu;
import com.xiaochangmc.hideandseek.gui.setkiller;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    @Override
    public void onEnable(){


        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            /* 显示信息 */
            getLogger().info("插件作者：XiaochangMC");
            getLogger().info("已成功加载PlaceholderAPI前置插件！");
            getLogger().info("插件已成功加载！");
            /* 加载配置 */
            getConfig().options().copyDefaults();
            saveDefaultConfig();
            /* 注册事件 */
            getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
            getServer().getPluginManager().registerEvents(new PlayerChat(),this);
            getServer().getPluginManager().registerEvents(new InventoryClick(),this);
            /* 注册指令 */
            getCommand("hideandseek").setExecutor(new hideandseek());
            getCommand("set_killer").setExecutor(new setkiller());
            getCommand("heal").setExecutor(new heal());
            getCommand("ping").setExecutor(new ping());
            getCommand("menu").setExecutor(new menu());
        } else {

            getLogger().warning("找不到PlaceholderAPI!此插件需要PlaceholderAPI作为前置！");
            Bukkit.getPluginManager().disablePlugin(this);
        }


    }

    @Override
    public void onDisable() {
        getLogger().info("感谢使用！");
        getLogger().info("插件已成功卸载！");
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }
}