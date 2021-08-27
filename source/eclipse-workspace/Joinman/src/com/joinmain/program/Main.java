package com.joinmain.program;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.joinmain.listener.Joinlistener;

public class Main extends JavaPlugin {

	public void onEnable() {
		
		// Register listeners
		PluginManager pluginMan = Bukkit.getPluginManager();
		pluginMan.registerEvents(new Joinlistener(), this);
		
	}

}
