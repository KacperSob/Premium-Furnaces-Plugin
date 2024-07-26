package me.glitch.wracajdopieca.premiumcase;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import me.glitch.wracajdopieca.premiumcase.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.concurrent.ThreadLocalRandom;

public class EventManager implements Listener {

    @EventHandler
    public static ProtectedRegion onPlaceEvent(BlockPlaceEvent event) {

        if (event.getItemInHand().getItemMeta().equals(ItemManager.premiumcase.getItemMeta())) {

            Player player = event.getPlayer();

            if (Premiumcase.inRegion == true) {
                event.getPlayer().getInventory().removeItem(ItemManager.premiumcase);
                if (player.hasPermission("premiumpiec.info")) {
                    player.sendMessage("{Debug Log} inRegion dziala");
                }
            }

            if (player.hasPermission("premiumpiec.info")) {
                player.sendMessage("{Debug Log} Piec losuj dziala");
            }

            int co = ThreadLocalRandom.current().nextInt(1, 100000);

            int x = event.getBlockPlaced().getLocation().getBlockX();
            int y = event.getBlockPlaced().getLocation().getBlockY();
            int z = event.getBlockPlaced().getLocation().getBlockZ();

            event.getBlock().setType(Material.AIR);

            if (co >= 90001 && co <= 100000) {
                ItemManager.createGold();
                event.getPlayer().getInventory().addItem(ItemManager.gold);
            } else if (co >= 1 && co <= 4000) {
                ItemManager.createChestplate43();
                event.getPlayer().getInventory().addItem(ItemManager.klata43);
            } else if (co >= 4001 && co <= 8000) {
                ItemManager.createLeggins43();
                event.getPlayer().getInventory().addItem(ItemManager.spodnie43);
            } else if (co >= 8001 && co <= 12000) {
                ItemManager.createBoots43();                
                event.getPlayer().getInventory().addItem(ItemManager.buty43);
            } else if (co >= 12001 && co <= 16000) {
                ItemManager.createSword52();
                event.getPlayer().getInventory().addItem(ItemManager.miecz52);
            } else if (co >= 16001 && co <= 20000) {
                ItemManager.createBow512();
                event.getPlayer().getInventory().addItem(ItemManager.bow512);
            } else if (co >= 20001 && co <= 20500) {
                ItemManager.createNHelmet43();
                event.getPlayer().getInventory().addItem(ItemManager.nhelm43);
            } else if (co >= 20501 && co <= 21000) {
                ItemManager.createNChestplate43();
                event.getPlayer().getInventory().addItem(ItemManager.nklata43);
            } else if (co >= 21001 && co <= 21500) {
                ItemManager.createNLeggins43();
                event.getPlayer().getInventory().addItem(ItemManager.nspodnie43);
            } else if (co >= 21501 && co <= 22000) {
                ItemManager.createNBoots43();
                event.getPlayer().getInventory().addItem(ItemManager.nbuty43);
            } else if (co >= 22001 && co <= 27000) {
                ItemManager.createRef();
                event.getPlayer().getInventory().addItem(ItemManager.refy);
            } else if (co >= 27001 && co <= 28000) {
                ItemManager.createKokz();
                event.getPlayer().getInventory().addItem(ItemManager.kokzy);
            } else if (co >= 28001 && co <= 28500) {
                ItemManager.createNSword52();
                event.getPlayer().getInventory().addItem(ItemManager.nmiecz52);
            } else if (co >= 28501 && co <= 29000) {
                ItemManager.createDiax();
                event.getPlayer().getInventory().addItem(ItemManager.diax);
            } else if (co >= 29001 && co <= 39500) {
                ItemManager.createNeth();
                event.getPlayer().getInventory().addItem(ItemManager.neth);
            } else if (co == 39501) {
                ItemManager.createKoks();
                event.getPlayer().getInventory().addItem(ItemManager.koks);
            } else if (co >= 39502 && co <= 70000) {
                ItemManager.createCoin();
                event.getPlayer().getInventory().addItem(ItemManager.coin);
            } else if (co >= 70001 && co <= 80000) {
                ItemManager.createCobWeb();
                event.getPlayer().getInventory().addItem(ItemManager.cobweb);
            } else if (co >= 80001 && co <= 90000) {
                ItemManager.createIron();
                event.getPlayer().getInventory().addItem(ItemManager.iron);
            }
        }
        return null;
    }
}
