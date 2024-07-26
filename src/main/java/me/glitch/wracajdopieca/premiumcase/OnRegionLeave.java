package me.glitch.wracajdopieca.premiumcase;

import net.raidstone.wgevents.events.RegionLeftEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class OnRegionLeave implements Listener {

    @EventHandler
    public void onRegionsLeft(RegionLeftEvent event)
    {
        Player player = event.getPlayer();
        if(player == null) return;

        String regionName = event.getRegionName();

        if(regionName.equalsIgnoreCase("spawn")) {
            Premiumcase.inRegion = false;
            if (player.hasPermission("premiumpiec.info")) {
                player.sendMessage("{Debug Log} Region leave dziala");
            }
        }
    }
}
