
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tggame.moredimensions.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MoreDimensionsModTabs {
	public static CreativeModeTab TAB_WORDS;

	public static void load() {
		TAB_WORDS = new CreativeModeTab("tabwords") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRASS_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
