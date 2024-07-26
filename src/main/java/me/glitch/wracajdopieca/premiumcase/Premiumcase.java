package me.glitch.wracajdopieca.premiumcase;

import me.glitch.wracajdopieca.premiumcase.commands.MainCommands;
import me.glitch.wracajdopieca.premiumcase.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Premiumcase extends JavaPlugin {

    public static boolean inRegion;

    @Override
    public void onEnable() {
        ItemManager.createCase();
        getCommand("premiumpiec").setExecutor(new MainCommands());
        getServer().getPluginManager().registerEvents(new EventManager(), this);
        getServer().getPluginManager().registerEvents(new OnRegionEntry(), this);
        getServer().getPluginManager().registerEvents(new OnRegionLeave(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Premiumcase running");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Premium case disabled");
    }
}