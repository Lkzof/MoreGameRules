package tk.kzoflabs;

import org.bukkit.Bukkit;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import tk.kzoflabs.commands.MoreGameRules;
import tk.kzoflabs.events.*;

import java.io.File;
import java.util.logging.Logger;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {

        saveDefaultConfig();
        registerEvents();
        Bukkit.getConsoleSender().sendMessage("§a[MoreGameRules]§f online!");
        Bukkit.getPluginCommand("moregamerules").setExecutor(new MoreGameRules());

        getServer();

    }


    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[MoreGameRules] §foffline!");
    }


    private static Main instance;

    public static Main getInstance() {
        return instance;
    }


    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new AntiTrample(), this);
        Bukkit.getPluginManager().registerEvents(new CustomJoinMessage(), this);
        Bukkit.getPluginManager().registerEvents(new Invincible(), this);
        Bukkit.getPluginManager().registerEvents(new ModifyBlock(), this);
        Bukkit.getPluginManager().registerEvents(new NoHunger(), this);
        Bukkit.getPluginManager().registerEvents(new UnbreakableItems(), this);
        Bukkit.getPluginManager().registerEvents(new EditorClick(), this);
        Bukkit.getPluginManager().registerEvents(new OnlyMobSpawners(), this);


    }


}

