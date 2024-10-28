package to.lodestone.chainapi;

import org.bukkit.entity.LivingEntity;

public interface IChainAPI {

    void chain(LivingEntity victimOne, LivingEntity victimTwo);
    void unchain(LivingEntity livingEntity);
    boolean isChained(LivingEntity livingEntity);

}
