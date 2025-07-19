package gg.lode.chestapi;

import gg.lode.chestapi.api.ILootTableManager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Set;

/**
 * Main API interface for the Chest plugin.
 * Provides access to loot table functionality for other plugins.
 * 
 * @author John Aquino
 */
public interface IChestAPI {

    /**
     * Gets the loot table manager instance.
     * 
     * @return The loot table manager
     */
    ILootTableManager getLootTableManager();

    /**
     * Gets the plugin version.
     * 
     * @return The plugin version string
     */
    String getVersion();

    /**
     * Reloads all loot tables from disk.
     * 
     * @return true if reload was successful, false otherwise
     */
    boolean reloadLootTables();

    /**
     * Gets all available loot table names.
     * 
     * @return Set of loot table names
     */
    Set<String> getAvailableLootTables();

    /**
     * Checks if a loot table exists.
     * 
     * @param name The loot table name
     * @return true if the loot table exists, false otherwise
     */
    boolean lootTableExists(String name);

    /**
     * Populates an inventory with items from a loot table.
     * 
     * @param lootTableName The name of the loot table to use
     * @param inventory The inventory to populate
     * @return true if successful, false if loot table doesn't exist
     */
    boolean populateInventory(String lootTableName, Inventory inventory);

    /**
     * Populates an inventory with items from multiple merged loot tables.
     * 
     * @param lootTableNames List of loot table names to merge
     * @param inventory The inventory to populate
     * @return true if successful, false if any loot table doesn't exist
     */
    boolean populateInventoryFromMerged(List<String> lootTableNames, Inventory inventory);

    /**
     * Populates an inventory with items from multiple merged loot tables.
     *
     * @param lootTableNames List of loot table names to merge
     * @param inventory The inventory to populate
     * @param minItems The minimum amount of items to generate inside the container
     * @param maxItems The maximum amount of items to generate inside the container
     * @return true if successful, false if any loot table doesn't exist
     */
    boolean populateInventoryFromMerged(List<String> lootTableNames, Inventory inventory, int minItems, int maxItems);

    /**
     * Gets a random item from a loot table.
     * 
     * @param lootTableName The name of the loot table
     * @return The randomly selected item, or null if loot table doesn't exist
     */
    ItemStack getRandomItem(String lootTableName);

    /**
     * Gets multiple random items from a loot table.
     * 
     * @param lootTableName The name of the loot table
     * @param count The number of items to get
     * @return List of randomly selected items, or empty list if loot table doesn't exist
     */
    List<ItemStack> getRandomItems(String lootTableName, int count);

}
