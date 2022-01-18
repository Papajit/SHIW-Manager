package com.papajittan.shiwmanager;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Objects;

public class Event implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent Event){
        PluginSupporter.Data assassin = PluginSupporter.GetClassSize("Assassin");
        PluginSupporter.Data paladin = PluginSupporter.GetClassSize("Paladin");
        PluginSupporter.Data viking = PluginSupporter.GetClassSize("Viking");
        PluginSupporter.Data bowman = PluginSupporter.GetClassSize("Bowman");
        PluginSupporter.Data knight = PluginSupporter.GetClassSize("Knight");
        PluginSupporter.Data phantom = PluginSupporter.GetClassSize("Phantom");
        PluginSupporter.Data miner = PluginSupporter.GetClassSize("Miner");
        PluginSupporter.Data merchant = PluginSupporter.GetClassSize("Merchant");
        PluginSupporter.Data dimensiontraveler = PluginSupporter.GetClassSize("DimensionTraveler");
        PluginSupporter.Data human = PluginSupporter.GetClassSize("Human");
        PluginSupporter.Data theimmortal = PluginSupporter.GetClassSize("TheImmortal");
        PluginSupporter.Data wrath = PluginSupporter.GetClassSize("Wrath");
        if(assassin == null){
            PluginSupporter.SetClassSize("Assassin", 0);
        }else if(paladin == null){
            PluginSupporter.SetClassSize("Paladin", 0);
        }else if(viking == null){
            PluginSupporter.SetClassSize("Viking", 0);
        }else if(bowman == null){
            PluginSupporter.SetClassSize("Bowman", 0);
        }else if(knight == null){
            PluginSupporter.SetClassSize("Knight", 0);
        }else if(phantom == null){
            PluginSupporter.SetClassSize("Phantom", 0);
        }else if(miner == null){
            PluginSupporter.SetClassSize("Miner", 0);
        }else if(merchant == null){
            PluginSupporter.SetClassSize("Merchant", 0);
        }else if(dimensiontraveler == null){
            PluginSupporter.SetClassSize("DimensionTraveler", 0);
        }else if(human == null){
            PluginSupporter.SetClassSize("Human", 0);
        }else if(theimmortal == null){
            PluginSupporter.SetClassSize("TheImmortal", 0);
        }else if(wrath == null){
            PluginSupporter.SetClassSize("Wrath", 0);
        }
        Player player = Event.getPlayer();
        PluginSupporter.Data playerclass = PluginSupporter.GetPlayerClass(player.getName());
        if(playerclass == null){
            PluginSupporter.SetPlayerClass(player.getName(), "Human");
        }
        if(!player.hasPlayedBefore()){
            Inventory ui = Bukkit.createInventory(null, 36, ChatColor.GOLD + "Select the class!");
            ItemStack iStackAssassin = new ItemStack(Material.NETHERITE_SWORD);
            ItemMeta iMetaAssassin = iStackAssassin.getItemMeta();
            iMetaAssassin.setDisplayName(ChatColor.DARK_RED + "Assassin");
            ArrayList<String> lAssassin = new ArrayList<>();
            PluginSupporter.Data data = PluginSupporter.GetClassSize("Assassin");
            if(data == null){
                PluginSupporter.SetClassSize("Assassin", 0);
            }
            int datas  = data.Size;
            lAssassin.add(ChatColor.GOLD + "You have low health but you can run faster and the damage will of your sword will increase!");
            if(datas < 3) {
                lAssassin.add(ChatColor.GREEN + String.valueOf(datas) + "/3");
            }else{
                lAssassin.add(ChatColor.RED + "Full!");
            }
            iMetaAssassin.setLore(lAssassin);
            iStackAssassin.setItemMeta(iMetaAssassin);
            ui.setItem(0, iStackAssassin);
            ItemStack iStackTank = new ItemStack(Material.NETHERITE_CHESTPLATE);
            ItemMeta iMetaTank = iStackTank.getItemMeta();
            iMetaTank.setDisplayName(ChatColor.DARK_GREEN + "Paladin");
            ArrayList<String> lTank = new ArrayList<>();
            PluginSupporter.Data datass = PluginSupporter.GetClassSize("Paladin");
            if(datass == null){
                PluginSupporter.SetClassSize("Paladin", 0);
            }
            int datasss  = datass.Size;
            lTank.add(ChatColor.GOLD + "You will walk pretty slow but you will die slower!");
            if(datas < 2){
                lTank.add(ChatColor.GREEN + String.valueOf(datasss) + "/2");
            }else{
                lTank.add(ChatColor.RED + "Full!");
            }
            iMetaTank.setLore(lTank);
            iStackTank.setItemMeta(iMetaTank);
            ui.setItem(2, iStackTank);
            ItemStack iStackBerserk = new ItemStack(Material.NETHERITE_AXE);
            ItemMeta iMetaBerserk = iStackBerserk.getItemMeta();
            iMetaBerserk.setDisplayName(ChatColor.RED + "Viking");
            ArrayList<String> lBerserk = new ArrayList<>();
            PluginSupporter.Data datassss = PluginSupporter.GetClassSize("Viking");
            if(datassss == null){
                PluginSupporter.SetClassSize("Viking", 0);
            }
            int datasssss = datassss.Size;
            lBerserk.add(ChatColor.GOLD + "You will walk pretty slow but you will have strength and axe damage will increase!");
            if(datasssss < 2){
                lBerserk.add(ChatColor.GREEN + String.valueOf(datasssss) + "/2");
            }else{
                lBerserk.add(ChatColor.RED + "Full!");
            }
            iMetaBerserk.setLore(lBerserk);
            iStackBerserk.setItemMeta(iMetaBerserk);
            ui.setItem(4, iStackBerserk);
            ItemStack iStackArcher = new ItemStack(Material.BOW);
            ItemMeta iMetaArcher = iStackArcher.getItemMeta();
            iMetaArcher.setDisplayName(ChatColor.AQUA + "Bowman");
            ArrayList<String> lArcher = new ArrayList<>();
            PluginSupporter.Data datassssss = PluginSupporter.GetClassSize("Bowman");
            if(datassssss == null){
                PluginSupporter.SetClassSize("Bowman", 0);
            }
            int datasssssss = datassssss.Size;
            lArcher.add(ChatColor.GOLD + "Your bow damage will increase!");
            if(datasssssss < 2) {
                lArcher.add(ChatColor.GREEN + String.valueOf(datasssssss) + "/2");
            }else{
                lArcher.add(ChatColor.RED + "Full!");
            }
            iMetaArcher.setLore(lArcher);
            iStackArcher.setItemMeta(iMetaArcher);
            ui.setItem(6, iStackArcher);
            player.openInventory(ui);
            ItemStack iStackSaber = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta iMetaSaber = iStackSaber.getItemMeta();
            iMetaSaber.setDisplayName(ChatColor.DARK_AQUA + "Knight");
            ArrayList<String> lSaber = new ArrayList<>();
            PluginSupporter.Data datassssssss = PluginSupporter.GetClassSize("Knight");
            if(datassssssss == null){
                PluginSupporter.SetClassSize("Knight", 0);
            }
            int datasssssssss = datassssssss.Size;
            lSaber.add(ChatColor.GOLD + "You will walk pretty slow but you will deal more damage with sword!");
            if(datasssssssss < 2){
                lSaber.add(ChatColor.GREEN + String.valueOf(datasssssssss) + "/2");
            }else{
                lSaber.add(ChatColor.RED + "Full!");
            }
            iMetaSaber.setLore(lSaber);
            iStackSaber.setItemMeta(iMetaSaber);
            ui.setItem(8, iStackSaber);
            ItemStack iStackPhantom = new ItemStack(Material.PHANTOM_MEMBRANE);
            ItemMeta iMetaPhantom = iStackPhantom.getItemMeta();
            iMetaPhantom.setDisplayName(ChatColor.BLUE + "Phantom");
            ArrayList<String> lPhantom = new ArrayList<>();
            PluginSupporter.Data datassssssssss = PluginSupporter.GetClassSize("Phantom");
            if(datassssssssss == null){
                PluginSupporter.SetClassSize("Phantom", 0);
            }
            int datasssssssssss = datassssssss.Size;
            lPhantom.add(ChatColor.GOLD + "You will have slow falling and jump boost (Need skills to use!)!");
            if(datasssssssssss < 1) {
                lPhantom.add(ChatColor.GREEN + String.valueOf(datasssssssssss) + "/1");
            }else{
                lPhantom.add(ChatColor.RED + "Full!");
            }
            iMetaPhantom.setLore(lPhantom);
            iStackPhantom.setItemMeta(iMetaPhantom);
            ui.setItem(12, iStackPhantom);
            ItemStack iStackMiner = new ItemStack(Material.DIAMOND_PICKAXE);
            ItemMeta iMetaMiner = iStackMiner.getItemMeta();
            iMetaMiner.setDisplayName(ChatColor.LIGHT_PURPLE + "Miner");
            ArrayList<String> lMiner = new ArrayList<>();
            PluginSupporter.Data datassssssssssss = PluginSupporter.GetClassSize("Miner");
            int datasssssssssssss = datassssssssssss.Size;
            lMiner.add(ChatColor.GOLD + "You will mine faster!");
            if(datasssssssssssss < 4){
                lMiner.add(ChatColor.GREEN + String.valueOf(datasssssssssss) + "/4");
            }else{
                lMiner.add(ChatColor.RED + "Full!");
            }
            iMetaMiner.setLore(lMiner);
            iStackMiner.setItemMeta(iMetaMiner);
            ui.setItem(14, iStackMiner);
            ItemStack iStackMerchant = new ItemStack(Material.EMERALD);
            ItemMeta iMetaMerchant = iStackMerchant.getItemMeta();
            iMetaMerchant.setDisplayName(ChatColor.GREEN + "Merchant");
            ArrayList<String> lMerchant = new ArrayList<>();
            PluginSupporter.Data datassssssssssssss = PluginSupporter.GetClassSize("Merchant");
            int datasssssssssssssss = datassssssssssssss.Size;
            lMerchant.add(ChatColor.GOLD + "You can buy things from villager cheaper!");
            if(datasssssssssssssss < 4){
                lMerchant.add(ChatColor.GREEN + String.valueOf(datasssssssssssssss) + "/4");
            }else{
                lMerchant.add(ChatColor.RED + "Full!");
            }
            iMetaMerchant.setLore(lMerchant);
            iStackMerchant.setItemMeta(iMetaMerchant);
            ui.setItem(16, iStackMerchant);
            int egonkilled = player.getStatistic(Statistic.KILL_ENTITY, EntityType.ENDER_DRAGON);
            ItemStack iStackRanboo = new ItemStack(Material.ENDERMAN_SPAWN_EGG);
            ItemMeta iMetaRanboo = iStackRanboo.getItemMeta();
            iMetaRanboo.setDisplayName(ChatColor.BLUE + "DimensionTraveler");
            ArrayList<String> lRanboo = new ArrayList<>();
            PluginSupporter.Data datassssssssssssssss = PluginSupporter.GetClassSize("DimensionTraveler");
            int datasssssssssssssssss = datassssssssssssssss.Size;
            lRanboo.add(ChatColor.GOLD + "Enderman but worse! (kinda op!)");
            if(egonkilled == 0){
                lRanboo.add(ChatColor.RED + "Locked!");
            }
            else if(datasssssssssssssssss < 1){
                lRanboo.add(ChatColor.GREEN + String.valueOf(datasssssssssssssss) + "/1");
            }else{
                lRanboo.add(ChatColor.RED + "Full!");
            }
            iMetaRanboo.setLore(lRanboo);
            iStackRanboo.setItemMeta(iMetaRanboo);
            ui.setItem(18, iStackRanboo);
            ItemStack iStackDefault = new ItemStack(Material.GRASS_BLOCK);
            ItemMeta iMetaDefault = iStackDefault.getItemMeta();
            iMetaDefault.setDisplayName("Human");
            ArrayList<String> lDefault = new ArrayList<>();
            lDefault.add(ChatColor.GOLD + "Completely normal Minecraft!");
            iMetaDefault.setLore(lDefault);
            iStackDefault.setItemMeta(iMetaDefault);
            ui.setItem(10, iStackDefault);
            ItemStack iStackTurtleMaster = new ItemStack(Material.TURTLE_SPAWN_EGG);
            ItemMeta iMetaTurtleMaster = iStackTurtleMaster.getItemMeta();
            iMetaTurtleMaster.setDisplayName(ChatColor.GREEN + "TheImmortal");
            ArrayList<String> lTurtleMaster = new ArrayList<>();
            PluginSupporter.Data datassssssssssssssssss = PluginSupporter.GetClassSize("TheImmortal");
            int datasssssssssssssssssss = datassssssssssssssssss.Size;
            lTurtleMaster.add(ChatColor.GOLD + "Hard to use but op!");
            if(egonkilled == 0){
                lTurtleMaster.add(ChatColor.RED + "Locked!");
            }else if(datasssssssssssssssssss < 2){
                lTurtleMaster.add(ChatColor.GREEN + String.valueOf(datasssssssssssssssssss) + "/2");
            }else{
                lTurtleMaster.add(ChatColor.RED + "Full!");
            }
            iMetaTurtleMaster.setLore(lTurtleMaster);
            iStackTurtleMaster.setItemMeta(iMetaTurtleMaster);
            ui.setItem(20, iStackTurtleMaster);
            ItemStack iStackLifestealer = new ItemStack(Material.GOLDEN_SWORD);
            ItemMeta iMetaLifestealer = iStackLifestealer.getItemMeta();
            iMetaLifestealer.setDisplayName(ChatColor.DARK_RED + "Wrath");
            ArrayList<String> lLifestealer = new ArrayList<>();
            PluginSupporter.Data datassssssssssssssssssss = PluginSupporter.GetClassSize("Wrath");
            int datasssssssssssssssssssss = datassssssssssssssssssss.Size;
            lLifestealer.add(ChatColor.GOLD + "You can steal player's heart by killing them but every time you die you lose a heart!");
            if(egonkilled == 0){
                lLifestealer.add(ChatColor.RED + "Locked!");
            }else if(datasssssssssssssssssssss < 2){
                lLifestealer.add(ChatColor.GREEN + String.valueOf(datasssssssssssssssssssss) + "/2");
            }else{
                lLifestealer.add("Full!");
            }
            iMetaLifestealer.setLore(lLifestealer);
            iStackLifestealer.setItemMeta(iMetaLifestealer);
            ui.setItem(22, iStackLifestealer);
        }
    }
    @EventHandler
    public void OnPlayerInteract(PlayerInteractEvent Event){
        Player player = Event.getPlayer();
        if(Event.getAction() == Action.RIGHT_CLICK_BLOCK || Event.getAction() == Action.RIGHT_CLICK_AIR){
            ItemStack item = Event.getPlayer().getInventory().getItemInMainHand();
            if(item.getItemMeta().hasCustomModelData()) {
                if (item.getItemMeta().getCustomModelData() == 1001) {
                    Inventory ui = Bukkit.createInventory(null, 36, ChatColor.GOLD + "Select the class!");
                    ItemStack iStackAssassin = new ItemStack(Material.NETHERITE_SWORD);
                    ItemMeta iMetaAssassin = iStackAssassin.getItemMeta();
                    iMetaAssassin.setDisplayName(ChatColor.DARK_RED + "Assassin");
                    ArrayList<String> lAssassin = new ArrayList<>();
                    PluginSupporter.Data data = PluginSupporter.GetClassSize("Assassin");
                    if(data == null){
                        PluginSupporter.SetClassSize("Assassin", 0);
                    }
                    int datas  = data.Size;
                    lAssassin.add(ChatColor.GOLD + "You have low health but you can run faster and the damage will of your sword will increase!");
                    if(datas < 3) {
                        lAssassin.add(ChatColor.GREEN + String.valueOf(datas) + "/3");
                    }else{
                        lAssassin.add(ChatColor.RED + "Full!");
                    }
                    iMetaAssassin.setLore(lAssassin);
                    iStackAssassin.setItemMeta(iMetaAssassin);
                    ui.setItem(0, iStackAssassin);
                    ItemStack iStackTank = new ItemStack(Material.NETHERITE_CHESTPLATE);
                    ItemMeta iMetaTank = iStackTank.getItemMeta();
                    iMetaTank.setDisplayName(ChatColor.DARK_GREEN + "Paladin");
                    ArrayList<String> lTank = new ArrayList<>();
                    PluginSupporter.Data datass = PluginSupporter.GetClassSize("Paladin");
                    if(datass == null){
                        PluginSupporter.SetClassSize("Paladin", 0);
                    }
                    int datasss  = datass.Size;
                    lTank.add(ChatColor.GOLD + "You will walk pretty slow but you will die slower!");
                    if(datas < 2){
                        lTank.add(ChatColor.GREEN + String.valueOf(datasss) + "/2");
                    }else{
                        lTank.add(ChatColor.RED + "Full!");
                    }
                    iMetaTank.setLore(lTank);
                    iStackTank.setItemMeta(iMetaTank);
                    ui.setItem(2, iStackTank);
                    ItemStack iStackBerserk = new ItemStack(Material.NETHERITE_AXE);
                    ItemMeta iMetaBerserk = iStackBerserk.getItemMeta();
                    iMetaBerserk.setDisplayName(ChatColor.RED + "Viking");
                    ArrayList<String> lBerserk = new ArrayList<>();
                    PluginSupporter.Data datassss = PluginSupporter.GetClassSize("Viking");
                    if(datassss == null){
                        PluginSupporter.SetClassSize("Viking", 0);
                    }
                    int datasssss = datassss.Size;
                    lBerserk.add(ChatColor.GOLD + "You will walk pretty slow but you will have strength and axe damage will increase!");
                    if(datasssss < 2){
                        lBerserk.add(ChatColor.GREEN + String.valueOf(datasssss) + "/2");
                    }else{
                        lBerserk.add(ChatColor.RED + "Full!");
                    }
                    iMetaBerserk.setLore(lBerserk);
                    iStackBerserk.setItemMeta(iMetaBerserk);
                    ui.setItem(4, iStackBerserk);
                    ItemStack iStackArcher = new ItemStack(Material.BOW);
                    ItemMeta iMetaArcher = iStackArcher.getItemMeta();
                    iMetaArcher.setDisplayName(ChatColor.AQUA + "Bowman");
                    ArrayList<String> lArcher = new ArrayList<>();
                    PluginSupporter.Data datassssss = PluginSupporter.GetClassSize("Bowman");
                    if(datassssss == null){
                        PluginSupporter.SetClassSize("Bowman", 0);
                    }
                    int datasssssss = datassssss.Size;
                    lArcher.add(ChatColor.GOLD + "Your bow damage will increase!");
                    if(datasssssss < 2) {
                        lArcher.add(ChatColor.GREEN + String.valueOf(datasssssss) + "/2");
                    }else{
                        lArcher.add(ChatColor.RED + "Full!");
                    }
                    iMetaArcher.setLore(lArcher);
                    iStackArcher.setItemMeta(iMetaArcher);
                    ui.setItem(6, iStackArcher);
                    player.openInventory(ui);
                    ItemStack iStackSaber = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta iMetaSaber = iStackSaber.getItemMeta();
                    iMetaSaber.setDisplayName(ChatColor.DARK_AQUA + "Knight");
                    ArrayList<String> lSaber = new ArrayList<>();
                    PluginSupporter.Data datassssssss = PluginSupporter.GetClassSize("Knight");
                    if(datassssssss == null){
                        PluginSupporter.SetClassSize("Knight", 0);
                    }
                    int datasssssssss = datassssssss.Size;
                    lSaber.add(ChatColor.GOLD + "You will walk pretty slow but you will deal more damage with sword!");
                    if(datasssssssss < 2){
                        lSaber.add(ChatColor.GREEN + String.valueOf(datasssssssss) + "/2");
                    }else{
                        lSaber.add(ChatColor.RED + "Full!");
                    }
                    iMetaSaber.setLore(lSaber);
                    iStackSaber.setItemMeta(iMetaSaber);
                    ui.setItem(8, iStackSaber);
                    ItemStack iStackPhantom = new ItemStack(Material.PHANTOM_MEMBRANE);
                    ItemMeta iMetaPhantom = iStackPhantom.getItemMeta();
                    iMetaPhantom.setDisplayName(ChatColor.BLUE + "Phantom");
                    ArrayList<String> lPhantom = new ArrayList<>();
                    PluginSupporter.Data datassssssssss = PluginSupporter.GetClassSize("Phantom");
                    if(datassssssssss == null){
                        PluginSupporter.SetClassSize("Phantom", 0);
                    }
                    int datasssssssssss = datassssssss.Size;
                    lPhantom.add(ChatColor.GOLD + "You will have slow falling and jump boost (Need skills to use!)!");
                    if(datasssssssssss < 1) {
                        lPhantom.add(ChatColor.GREEN + String.valueOf(datasssssssssss) + "/1");
                    }else{
                        lPhantom.add(ChatColor.RED + "Full!");
                    }
                    iMetaPhantom.setLore(lPhantom);
                    iStackPhantom.setItemMeta(iMetaPhantom);
                    ui.setItem(12, iStackPhantom);
                    ItemStack iStackMiner = new ItemStack(Material.DIAMOND_PICKAXE);
                    ItemMeta iMetaMiner = iStackMiner.getItemMeta();
                    iMetaMiner.setDisplayName(ChatColor.LIGHT_PURPLE + "Miner");
                    ArrayList<String> lMiner = new ArrayList<>();
                    PluginSupporter.Data datassssssssssss = PluginSupporter.GetClassSize("Miner");
                    int datasssssssssssss = datassssssssssss.Size;
                    lMiner.add(ChatColor.GOLD + "You will mine faster!");
                    if(datasssssssssssss < 4){
                        lMiner.add(ChatColor.GREEN + String.valueOf(datasssssssssss) + "/4");
                    }else{
                        lMiner.add(ChatColor.RED + "Full!");
                    }
                    iMetaMiner.setLore(lMiner);
                    iStackMiner.setItemMeta(iMetaMiner);
                    ui.setItem(14, iStackMiner);
                    ItemStack iStackMerchant = new ItemStack(Material.EMERALD);
                    ItemMeta iMetaMerchant = iStackMerchant.getItemMeta();
                    iMetaMerchant.setDisplayName(ChatColor.GREEN + "Merchant");
                    ArrayList<String> lMerchant = new ArrayList<>();
                    PluginSupporter.Data datassssssssssssss = PluginSupporter.GetClassSize("Merchant");
                    int datasssssssssssssss = datassssssssssssss.Size;
                    lMerchant.add(ChatColor.GOLD + "You can buy things from villager cheaper!");
                    if(datasssssssssssssss < 4){
                        lMerchant.add(ChatColor.GREEN + String.valueOf(datasssssssssssssss) + "/4");
                    }else{
                        lMerchant.add(ChatColor.RED + "Full!");
                    }
                    iMetaMerchant.setLore(lMerchant);
                    iStackMerchant.setItemMeta(iMetaMerchant);
                    ui.setItem(16, iStackMerchant);
                    int egonkilled = player.getStatistic(Statistic.KILL_ENTITY, EntityType.ENDER_DRAGON);
                    ItemStack iStackRanboo = new ItemStack(Material.ENDERMAN_SPAWN_EGG);
                    ItemMeta iMetaRanboo = iStackRanboo.getItemMeta();
                    iMetaRanboo.setDisplayName(ChatColor.BLUE + "DimensionTraveler");
                    ArrayList<String> lRanboo = new ArrayList<>();
                    PluginSupporter.Data datassssssssssssssss = PluginSupporter.GetClassSize("DimensionTraveler");
                    int datasssssssssssssssss = datassssssssssssssss.Size;
                    lRanboo.add(ChatColor.GOLD + "Enderman but worse! (kinda op!)");
                    if(egonkilled == 0){
                        lRanboo.add(ChatColor.RED + "Locked!");
                    }
                    else if(datasssssssssssssssss < 1){
                        lRanboo.add(ChatColor.GREEN + String.valueOf(datasssssssssssssss) + "/1");
                    }else{
                        lRanboo.add(ChatColor.RED + "Full!");
                    }
                    iMetaRanboo.setLore(lRanboo);
                    iStackRanboo.setItemMeta(iMetaRanboo);
                    ui.setItem(18, iStackRanboo);
                    ItemStack iStackDefault = new ItemStack(Material.GRASS_BLOCK);
                    ItemMeta iMetaDefault = iStackDefault.getItemMeta();
                    iMetaDefault.setDisplayName("Human");
                    ArrayList<String> lDefault = new ArrayList<>();
                    lDefault.add(ChatColor.GOLD + "Completely normal Minecraft!");
                    iMetaDefault.setLore(lDefault);
                    iStackDefault.setItemMeta(iMetaDefault);
                    ui.setItem(10, iStackDefault);
                    ItemStack iStackTurtleMaster = new ItemStack(Material.TURTLE_SPAWN_EGG);
                    ItemMeta iMetaTurtleMaster = iStackTurtleMaster.getItemMeta();
                    iMetaTurtleMaster.setDisplayName(ChatColor.GREEN + "TheImmortal");
                    ArrayList<String> lTurtleMaster = new ArrayList<>();
                    PluginSupporter.Data datassssssssssssssssss = PluginSupporter.GetClassSize("TheImmortal");
                    int datasssssssssssssssssss = datassssssssssssssssss.Size;
                    lTurtleMaster.add(ChatColor.GOLD + "Hard to use but op!");
                    if(egonkilled == 0){
                        lTurtleMaster.add(ChatColor.RED + "Locked!");
                    }else if(datasssssssssssssssssss < 2){
                        lTurtleMaster.add(ChatColor.GREEN + String.valueOf(datasssssssssssssssssss) + "/2");
                    }else{
                        lTurtleMaster.add(ChatColor.RED + "Full!");
                    }
                    iMetaTurtleMaster.setLore(lTurtleMaster);
                    iStackTurtleMaster.setItemMeta(iMetaTurtleMaster);
                    ui.setItem(20, iStackTurtleMaster);
                    ItemStack iStackLifestealer = new ItemStack(Material.GOLDEN_SWORD);
                    ItemMeta iMetaLifestealer = iStackLifestealer.getItemMeta();
                    iMetaLifestealer.setDisplayName(ChatColor.DARK_RED + "Wrath");
                    ArrayList<String> lLifestealer = new ArrayList<>();
                    PluginSupporter.Data datassssssssssssssssssss = PluginSupporter.GetClassSize("Wrath");
                    int datasssssssssssssssssssss = datassssssssssssssssssss.Size;
                    lLifestealer.add(ChatColor.GOLD + "You can steal player's heart by killing them but every time you die you lose a heart!");
                    if(egonkilled == 0){
                        lLifestealer.add(ChatColor.RED + "Locked!");
                    }else if(datasssssssssssssssssssss < 2){
                        lLifestealer.add(ChatColor.GREEN + String.valueOf(datasssssssssssssssssssss) + "/2");
                    }else{
                        lLifestealer.add("Full!");
                    }
                    iMetaLifestealer.setLore(lLifestealer);
                    iStackLifestealer.setItemMeta(iMetaLifestealer);
                    ui.setItem(22, iStackLifestealer);
                }
            }
        }
    }
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent Event){
        Player player = Event.getEntity();
        Player killer = player.getKiller();
        if(killer == null) return;
        String killers = killer.getName();
        String players = player.getName();
        PluginSupporter.Data playerclass = PluginSupporter.GetPlayerClass(players);
        PluginSupporter.Data killerclass = PluginSupporter.GetPlayerClass(killers);
        if(playerclass == null) return;
        if(killerclass == null) return;
        String killerclasss = killerclass.Class;
        String playerclasss = playerclass.Class;
        if(Objects.equals(killerclasss, "Wrath") || Objects.equals(playerclasss, "Wrath")) {
            if (Objects.equals(killerclasss, "Wrath")) {
                Double playermaxhealth = player.getMaxHealth();
                Double killermaxhealth = killer.getMaxHealth();
                if (killermaxhealth >= 40f) {
                    killer.sendMessage(ChatColor.GOLD + "Your heart reached limited!");
                    return;
                }
                player.setMaxHealth(playermaxhealth - 2f);
                killer.setMaxHealth(killermaxhealth + 2f);
                player.sendMessage(ChatColor.GOLD + "You lost " + ChatColor.RED + "1" + ChatColor.WHITE + " heart to " + ChatColor.GOLD + player.getName() + ChatColor.GOLD + " because the player is in Wrath class!");
                killer.sendMessage(ChatColor.GOLD + "You have got " + ChatColor.RED + "1" + ChatColor.WHITE + " heart from " + ChatColor.GOLD + player.getName() + "!");
                return;
            }
            if(Objects.equals(playerclasss, "Wrath")){
                Double playermaxhealth = player.getMaxHealth();
                player.setMaxHealth(playermaxhealth - 2f);
                player.sendMessage(ChatColor.GOLD + "You have lost " + ChatColor.RED + "1" + ChatColor.WHITE  + " heart to" + ChatColor.GOLD + player.getName() + "!");
            }
        }
    }
    @EventHandler
    public void onEntityDeath(EntityDeathEvent Event) {
        Player killer = Event.getEntity().getKiller();
        EntityType entity = Event.getEntityType();
        if (entity == EntityType.ENDER_DRAGON) {
            int statistic = killer.getStatistic(Statistic.KILL_ENTITY, EntityType.ENDER_DRAGON);
            if (statistic == 0) {
                killer.sendMessage(ChatColor.GOLD + "Congratulation! You have unlocked DimensionTraveler, TheImmortal and Wrath classes!");
            }
        }
    }

    @EventHandler
    public void CSelectorBack(InventoryClickEvent Event) {
        if (Event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "Select the class!")) {
            Player player = (Player) Event.getWhoClicked();
            String playername = player.getName();
            PluginSupporter.Data data = PluginSupporter.GetPlayerClass(playername);
            ItemStack target = Event.getCurrentItem();
            if(target == null) return;
            String classname = target.getItemMeta().getDisplayName();
            classname = ChatColor.stripColor(classname);
            PluginSupporter.Data classsize = PluginSupporter.GetClassSize(classname);
            String playerclass = data.Class;
            PluginSupporter.Data classsize2 = PluginSupporter.GetClassSize(playerclass);
            if(classname.equals("Human")){
                player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + "Human" + ChatColor.GOLD + " class!");
                PluginSupporter.SetPlayerClass(playername, classname);
                Event.getView().close();
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                for (PotionEffect effect : player.getActivePotionEffects()) {
                    player.removePotionEffect(effect.getType());
                }
                player.setMaxHealth(20f);
                player.getActivePotionEffects().clear();
                return;
            }

            if (classname.equals(playerclass)) {
                player.sendMessage(ChatColor.RED + "You can't select the class that you are already in!");
                Event.getView().close();
                return;
            }

            if(classsize == null){
                PluginSupporter.SetClassSize(classname, 0);
            }

            int cs = classsize.Size;
            int cs2 = classsize2.Size;
            switch (classname) {
                case "Assassin" -> {
                    if(cs >= 3){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(14f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
                }
                case "Paladin" -> {
                    if(cs >= 2){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1));
                    player.setMaxHealth(22f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 3));
                }
                case "Knight", "Viking" -> {
                    if(cs >= 2){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(20f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
                }
                case "Phantom" -> {
                    if(cs >= 1){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(16f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
                }
                case "Merchant" -> {
                    if(cs >= 4){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(20f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
                }
                case "Miner" -> {
                    if(cs >= 4){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(20f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 1));
                }
                case "Bowman" -> {
                    if(cs >= 2){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(16f);
                }
                case "DimensionTraveler" -> {
                    int e = player.getStatistic(Statistic.KILL_ENTITY, EntityType.ENDER_DRAGON);
                    if(e <= 0){
                        player.sendMessage(ChatColor.RED + "You didn't unlock this class yet!");
                        Event.setCancelled(true);
                        return;
                    }
                    if(cs >= 1){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(30f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
                }
                case "TheImmortal" -> {
                    int e = player.getStatistic(Statistic.KILL_ENTITY, EntityType.ENDER_DRAGON);
                    if(e <= 0){
                        player.sendMessage(ChatColor.RED + "You didn't unlock this class yet!");
                        Event.setCancelled(true);
                        return;
                    }
                    if(cs >= 2){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(20f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 5));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 3));
                }
                case "Wrath" -> {
                    int e = player.getStatistic(Statistic.KILL_ENTITY, EntityType.ENDER_DRAGON);
                    if(e <= 0){
                        player.sendMessage(ChatColor.RED + "You didn't unlock this class yet!");
                        Event.setCancelled(true);
                        return;
                    }
                    if(cs >= 2){
                        player.sendMessage(ChatColor.RED + "This class is full!");
                        Event.setCancelled(true);
                        return;
                    }
                    player.sendMessage(ChatColor.GOLD + "You successfully changed from " + ChatColor.RED + playerclass + ChatColor.GOLD + " class to " + ChatColor.RED + classname + ChatColor.GOLD + " class!");
                    PluginSupporter.SetClassSize(playerclass, cs2 - 1);
                    PluginSupporter.SetPlayerClass(playername, classname);
                    PluginSupporter.SetClassSize(classname, cs + 1);
                    Event.getView().close();
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f);
                    for (PotionEffect effect : player.getActivePotionEffects()) {
                        player.removePotionEffect(effect.getType());
                    }
                    player.setMaxHealth(14f);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
                }
            }
        }
    }
    @EventHandler
    public void OnEntityDamageByEntity(EntityDamageByEntityEvent Event){
        Player dmg = (Player) Event.getDamager();
        double dm = Event.getDamage();
        PluginSupporter.Data plrd = PluginSupporter.GetPlayerClass(dmg.getName());
        if(plrd == null){
            dmg.sendMessage(String.valueOf(dm));
        }
        String damagerclass = plrd.Class;

        if(damagerclass.equals("Assassin")){
            if(dmg.getInventory().getItemInMainHand().getType().name().toLowerCase().contains("sword")) {
                Event.setDamage(dm + 2);
            }
        }else if(damagerclass.equals("Knight")){
            if(dmg.getInventory().getItemInMainHand().getType().name().toLowerCase().contains("sword")) {
                Event.setDamage(dm + 2);
            }
        }else if(damagerclass.equals("Viking")){
            if(dmg.getInventory().getItemInMainHand().getType().name().toLowerCase().contains("axe")) {
                Event.setDamage(dm + 2);
            }
        }else if(Event.getCause() == EntityDamageEvent.DamageCause.PROJECTILE){
            Arrow arrow = (Arrow) Event.getDamager();
            Player plre = (Player) arrow.getShooter();
            PluginSupporter.Data arrowshooter = PluginSupporter.GetPlayerClass(plre.getName());
            String arn = arrowshooter.Class;
            if(arn.equals("Bowman")){
                Event.setDamage(dm + 2);
            }
        }
    }
    @EventHandler
    public void OnPlayerMove(PlayerMoveEvent Event){
        var position = Event.getPlayer().getLocation();
        Player player = Event.getPlayer();
        String pname = player.getName();
        PluginSupporter.Data data = PluginSupporter.GetPlayerClass(pname);
        assert data != null;
        String datas = data.Class;
        switch (datas){
            case "Assassin" -> player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
            case "Paladin" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 0));
            }
            case "Knight", "Viking" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
            }
            case "Phantom" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 0));
            }
            case "Merchant" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, Integer.MAX_VALUE, 0));
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
            }
            case "Miner" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 1));
            }
            case "DimensionTraveler" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
                Location location = new Location(position.getWorld(), position.getBlockX(), position.getBlockY(), position.getBlockZ());
                Block block = location.getBlock();
                if (block.getType() == Material.WATER) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 1, 0));
                }
            }
            case "TheImmortal" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 5));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 3));
            }
            case "Wrath" -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
            }
        }
    }
    @EventHandler
    public void OnBlockBreak(BlockBreakEvent Event) {
        Material block = Event.getBlock().getType();
        Player player = Event.getPlayer();
        String pname = player.getName();
        PluginSupporter.Data data = PluginSupporter.GetPlayerClass(pname);
        String datas = data.Class;
        if(Objects.equals(datas, "DimensionTraveler")){
            if(player.getInventory().getItemInMainHand().getType() == Material.AIR){
                Event.getBlock().getWorld().dropItemNaturally(Event.getBlock().getLocation(), new ItemStack(block));
                Event.setCancelled(true);
                Event.getBlock().setType(Material.AIR);
            }
        }
    }
}