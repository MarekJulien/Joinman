package com.joinman.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Joinlistener implements Listener{

	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		
		// Get player name from event
		String name = event.getPlayer().getName();
		
		// Set join message
		event.setJoinMessage("§a" + name + " is now online");
		
	}
	
	@EventHandler
	public void handlePlayerQuit(PlayerQuitEvent event) {
		
		// Get player name from event
		String name = event.getPlayer().getName();
		
		// Set join message
		event.setQuitMessage("§c" + name + " is now offline");
		
	}
	
}
