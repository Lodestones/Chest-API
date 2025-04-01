package to.lodestone.chainapi;

/**
 * Official API of the Chain Plugin
 * This interface allows access to certain internals of the teams plugin.
 *
 * @author John Aquino
 */
public class ChainAPI {

    private static IChainAPI api;

    /**
     * Internal use of the API for Chain to use.
     * DO NOT TOUCH!!
     * @param api {@link IChainAPI}
     */
    public static void setApi(IChainAPI api) {
        ChainAPI.api = api;
    }

    /**
     * Retrieves the API that Chain uses.
     */
    public static IChainAPI getApi() {
        return api;
    }

}
