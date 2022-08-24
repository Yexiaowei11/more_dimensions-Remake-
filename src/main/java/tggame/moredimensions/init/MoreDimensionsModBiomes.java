
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tggame.moredimensions.init;

import tggame.moredimensions.world.biome.STONEWORDBiome;
import tggame.moredimensions.MoreDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreDimensionsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MoreDimensionsMod.MODID);
	public static final RegistryObject<Biome> STONEWORD = REGISTRY.register("stoneword", () -> STONEWORDBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			STONEWORDBiome.init();
		});
	}
}
