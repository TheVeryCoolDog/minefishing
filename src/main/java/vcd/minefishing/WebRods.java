package vcd.minefishing;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class WebRods {

    public static Item createRod(String name, String flavour) {
        Item.Settings properties;
        properties = new Item.Settings()
                .component(DataComponentTypes.MAX_STACK_SIZE, 1)
                .component(Components.FLAVOUR, flavour)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Minefishing.MOD_ID, name)));
        return new FishingRodItem(properties);
    }

    public static final List<Item> fishing_rods = new ArrayList<>();

    public static final Item SIMPLEROD = createRod("simple_rod",
            "Ol' reliable!");
    public static final Item SPECTRALROD = createRod("spectral_rod",
            "Me old bones!");
    public static final Item TRAVELERSROD = createRod("travelers_rod",
            "You've been around the block!");
    public static final Item COLLECTORSROD = createRod("collectors_rod",
            "For the greatest of the greats!");
    public static final Item SHININGROD = createRod("shining_rod",
            "For the greatest of the greats!");
    public static final Item GLISTENINGROD = createRod("glistening_rod",
            "For the greatest of the greats!");
    public static final Item OPULENTROD = createRod("opulent_rod",
            "For the greatest of the greats!");
    public static final Item RADIANTROD = createRod("radiant_rod",
            "For the greatest of the greats!");
    public static final Item ALPHAROD = createRod("alpha_rod",
            "For the SUPREME greatest of the greats! (Thanks for playing MINEFISHING!)");
    public static final Item PROSPEROUSROD = createRod("prosperous_rod",
            "Mr. Moneybags");

    protected static void initialize() {
        registerRod(SIMPLEROD, Items.FISHING_ROD, "simple_rod");
        registerRod(TRAVELERSROD, SIMPLEROD, "travelers_rod");
        registerRod(COLLECTORSROD, TRAVELERSROD, "collectors_rod");
        registerRod(SHININGROD, COLLECTORSROD, "shining_rod");
        registerRod(GLISTENINGROD, SHININGROD, "glistening_rod");
        registerRod(OPULENTROD, GLISTENINGROD, "opulent_rod");
        registerRod(RADIANTROD, OPULENTROD, "radiant_rod");
        registerRod(ALPHAROD, RADIANTROD, "alpha_rod");
        registerRod(SPECTRALROD, ALPHAROD, "spectral_rod");
        registerRod(PROSPEROUSROD, SPECTRALROD, "prosperous_rod");

        Minefishing.LOGGER.info("Registering {} Rods", Minefishing.MOD_ID);
    }
    private static void registerRod(Item rodItem, Item rodAfter, String name) {
        Registry.register(Registries.ITEM, Identifier.of(Minefishing.MOD_ID, (name)), rodItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->
                entries.addAfter(rodAfter, rodItem));
        fishing_rods.add(rodItem);
    }
}
/* TODO:
    - Fix ToolTips
 */