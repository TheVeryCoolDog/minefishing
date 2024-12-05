package vcd.minefishing;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(ModelGenerator::new);
    }

    public static class ModelGenerator extends FabricModelProvider {
        public ModelGenerator(FabricDataOutput generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(FishItems.ALLIGATOR, Models.GENERATED);
            itemModelGenerator.register(FishItems.ANGELFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.ANOMALOCARIS, Models.GENERATED);
            itemModelGenerator.register(FishItems.ATLANTICSALMON, Models.GENERATED);
            itemModelGenerator.register(FishItems.AXOLOTL, Models.GENERATED);
            itemModelGenerator.register(FishItems.BLUEFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.BLUEGILL, Models.GENERATED);
            itemModelGenerator.register(FishItems.BONE, Models.GENERATED);
            itemModelGenerator.register(FishItems.BOWFIN, Models.GENERATED);
            itemModelGenerator.register(FishItems.BRANCH, Models.GENERATED);
            itemModelGenerator.register(FishItems.BULLSHARK, Models.GENERATED);
            itemModelGenerator.register(FishItems.CARP, Models.GENERATED);
            itemModelGenerator.register(FishItems.CATFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.CLOWNFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.COELACANTH, Models.GENERATED);
            itemModelGenerator.register(FishItems.CRAB, Models.GENERATED);
            itemModelGenerator.register(FishItems.CRAPPIE, Models.GENERATED);
            itemModelGenerator.register(FishItems.CRAYFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.CREATURE, Models.GENERATED);
            itemModelGenerator.register(FishItems.DIAMOND, Models.GENERATED);
            itemModelGenerator.register(FishItems.DOGFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.DRINKRINGS, Models.GENERATED);
            itemModelGenerator.register(FishItems.DRUM, Models.GENERATED);
            itemModelGenerator.register(FishItems.EEL, Models.GENERATED);
            itemModelGenerator.register(FishItems.FLOUNDER, Models.GENERATED);
            itemModelGenerator.register(FishItems.FROG, Models.GENERATED);
            itemModelGenerator.register(FishItems.GAR, Models.GENERATED);
            itemModelGenerator.register(FishItems.GOLDENBASS, Models.GENERATED);
            itemModelGenerator.register(FishItems.GOLDENMANTARAY, Models.GENERATED);
            itemModelGenerator.register(FishItems.GOLDFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.GREATWHITESHARK, Models.GENERATED);
            itemModelGenerator.register(FishItems.GROUPER, Models.GENERATED);
            itemModelGenerator.register(FishItems.GUPPY, Models.GENERATED);
            itemModelGenerator.register(FishItems.HAMMERHEADSHARK, Models.GENERATED);
            itemModelGenerator.register(FishItems.HELICOPRION, Models.GENERATED);
            itemModelGenerator.register(FishItems.HERRING, Models.GENERATED);
            itemModelGenerator.register(FishItems.HORSESHOECRAB, Models.GENERATED);
            itemModelGenerator.register(FishItems.KINGSALMON, Models.GENERATED);
            itemModelGenerator.register(FishItems.KOI, Models.GENERATED);
            itemModelGenerator.register(FishItems.KRILL, Models.GENERATED);
            itemModelGenerator.register(FishItems.LARGEMOUTHBASS, Models.GENERATED);
            itemModelGenerator.register(FishItems.LEECH, Models.GENERATED);
            itemModelGenerator.register(FishItems.LEEDSICHTHYS, Models.GENERATED);
            itemModelGenerator.register(FishItems.LIONFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.LOBSTER, Models.GENERATED);
            itemModelGenerator.register(FishItems.MANOWAR, Models.GENERATED);
            itemModelGenerator.register(FishItems.MANTARAY, Models.GENERATED);
            itemModelGenerator.register(FishItems.MARLIN, Models.GENERATED);
            itemModelGenerator.register(FishItems.MOONEYE, Models.GENERATED);
            itemModelGenerator.register(FishItems.MUSKELLUNGE, Models.GENERATED);
            itemModelGenerator.register(FishItems.OCTOPUS, Models.GENERATED);
            itemModelGenerator.register(FishItems.OLDBOOT, Models.GENERATED);
            itemModelGenerator.register(FishItems.OYSTER, Models.GENERATED);
            itemModelGenerator.register(FishItems.PERCH, Models.GENERATED);
            itemModelGenerator.register(FishItems.PIKE, Models.GENERATED);
            itemModelGenerator.register(FishItems.PLASTICBAG, Models.GENERATED);
            itemModelGenerator.register(FishItems.PUPFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.RAINBOWTROUT, Models.GENERATED);
            itemModelGenerator.register(FishItems.SALMON, Models.GENERATED);
            itemModelGenerator.register(FishItems.SAWFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.SEATURTLE, Models.GENERATED);
            itemModelGenerator.register(FishItems.SEAHORSE, Models.GENERATED);
            itemModelGenerator.register(FishItems.SHRIMP, Models.GENERATED);
            itemModelGenerator.register(FishItems.SNAIL, Models.GENERATED);
            itemModelGenerator.register(FishItems.SODACAN, Models.GENERATED);
            itemModelGenerator.register(FishItems.SQUID, Models.GENERATED);
            itemModelGenerator.register(FishItems.STINGRAY, Models.GENERATED);
            itemModelGenerator.register(FishItems.STURGEON, Models.GENERATED);
            itemModelGenerator.register(FishItems.SUNFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.SWORDFISH, Models.GENERATED);
            itemModelGenerator.register(FishItems.TOAD, Models.GENERATED);
            itemModelGenerator.register(FishItems.TUNA, Models.GENERATED);
            itemModelGenerator.register(FishItems.TURTLE, Models.GENERATED);
            itemModelGenerator.register(FishItems.UNIDENTIFIEDFISHOBJECT, Models.GENERATED);
            itemModelGenerator.register(FishItems.WALLEYE, Models.GENERATED);
            itemModelGenerator.register(FishItems.WEED, Models.GENERATED);
            itemModelGenerator.register(FishItems.WHALE, Models.GENERATED);
            itemModelGenerator.register(FishItems.WOLFFISH, Models.GENERATED);
        }
    }
}