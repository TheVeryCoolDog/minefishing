package vcd.minefishing;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class FishGroup {
    public static final ItemGroup FRESH = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Minefishing.MOD_ID, "fresh"),
            FabricItemGroup.builder().displayName(Text.translatable("minefishing.fresh"))
                    .icon(() -> new ItemStack(FishItems.SALMON)).entries(
                            (displaycontext, entries) -> {
                        entries.add(FishItems.ALLIGATOR);
                        entries.add(FishItems.AXOLOTL);
                        entries.add(FishItems.BLUEGILL);
                        entries.add(FishItems.BOWFIN);
                        entries.add(FishItems.BULLSHARK);
                        entries.add(FishItems.CARP);
                        entries.add(FishItems.CATFISH);
                        entries.add(FishItems.CRAB);
                        entries.add(FishItems.CRAPPIE);
                        entries.add(FishItems.CRAYFISH);
                        entries.add(FishItems.DRUM);
                        entries.add(FishItems.FROG);
                        entries.add(FishItems.GAR);
                        entries.add(FishItems.GOLDENBASS);
                        entries.add(FishItems.GOLDFISH);
                        entries.add(FishItems.GUPPY);
                        entries.add(FishItems.KINGSALMON);
                        entries.add(FishItems.KOI);
                        entries.add(FishItems.LARGEMOUTHBASS);
                        entries.add(FishItems.LEECH);
                        entries.add(FishItems.MOONEYE);
                        entries.add(FishItems.MUSKELLUNGE);
                        entries.add(FishItems.PERCH);
                        entries.add(FishItems.PIKE);
                        entries.add(FishItems.PUPFISH);
                        entries.add(FishItems.RAINBOWTROUT);
                        entries.add(FishItems.SALMON);
                        entries.add(FishItems.SNAIL);
                        entries.add(FishItems.STURGEON);
                        entries.add(FishItems.TOAD);
                        entries.add(FishItems.TURTLE);
                        entries.add(FishItems.WALLEYE);
                    }).build());

    public static final ItemGroup SALT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Minefishing.MOD_ID, "salt"),
            FabricItemGroup.builder().displayName(Text.translatable("minefishing.salt"))
                    .icon(() -> new ItemStack(FishItems.ATLANTICSALMON)).entries(
                            (displaycontext, entries) -> {
                        entries.add(FishItems.ANGELFISH);
                        entries.add(FishItems.ATLANTICSALMON);
                        entries.add(FishItems.BLUEFISH);
                        entries.add(FishItems.CLOWNFISH);
                        entries.add(FishItems.COELACANTH);
                        entries.add(FishItems.DOGFISH);
                        entries.add(FishItems.EEL);
                        entries.add(FishItems.FLOUNDER);
                        entries.add(FishItems.GOLDENMANTARAY);
                        entries.add(FishItems.GREATWHITESHARK);
                        entries.add(FishItems.GROUPER);
                        entries.add(FishItems.HAMMERHEADSHARK);
                        entries.add(FishItems.HERRING);
                        entries.add(FishItems.KRILL);
                        entries.add(FishItems.LIONFISH);
                        entries.add(FishItems.LOBSTER);
                        entries.add(FishItems.MANOWAR);
                        entries.add(FishItems.MANTARAY);
                        entries.add(FishItems.MARLIN);
                        entries.add(FishItems.OCTOPUS);
                        entries.add(FishItems.OYSTER);
                        entries.add(FishItems.SAWFISH);
                        entries.add(FishItems.SEATURTLE);
                        entries.add(FishItems.SEAHORSE);
                        entries.add(FishItems.SHRIMP);
                        entries.add(FishItems.SQUID);
                        entries.add(FishItems.STINGRAY);
                        entries.add(FishItems.SUNFISH);
                        entries.add(FishItems.SWORDFISH);
                        entries.add(FishItems.TUNA);
                        entries.add(FishItems.WHALE);
                        entries.add(FishItems.WOLFFISH);
                    }).build());

    public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Minefishing.MOD_ID, "misc"),
            FabricItemGroup.builder().displayName(Text.translatable("minefishing.misc"))
                    .icon(() -> new ItemStack(FishItems.UNIDENTIFIEDFISHOBJECT)).entries(
                            (displaycontext, entries) -> {
                        entries.add(FishItems.ANOMALOCARIS);
                        entries.add(FishItems.HELICOPRION);
                        entries.add(FishItems.HORSESHOECRAB);
                        entries.add(FishItems.LEEDSICHTHYS);
                        entries.add(FishItems.BONE);
                        entries.add(FishItems.BRANCH);
                        entries.add(FishItems.DIAMOND);
                        entries.add(FishItems.DRINKRINGS);
                        entries.add(FishItems.OLDBOOT);
                        entries.add(FishItems.PLASTICBAG);
                        entries.add(FishItems.SODACAN);
                        entries.add(FishItems.WEED);
                        entries.add(FishItems.UNIDENTIFIEDFISHOBJECT);
                        entries.add(FishItems.CREATURE);
                    }).build());

    public static void initialize() {
        Minefishing.LOGGER.info("Registering {} Groups", Minefishing.MOD_ID);
    }
}