package kelvin.fiveminsurvival.game;

import net.minecraft.world.gen.ChunkGenerator;
import net.minecraftforge.event.world.WorldEvent.Load;
import net.minecraftforge.event.world.WorldEvent.Unload;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class WorldEvents {
	
	
	@SubscribeEvent
	public static void handleLoadEvent(Load e) {
//		if (e.getWorld() instanceof ServerWorld) {
//			ServerWorld world = (ServerWorld)e.getWorld();
//			world.getServer().sendMessage(new StringTextComponent("/datapack disable vanilla"));
//		}
	}
	
	@SubscribeEvent
	public static void handleUnloadEvent(Unload e) {
//		if (e.getWorld() instanceof ServerWorld) {
//			ServerWorld world = (ServerWorld)e.getWorld();
//			world.getServer().sendMessage(new StringTextComponent("/datapack disable vanilla"));
//		}
		ChunkGenerator gen;
	}
}
