package dev.sycraxe.unreachablenether;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.level.BlockEvent;

@Mod(UnreachableNether.MOD_ID)
public class UnreachableNether {
    public static final String MOD_ID = "unreachablenether";

    public UnreachableNether(IEventBus modBus) {
        NeoForge.EVENT_BUS.addListener(UnreachableNether::onPortalSpawn);
    }

    private static void onPortalSpawn(BlockEvent.PortalSpawnEvent event) {
        event.setCanceled(true);
    }
}
