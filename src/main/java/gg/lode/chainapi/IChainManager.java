package gg.lode.chainapi;

import org.bukkit.entity.LivingEntity;

public interface IChainManager {

    void chain(LivingEntity victimOne, LivingEntity victimTwo);

    void unchain(LivingEntity livingEntity);

    boolean isChained(LivingEntity livingEntity);

    boolean isChainedWith(LivingEntity victimOne, LivingEntity victimTwo);

}
