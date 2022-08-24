
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tggame.moredimensions.init;

import tggame.moredimensions.block.STONEWORD2PortalBlock;
import tggame.moredimensions.MoreDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class MoreDimensionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDimensionsMod.MODID);
	public static final RegistryObject<Block> STONEWORD_2_PORTAL = REGISTRY.register("stoneword_2_portal", () -> new STONEWORD2PortalBlock());
}
