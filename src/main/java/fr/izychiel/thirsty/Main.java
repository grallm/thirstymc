package fr.izychiel.thirsty;

import fr.izychiel.thirsty.listener.PlayerDrinksBottle;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new PlayerDrinksBottle(), this);
    }

    @Override
    public void onDisable(){

    }
}
