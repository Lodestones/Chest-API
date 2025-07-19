package gg.lode.chestapi.api;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Set;

/**
 * Interface for managing loot tables programmatically.
 * Provides advanced functionality for creating and manipulating loot tables.
 * 
 * @author John Aquino
 */
public interface ILootTableManager {

    /**
     * Creates a new loot table with the given id.
     * 
     * @param id The id of the loot table
     * @return true if created successfully, false if it already exists
     */
    boolean createLootTable(String id);

    /**
     * Creates a new loot table with the given id.
     *
     * @param id The id of the loot table
     * @param name The name of the loot table
     * @return true if created successfully, false if it already exists
     */
    boolean createLootTable(String id, String name);

    /**
     * Deletes a loot table.
     * 
     * @param id The id of the loot table to delete
     * @return true if deleted successfully, false if it doesn't exist
     */
    boolean deleteLootTableById(String id);

    /**
     * Adds an item to a loot table.
     * 
     * @param id The name of the loot table
     * @param item The item to add
     * @param weight The weight/rarity of the item
     * @return true if added successfully, false if loot table doesn't exist
     */
    boolean addItemToLootTable(String id, ItemStack item, int weight);

    /**
     * Removes an item from a loot table by index.
     * 
     * @param lootTableName The name of the loot table
     * @param index The index of the item to remove
     * @return true if removed successfully, false if loot table doesn't exist or index is invalid
     */
    boolean removeItemFromLootTable(String lootTableName, int index);

    /**
     * Gets all items in a loot table.
     * 
     * @param id The name of the loot table
     * @return List of items with their weights, or null if loot table doesn't exist
     */
    List<ILootTableItem> getLootTableItems(String id);

    /**
     * Gets the number of items in a loot table.
     * 
     * @param id The name of the loot table
     * @return The number of items, or -1 if loot table doesn't exist
     */
    int getLootTableItemCount(String id);

    /**
     * Merges multiple loot tables into a new temporary loot table.
     * 
     * @param lootTableIds List of loot table names to merge
     * @return The merged loot table, or null if any loot table doesn't exist
     */
    ILootTable mergeLootTables(List<String> lootTableIds);

    /**
     * Saves a loot table to disk.
     * 
     * @param id The id of the loot table
     * @return true if saved successfully, false otherwise
     */
    boolean saveLootTable(String id);

    /**
     * Loads a loot table from disk.
     * 
     * @param id The id of the loot table
     * @return true if loaded successfully, false otherwise
     */
    boolean loadLootTable(String id);

    /**
     * Gets all available loot table names.
     * 
     * @return Set of loot table names
     */
    Set<String> getAvailableLootTables();

    /**
     * Checks if a loot table exists.
     * 
     * @param id The loot table id
     * @return true if the loot table exists, false otherwise
     */
    boolean lootTableExists(String id);

    /**
     * Populates an inventory with items from a loot table.
     * Defaulted to 3-6 items inside that container
     * 
     * @param id The name of the loot table to use
     * @param inventory The inventory to populate
     * @return true if successful, false if loot table doesn't exist
     */
    boolean populateInventory(String id, Inventory inventory);


    /**
     * Populates an inventory with items from a loot table.
     *
     * @param id The name of the loot table to use
     * @param inventory The inventory to populate
     * @param minItems The minimum amount of items to generate inside the container
     * @param maxItems The maximum amount of items to generate inside the container
     * @return true if successful, false if loot table doesn't exist
     */
    boolean populateInventory(String id, Inventory inventory, int minItems, int maxItems);

    /**
     * Serializes an ItemStack to a string format.
     * 
     * @param item The item to serialize
     * @return The serialized string, or null if serialization failed
     */
    String serializeItemStack(ItemStack item);

    /**
     * Deserializes a string back to an ItemStack.
     * Supports base64, YAML serialization, and material;amount formats.
     * 
     * @param data The serialized string
     * @return The deserialized ItemStack, or null if deserialization failed
     */
    ItemStack deserializeItemStack(String data);

    /**
     * Gets a loot table by id.
     * 
     * @param id The id of the loot table
     * @return The loot table, or null if it doesn't exist
     */
    ILootTable getLootTableById(String id);

    /**
     * Reloads all loot tables from disk.
     */
    void reload();

}
