package me.glitch.wracajdopieca.premiumcase.commands;

import me.glitch.wracajdopieca.premiumcase.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("premiumpiec")) {
            if (!sender.hasPermission("premiumpiec.give")) {
                sender.sendMessage(ChatColor.RED + "Nie masz uprawnien");
            } else {
                player.getInventory().addItem(ItemManager.premiumcase);
            }
        }
        return true;
    }
}
