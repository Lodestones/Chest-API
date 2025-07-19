package gg.lode.chestapi.api;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Represents a loot table.
 */
public interface ILootTable {
    /**
     * Gets the name of the loot table.
     *
     * @return The loot table name
     */
    String getName();

    /**
     * Gets all items in this loot table.
     *
     * @return List of items with their weights
     */
    List<ILootTableItem> getItems();

    /**
     * Adds an item to this loot table.
     *
     * @param item   The item to add
     * @param weight The weight/rarity of the item
     */
    void addItem(ItemStack item, int weight);

    void addItem(ILootTableItem item);

    /**
     * Populates an inventory with a random number of items from this loot table.
     *
     * @param inventory The inventory to populate
     * @param min The minimum number of items to place
     * @param max The maximum number of items to place
     */
    void populate(Inventory inventory, int min, int max);

    /**
     * Gets a random item from this loot table.
     *
     * @return A randomly selected item, or null if the table is empty
     */
    ItemStack getRandomItem();

    /**
     * Gets multiple random items from this loot table.
     *
     * @param count The number of items to get
     * @return List of randomly selected items
     */
    List<ItemStack> getRandomItems(int count);

    void merge(ILootTable other);

    Material getIcon();

    String getId();

    List<ILootTable> getMergedTables();

    void setName(String name);

    void setIcon(Material icon);
}