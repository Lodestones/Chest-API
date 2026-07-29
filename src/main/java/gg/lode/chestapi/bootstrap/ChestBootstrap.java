package gg.lode.chestapi.bootstrap;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Lifecycle contract between the loader and the implementation.
 *
 * <p>The implementation is no longer a plugin in its own right: it ships as an
 * encrypted blob that the loader fetches, decrypts and loads at runtime, so it
 * cannot extend JavaPlugin. The loader is the plugin, and hands itself here as
 * {@code host} for anything that needs a real plugin instance — registering
 * listeners, scheduling, resolving the data folder.
 *
 * <p>This type is loaded parent-first so the loader and the implementation
 * agree on one Class for it; two copies would fail the cast that follows
 * instantiation.
 */
public interface ChestBootstrap {

    void onLoad(JavaPlugin host);

    void onEnable(JavaPlugin host);

    void onDisable(JavaPlugin host);
}
