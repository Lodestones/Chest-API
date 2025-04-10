package to.lodestone.chainapi;

public interface IChainAPI {

    IChainManager getChainManager();

    void setMaxDistance(int maxDistance);

}
