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

}
