package xyz.archiebaldry.letitsnow.mixin;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.MutableWorldProperties;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Supplier;

@Mixin(World.class)
public class WorldMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(MutableWorldProperties properties, RegistryKey registryRef, RegistryEntry dimension, Supplier profiler, boolean isClient, boolean debugWorld, long seed, int maxChainedNeighborUpdates, CallbackInfo callbackInfo) {
        properties.setRaining(true);
    }

}
