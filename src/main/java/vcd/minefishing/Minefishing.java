package vcd.minefishing;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minefishing implements ModInitializer {
	public static final String MOD_ID = "minefishing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Components.initialize();
		FishItems.initialize();
		FishGroup.initialize();
		WebRods.initialize();

		LOGGER.info("who up webbing they fish rn??");
	}
}

/* TODO:
    - Finish rods
    - Add Loot tables
    - Add Lures
    - Add NPCs
    - Add Props
    - Learn Java (optional) */