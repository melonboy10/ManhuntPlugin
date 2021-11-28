package me.melonboy10.manhuntplugin.listeners;

import me.melonboy10.manhuntplugin.ManhuntPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinServerListener implements Listener {

    @EventHandler
    public void join(PlayerJoinEvent event) {
        ManhuntPlugin.sendPlayertoHub(event.getPlayer());
    }
}
