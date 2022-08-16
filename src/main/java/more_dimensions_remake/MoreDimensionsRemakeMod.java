/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package more_dimensions_remake;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import more_dimensions_remake.init.MoreDimensionsRemakeModItems;
import more_dimensions_remake.init.MoreDimensionsRemakeModBlocks;
import more_dimensions_remake.init.MoreDimensionsRemakeModBiomes;

public class MoreDimensionsRemakeMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "more_dimensions_remake";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MoreDimensionsRemakeMod");

		MoreDimensionsRemakeModBlocks.load();
		MoreDimensionsRemakeModItems.load();

		MoreDimensionsRemakeModBiomes.load();

	}
}
