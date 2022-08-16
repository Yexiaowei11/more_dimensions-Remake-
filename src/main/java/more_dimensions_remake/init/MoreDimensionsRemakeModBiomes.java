
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package more_dimensions_remake.init;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import more_dimensions_remake.world.biome.StoneBiome;

import more_dimensions_remake.MoreDimensionsRemakeMod;

public class MoreDimensionsRemakeModBiomes {
	public static ResourceKey<Biome> STONE = ResourceKey.create(Registry.BIOME_REGISTRY,
			new ResourceLocation(MoreDimensionsRemakeMod.MODID, "stone"));

	public static void load() {
		StoneBiome.createBiome();
	}
}
