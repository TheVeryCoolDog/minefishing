package vcd.minefishing;

import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Components {

	public static final ComponentType<String> RARITY = Registry.register(
			Registries.DATA_COMPONENT_TYPE,
			Identifier.of(Minefishing.MOD_ID, "rarity"),
			ComponentType.<String>builder().codec(Codec.STRING).build()
	);

	public static final ComponentType<String> SCINAME = Registry.register(
			Registries.DATA_COMPONENT_TYPE,
			Identifier.of(Minefishing.MOD_ID, "sciname"),
			ComponentType.<String>builder().codec(Codec.STRING).build()
	);

	public static final ComponentType<String> FLAVOUR = Registry.register(
			Registries.DATA_COMPONENT_TYPE,
			Identifier.of(Minefishing.MOD_ID, "flavour"),
			ComponentType.<String>builder().codec(Codec.STRING).build()
	);
/*
	public static final ComponentType<Integer> TIER = Registry.register(
			Registries.DATA_COMPONENT_TYPE,
			Identifier.of(Minefishing.MOD_ID, "tier"),
			ComponentType.<Integer>builder().codec(Codec.INT).build()
	);
*/
	public static final ComponentType<Double> SIZE = Registry.register(
			Registries.DATA_COMPONENT_TYPE,
			Identifier.of(Minefishing.MOD_ID, "size"),
			ComponentType.<Double>builder().codec(Codec.DOUBLE).build()
	);

	public static final ComponentType<Integer> VALUE = Registry.register(
			Registries.DATA_COMPONENT_TYPE,
			Identifier.of(Minefishing.MOD_ID, "value"),
			ComponentType.<Integer>builder().codec(Codec.INT).build()
	);

	protected static void initialize() {
		Minefishing.LOGGER.info("Registering {} components", Minefishing.MOD_ID);
	}
}
