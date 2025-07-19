package gg.lode.chestapi.api;

import org.bukkit.inventory.ItemStack;

/**
 * Represents an item in a loot table with its weight.
 */
public interface ILootTableItem {
    /**
     * Gets the item.
     *
     * @return The ItemStack
     */
    ItemStack getItem();

    /**
     * Gets the weight/rarity of the item.
     *
     * @return The weight value
     */
    int getWeight();

    /**
     * Sets the weight/rarity of the item.
     *
     * @param weight The weight of the item
     */
    void setWeight(int weight);
}

