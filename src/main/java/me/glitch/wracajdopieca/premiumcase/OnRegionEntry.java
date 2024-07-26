package me.glitch.wracajdopieca.premiumcase;

import net.raidstone.wgevents.events.RegionEnteredEvent;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class OnRegionEntry implements Listener {

    @EventHandler
    public void onRegionEntered(RegionEnteredEvent event)
    {
        Player player = event.getPlayer();
        if (player == null) return;

        String regionName = event.getRegionName();
        if(regionName.equalsIgnoreCase("spawn"))
        {
            Premiumcase.inRegion = true;
            if (player.hasPermission("premiumpiec.info")) {
                player.sendMessage("{Debug Log} Region entry dziala");
            }
        }
    }

}
