package gg.lode.chestapi;

import gg.lode.chestapi.api.ILootTableManager;

/**
 * Official API of the Chest Plugin
 * This interface allows access to certain internals of the chest plugin.
 *
 * @author John Aquino
 */
public class ChestAPI {

    private static IChestAPI api;

    /**
     * Internal use of the API for Chest to use.
     * DO NOT TOUCH!!
     * @param api {@link IChestAPI}
     */
    public static void setApi(IChestAPI api) {
        ChestAPI.api = api;
    }

    /**
     * Retrieves the API that Chest uses.
     * 
     * @return The API instance, or null if the plugin is not loaded
     */
    public static IChestAPI getApi() {
        return api;
    }

    /**
     * Gets the loot table manager for advanced operations.
     * 
     * @return The loot table manager, or null if the plugin is not loaded
     */
    public static ILootTableManager getLootTableManager() {
        return api != null ? api.getLootTableManager() : null;
    }

    /**
     * Checks if the Chest plugin is loaded and available.
     * 
     * @return true if the plugin is loaded, false otherwise
     */
    public static boolean isLoaded() {
        return api != null;
    }

}
