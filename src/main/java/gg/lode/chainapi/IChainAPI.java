package gg.lode.chainapi;

public interface IChainAPI {

    IChainManager getChainManager();

    void setMaxDistance(int maxDistance);

    int getMaxDistance();

}
