
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tggame.moredimensions.init;

import tggame.moredimensions.item.STONEWORD2Item;
import tggame.moredimensions.MoreDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class MoreDimensionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDimensionsMod.MODID);
	public static final RegistryObject<Item> STONEWORD_2 = REGISTRY.register("stoneword_2", () -> new STONEWORD2Item());
}
