package me.glitch.wracajdopieca.premiumcase.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ItemManager {

    public static Random random = new Random();

    public static ItemStack coin;
    public static ItemStack premiumcase;
    public static ItemStack helm43;
    public static ItemStack klata43;
    public static ItemStack spodnie43;
    public static ItemStack buty43;
    public static ItemStack miecz52;
    public static ItemStack bow512;
    public static ItemStack nhelm43;
    public static ItemStack nklata43;
    public static ItemStack nspodnie43;
    public static ItemStack nbuty43;
    public static ItemStack refy;
    public static ItemStack kokzy;
    public static ItemStack nmiecz52;
    public static ItemStack diax;
    public static ItemStack neth;
    public static ItemStack koks;
    public static ItemStack cobweb;
    public static ItemStack iron;
    public static ItemStack gold;

    public static void createCoin() {
        int coinAmount = ThreadLocalRandom.current().nextInt(32,64);
        ItemStack item = new ItemStack(Material.GOLD_NUGGET, coinAmount);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        item.setItemMeta(meta);
        coin = item;
    }

    public static void createCase() {
        ItemStack item = new ItemStack(Material.FURNACE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setDisplayName("Premium piec");
        List<String> lore = new ArrayList<>();
        lore.add("Magiczny piec");
        lore.add("Sprobuj swojego szczescia a moze cos wygrasz");
        lore.add("UWAGA! Przedmioty nie wypadaja");
        meta.setLore(lore);
        item.setItemMeta(meta);
        premiumcase = item;
    }

    public static void createHelmet43() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Helm 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Potezny helm 4/3");
        lore.add("Robi wrazenie");
        meta.setLore(lore);
        item.setItemMeta(meta);
        helm43 = item;
    }

    public static void createChestplate43() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Klata 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Potezna klata 4/3");
        lore.add("Budzi groze");
        meta.setLore(lore);
        item.setItemMeta(meta);
        klata43 = item;
    }

    public static void createLeggins43() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Spodnie 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Potezne spodnie protection 4 unbreaking 3");
        lore.add("POGGERS");
        meta.setLore(lore);
        item.setItemMeta(meta);
        spodnie43 = item;
    }

    public static void createBoots43() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Buty 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Buty 4/3");
        lore.add("MASYWNE");
        meta.setLore(lore);
        item.setItemMeta(meta);
        buty43 = item;
    }

    public static void createSword52() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        meta.setDisplayName("Miecz 5/2");
        List<String> lore = new ArrayList<>();
        lore.add("Miecz 5/2");
        lore.add("Ostry....");
        meta.setLore(lore);
        item.setItemMeta(meta);
        miecz52 = item;
    }

    public static void createBow512() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
        meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
        meta.setDisplayName("Luk 5/1/2");
        List<String> lore = new ArrayList<>();
        lore.add("Luk 5/1/2");
        lore.add("Gotowi, cel .... PAL!!!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        bow512 = item;
    }

    public static void createNHelmet43() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Helm 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Helm 4/3");
        lore.add("Z piekla rodem");
        meta.setLore(lore);
        item.setItemMeta(meta);
        nhelm43 = item;
    }

    public static void createNChestplate43() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Klata 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Klata 4/3");
        lore.add("Niczym tarcza");
        meta.setLore(lore);
        item.setItemMeta(meta);
        nklata43 = item;
    }

    public static void createNLeggins43() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Spodnie 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Spodnie 4/3");
        lore.add("Jeansy");
        meta.setLore(lore);
        item.setItemMeta(meta);
        nspodnie43 = item;
    }

    public static void createNBoots43() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.setDisplayName("Buty 4/3");
        List<String> lore = new ArrayList<>();
        lore.add("Buty 4/3");
        lore.add("Sandaly");
        meta.setLore(lore);
        item.setItemMeta(meta);
        nbuty43 = item;
    }

    public static void createRef() {
        int refAmount = ThreadLocalRandom.current().nextInt(3,20);
        ItemStack item = new ItemStack(Material.GOLDEN_APPLE, refAmount);
        refy = item;
    }

    public static void createKokz() {
        ItemStack item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        kokzy = item;
    }

    public static void createNSword52() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        meta.setDisplayName("Miecz 5/2");
        List<String> lore = new ArrayList<>();
        lore.add("Miecz 5/2");
        lore.add("Jak pier........dzielnie");
        meta.setLore(lore);
        item.setItemMeta(meta);
        nmiecz52 = item;
    }

    public static void createDiax() {
        int diaxAmount = ThreadLocalRandom.current().nextInt(5, 16);
        ItemStack item = new ItemStack(Material.DIAMOND, diaxAmount);
        diax = item;
    }

    public static void createNeth() {
        ItemStack item = new ItemStack(Material.NETHERITE_INGOT, 1);
        neth = item;
    }

    public static void createKoks() {
        ItemStack item = new ItemStack(Material.SUGAR, 14);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setDisplayName("KOKS");
        List<String> lore = new ArrayList<>();
        lore.add("DRUGS");
        lore.add("Give some bro");
        meta.setLore(lore);
        item.setItemMeta(meta);
        koks = item;
    }

    public static void createCobWeb() {
        ItemStack item = new ItemStack(Material.COBWEB, 10);
        cobweb = item;
    }

    public static void createPogCoin() {
        ItemStack item = new ItemStack(Material.GOLD_NUGGET, 64);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        item.setItemMeta(meta);
        coin = item;
    }

    public static void createIron() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 32);
        iron = item;
    }

    public static void createGold() {
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 48);
        gold = item;
    }
}
