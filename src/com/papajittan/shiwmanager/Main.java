package com.papajittan.shiwmanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {
    public static Main instance;
    @Override
    public void onEnable(){
        instance = this;
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Fantasy is ready!");
        Bukkit.getPluginManager().registerEvents(new Event(), this);
        ItemStack item = new ItemStack(Material.FIREWORK_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(1001);
        meta.setDisplayName(ChatColor.GOLD + "ClassSelector");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA + "Right Click! to manage your class! (It may remove your potion effect!)");
        meta.setLore(lore);
        item.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(this, this.getDescription().getName() + "ClassManager");
        ShapedRecipe rec = new ShapedRecipe(key, item);
        rec.shape("#@#","@%@","#@#");
        rec.setIngredient('%', Material.ENCHANTED_GOLDEN_APPLE);
        rec.setIngredient('@', Material.DIAMOND_BLOCK);
        rec.setIngredient('#', Material.NETHER_STAR);
        getServer().addRecipe(rec);
        getCommand("classcheck").setExecutor(new Command());
    }
}
