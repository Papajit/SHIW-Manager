package com.papajittan.shiwmanager;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class PluginSupporter {
    public static PluginSupporter.Data GetPlayerClass(String name){
        File file = new File(Main.instance.getDataFolder() + File.separator + name + ".yml");
        if (!file.exists()) {
            return null;
        }

        YamlConfiguration yml = YamlConfiguration.loadConfiguration(file);
        PluginSupporter.Data player = new PluginSupporter.Data();
        player.Class = yml.getString("Class");
        return player;
    }
    public static void SetPlayerClass(String name, String classname) {
        File var10002 = Main.instance.getDataFolder();
        File f = new File(var10002 + File.separator + name + ".yml");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception exception) {
                Bukkit.getServer().getConsoleSender().sendMessage(exception.getMessage());
            }
        }
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        yml.set("Class", classname);
        try {
            yml.save(f);
        } catch (Exception exception) {
            Bukkit.getServer().getConsoleSender().sendMessage(exception.getMessage());
        }
    }
    public static void SetClassSize(String classname, int size){
        File file = new File(Main.instance.getDataFolder() + File.separator + classname + ".yml");
        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception exception){
                Bukkit.getServer().getConsoleSender().sendMessage(exception.getMessage());
            }
        }
        YamlConfiguration yml = new YamlConfiguration();
        yml.set("Amount", size);
        try {
            yml.save(file);
        } catch (Exception exception){
            Bukkit.getServer().getConsoleSender().sendMessage(exception.getMessage());
        }
    }
    public static PluginSupporter.Data GetClassSize(String classname){
        File file = new File(Main.instance.getDataFolder() + File.separator + classname + ".yml");
        if (!file.exists()) {
            return null;
        }

        YamlConfiguration yml = YamlConfiguration.loadConfiguration(file);
        PluginSupporter.Data size = new PluginSupporter.Data();
        size.Size = yml.getInt("Amount");
        return size;
    }
    public static class Data{
        public String Class;
        public int Size;
    }
}
