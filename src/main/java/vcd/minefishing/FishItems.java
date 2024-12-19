package vcd.minefishing;

import com.google.common.base.Function;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class FishItems extends Item{
	public FishItems(Settings settings) {
		super(settings);
	}

	public static final Item ALLIGATOR = register("alligator", FishItems::new, new Settings()
			.component(Components.SCINAME, "Alligator mississippiensis")
			.component(Components.FLAVOUR, "\"See you later- !\""));
	public static final Item ANGELFISH = register("angelfish", FishItems::new, new Settings()
			.component(Components.SCINAME, "Pterophyllum scalare")
			.component(Components.FLAVOUR, "\"Obtuse or acute? (... did i read that right?)\""));
	public static final Item ANOMALOCARIS = register("anomalocaris", FishItems::new, new Settings()
			.component(Components.SCINAME, "Anomalocaris canadensis")
			.component(Components.FLAVOUR, "\"Doing it's best :)\""));
	public static final Item ATLANTICSALMON = register("atlantic_salmon", FishItems::new, new Settings()
			.component(Components.SCINAME,"Salmo salar")
			.component(Components.FLAVOUR, "\"It's like non-atlantic salmon but atlantic\""));
	public static final Item AXOLOTL = register("axolotl", FishItems::new, new Settings()
			.component(Components.SCINAME, "Ambystoma mexicanum")
			.component(Components.FLAVOUR, "\"Can I ax-olotl you a question? (...I tried, ok?)\""));
	public static final Item BLUEFISH = register("bluefish", FishItems::new, new Settings()
			.component(Components.SCINAME, "Pomatomus saltatrix")
			.component(Components.FLAVOUR, "\"One fish, two fish, red fish...\""));
	public static final Item BLUEGILL = register("bluegill", FishItems::new, new Settings()
			.component(Components.SCINAME, "Lepomis macrochirus")
			.component(Components.FLAVOUR, "\"Bluegill? What a thrill!\""));
	public static final Item BONE = register("bone", FishItems::new, new Settings()
			.component(Components.SCINAME,"What a story!\n")
			.component(Components.FLAVOUR,"\"Yuck! Who put this in here...\""));
	public static final Item BOWFIN = register("bowfin", FishItems::new, new Settings()
			.component(Components.SCINAME,"Amia calva")
			.component(Components.FLAVOUR,"\"Bowfin deez n-\""));
	public static final Item BRANCH = register("branch", FishItems::new, new Settings()
			.component(Components.SCINAME,"Stick!")
			.component(Components.FLAVOUR,"\"Agh! Caught a snag!\""));
	public static final Item BULLSHARK = register("bull_shark", FishItems::new, new Settings()
			.component(Components.SCINAME,"Carcharhinus leucas")
			.component(Components.FLAVOUR,"\"Bullshark? Bull S-\""));
	public static final Item CARP = register("carp", FishItems::new, new Settings()
			.component(Components.SCINAME,"Cyprinus carpio")
			.component(Components.FLAVOUR,"\"Carp? What a lark!\""));
	public static final Item CATFISH = register("catfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Ictalurus punctatus")
			.component(Components.FLAVOUR,"\"He's just like you! But yknow... more... fishy?\""));
	public static final Item CLOWNFISH = register("clownfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Amphiprion ocellaris")
			.component(Components.FLAVOUR,"\"Well this isnt so scary...\""));
	public static final Item COELACANTH = register("coelacanth", FishItems::new, new Settings()
			.component(Components.SCINAME,"Latimeria chalumnae")
			.component(Components.FLAVOUR,"\"Did you see it? I can't!\""));
	public static final Item CRAB = register("crab", FishItems::new, new Settings()
			.component(Components.SCINAME,"Uca minax")
			.component(Components.FLAVOUR,"\"Arg!\""));
	public static final Item CRAPPIE = register("crappie", FishItems::new, new Settings()
			.component(Components.SCINAME,"Pomoxis annularis")
			.component(Components.FLAVOUR,"\"Holy Crappie!\""));
	public static final Item CRAYFISH = register("crayfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Procambarus clarkii")
			.component(Components.FLAVOUR,"\"Blah blah blah.\""));
	public static final Item CREATURE = register("creature", FishItems::new, new Settings()
			.component(Components.SCINAME,"rraim eor")
			.component(Components.FLAVOUR,"\"NiceCatch!NiceCatch!NiceCatch!NiceCatch!NiceCatch!NiceCatch!NiceCatch" +
					"!NiceCatch!NiceCatch!NiceCatch!\""));
	public static final Item DIAMOND = register("diamond", FishItems::new, new Settings()
			.component(Components.SCINAME,"Shiny!")
			.component(Components.FLAVOUR,"\"Dug right out of the rough!\""));
	public static final Item DOGFISH = register("dogfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Squalus acanthias")
			.component(Components.FLAVOUR,"\"He's just like you! But yknow... more... fishy?\""));
	public static final Item DRINKRINGS = register("drink_rings", FishItems::new, new Settings()
			.component(Components.SCINAME,"Don't Litter!")
			.component(Components.FLAVOUR,"\"Yuck! Who put this in here...\""));
	public static final Item DRUM = register("drum", FishItems::new, new Settings()
			.component(Components.SCINAME,"Aplodinotus grunniens")
			.component(Components.FLAVOUR,"\"Also known as the Gooble Gobble. Real fact.\""));
	public static final Item EEL = register("eel", FishItems::new, new Settings()
			.component(Components.SCINAME,"Anguilla anguilla")
			.component(Components.FLAVOUR,"\"Eel? EEL!\""));
	public static final Item FLOUNDER = register("flounder", FishItems::new, new Settings()
			.component(Components.SCINAME,"Paralichthys dentatus")
			.component(Components.FLAVOUR,"\"Flounder? I hardly know 'er!\""));
	public static final Item FROG = register("frog", FishItems::new, new Settings()
			.component(Components.SCINAME,"Rana temporaria")
			.component(Components.FLAVOUR,"\"Cozy Staple.\""));
	public static final Item GAR = register("gar", FishItems::new, new Settings()
			.component(Components.SCINAME,"Atractosteus spatul")
			.component(Components.FLAVOUR,"\"Step-Brother of the Alligator!\""));
	public static final Item GOLDENBASS = register("golden_bass", FishItems::new, new Settings()
			.component(Components.SCINAME,"Micropterus aurum")
			.component(Components.FLAVOUR,"\"Woah! What a catch!\""));
	public static final Item GOLDENMANTARAY = register("golden_manta_ray", FishItems::new, new Settings()
			.component(Components.SCINAME,"Mobula aurum")
			.component(Components.FLAVOUR,"\"Woah! What a catch!\""));
	public static final Item GOLDFISH = register("goldfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Carassius auratus")
			.component(Components.FLAVOUR,"\"We're rich!\""));
	public static final Item GREATWHITESHARK = register("great_white_shark", FishItems::new, new Settings()
			.component(Components.SCINAME,"Carcharodon carcharias")
			.component(Components.FLAVOUR,"\"Do I smell blood...?\""));
	public static final Item GROUPER = register("grouper", FishItems::new, new Settings()
			.component(Components.SCINAME,"Mycteroperca bonaci")
			.component(Components.FLAVOUR,"\"Grouper? I hardly know 'er!\""));
	public static final Item GUPPY = register("guppy", FishItems::new, new Settings()
			.component(Components.SCINAME,"Poecilia reticulata")
			.component(Components.FLAVOUR,"\"Guess you're a guppy puppy!\""));
	public static final Item HAMMERHEADSHARK = register("hammerhead_shark", FishItems::new, new Settings()
			.component(Components.SCINAME,"Sphyrna mokarran")
			.component(Components.FLAVOUR,"\"Guess you hit the nail on the head!\""));
	public static final Item HELICOPRION = register("helicoprion", FishItems::new, new Settings()
			.component(Components.SCINAME,"Helicoprion bessonowi")
			.component(Components.FLAVOUR,"\"Nature's pizza cutter!\""));
	public static final Item HERRING = register("herring", FishItems::new, new Settings()
			.component(Components.SCINAME,"Clupea harengus")
			.component(Components.FLAVOUR,"\"Huh... this isnt red...\""));
	public static final Item HORSESHOECRAB = register("horseshoe_crab", FishItems::new, new Settings()
			.component(Components.SCINAME,"Tachypleus tridentatus")
			.component(Components.FLAVOUR,"\"Guess it's my lucky day!\""));
	public static final Item KINGSALMON = register("king_salmon", FishItems::new, new Settings()
			.component(Components.SCINAME,"Oncorhynchus tshawytscha")
			.component(Components.FLAVOUR,"\"Royalty!\""));
	public static final Item KOI = register("koi", FishItems::new, new Settings()
			.component(Components.SCINAME,"Cyprinus rubrofuscus")
			.component(Components.FLAVOUR,"\"This koi is the boy for me!\""));
	public static final Item KRILL = register("krill", FishItems::new, new Settings()
			.component(Components.SCINAME,"Euphausia superba")
			.component(Components.FLAVOUR,"\"Shrimply impressive! (this isnt a shrimp btw)\""));
	public static final Item LARGEMOUTHBASS = register("largemouth_bass", FishItems::new, new Settings()
			.component(Components.SCINAME,"Micropterus salmoides")
			.component(Components.FLAVOUR,"\"Seems out of tune to me.\""));
	public static final Item LEECH = register("leech", FishItems::new, new Settings()
			.component(Components.SCINAME,"Hirudo medicinalis")
			.component(Components.FLAVOUR,"\"Bringing back oldschool medicine!\""));
	public static final Item LEEDSICHTHYS = register("leedsichthys", FishItems::new, new Settings()
			.component(Components.SCINAME,"Leedsichthys problematicus")
			.component(Components.FLAVOUR,"\"A giant!\""));
	public static final Item LIONFISH = register("lionfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Pterois volitans")
			.component(Components.FLAVOUR,"\"Well I ain't callin' you a truther!\""));
	public static final Item LOBSTER = register("lobster", FishItems::new, new Settings()
			.component(Components.SCINAME,"Homarus americanus")
			.component(Components.FLAVOUR,"\"What a beaut!\""));
	public static final Item MANOWAR = register("man_o_war", FishItems::new, new Settings()
			.component(Components.SCINAME,"Physalia physalis")
			.component(Components.FLAVOUR,"\"ok you should probably not be holding this\""));
	public static final Item MANTARAY = register("manta_ray", FishItems::new, new Settings()
			.component(Components.SCINAME,"Mobula birostris")
			.component(Components.FLAVOUR,"\"The butterfly of the sea!\""));
	public static final Item MARLIN = register("marlin", FishItems::new, new Settings()
			.component(Components.SCINAME,"Makaira nigricans")
			.component(Components.FLAVOUR,"\"Something something MARLIN\""));
	public static final Item MOONEYE = register("mooneye", FishItems::new, new Settings()
			.component(Components.SCINAME,"Hiodon tergisus")
			.component(Components.FLAVOUR,"\"Mooneye? At this time?\""));
	public static final Item MUSKELLUNGE = register("muskellunge", FishItems::new, new Settings()
			.component(Components.SCINAME,"Esox masquinongy")
			.component(Components.FLAVOUR,"\"A muskie!\""));
	public static final Item OCTOPUS = register("octopus", FishItems::new, new Settings()
			.component(Components.SCINAME,"Octopus vulgaris")
			.component(Components.FLAVOUR,"\"How vulgar!\""));
	public static final Item OLDBOOT = register("old_boot", FishItems::new, new Settings()
			.component(Components.SCINAME,"Don't Litter!")
			.component(Components.FLAVOUR,"\"Yuck! Who put this in here...\""));
	public static final Item OYSTER = register("oyster", FishItems::new, new Settings()
			.component(Components.SCINAME,"Crassostrea gigas")
			.component(Components.FLAVOUR,"\"Oyster? I hardly know 'er!\""));
	public static final Item PERCH = register("perch", FishItems::new, new Settings()
			.component(Components.SCINAME,"Perca flavescens")
			.component(Components.FLAVOUR,"\"Man am I parched...\""));
	public static final Item PIKE = register("pike", FishItems::new, new Settings()
			.component(Components.SCINAME,"Esox lucius")
			.component(Components.FLAVOUR,"\"This Piked my interest!\""));
	public static final Item PLASTICBAG = register("plastic_bag", FishItems::new, new Settings()
			.component(Components.SCINAME,"Don't Litter!")
			.component(Components.FLAVOUR,"\"Yuck! Who put this in here...\""));
	public static final Item PUPFISH = register("pupfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Cyprinodon pachycephalus")
			.component(Components.FLAVOUR,"\"A little puppy!\""));
	public static final Item RAINBOWTROUT = register("rainbow_trout", FishItems::new, new Settings()
			.component(Components.SCINAME,"Oncorhynchus mykiss")
			.component(Components.FLAVOUR,"\"These fishes gay. Good for them, good for them.\""));
	public static final Item SALMON = register("salmon", FishItems::new, new Settings()
			.component(Components.SCINAME,"Oncorhynchus nerka")
			.component(Components.FLAVOUR,"\"It's Sal' good, 'mon!\""));
	public static final Item SAWFISH = register("sawfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Pristis perotteti")
			.component(Components.FLAVOUR,"\"I saw it!\""));
	public static final Item SEATURTLE = register("sea_turtle", FishItems::new, new Settings()
			.component(Components.SCINAME,"Chelonia mydas")
			.component(Components.FLAVOUR,"\"Surf's up!\""));
	public static final Item SEAHORSE = register("seahorse", FishItems::new, new Settings()
			.component(Components.SCINAME,"Hippocampus kuda")
			.component(Components.FLAVOUR,"\"Giddy up!\""));
	public static final Item SHRIMP = register("shrimp", FishItems::new, new Settings()
			.component(Components.SCINAME,"Pandalus borealis")
			.component(Components.FLAVOUR,"\"One in a krillion! (this isnt a krill btw)\""));
	public static final Item SNAIL = register("snail", FishItems::new, new Settings()
			.component(Components.SCINAME,"Lymnaea stagnalis")
			.component(Components.FLAVOUR,"\"Meow?\""));
	public static final Item SODACAN = register("soda_can", FishItems::new, new Settings()
			.component(Components.SCINAME,"Don't Litter!")
			.component(Components.FLAVOUR,"\"Yuck! Who put this in here...\""));
	public static final Item SQUID = register("squid", FishItems::new, new Settings()
			.component(Components.SCINAME,"Dosidicus gigas")
			.component(Components.FLAVOUR,"\"A true alien!\""));
	public static final Item STINGRAY = register("sting_ray", FishItems::new, new Settings()
			.component(Components.SCINAME,"Dasyatis pastinaca")
			.component(Components.FLAVOUR,"\"What a ripper!\""));
	public static final Item STURGEON = register("sturgeon", FishItems::new, new Settings()
			.component(Components.SCINAME,"Acipenser fulvescens")
			.component(Components.FLAVOUR,"\"I want a second opinion.\""));
	public static final Item SUNFISH = register("sunfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Mola mola")
			.component(Components.FLAVOUR,"\"Here it comes!\""));
	public static final Item SWORDFISH = register("swordfish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Xiphias gladius")
			.component(Components.FLAVOUR,"\"Master duelist!\""));
	public static final Item TOAD = register("toad", FishItems::new, new Settings()
			.component(Components.SCINAME,"Bufo bufo")
			.component(Components.FLAVOUR,"\"What a boy!\""));
	public static final Item TUNA = register("tuna", FishItems::new, new Settings()
			.component(Components.SCINAME,"Thunnus alalunga")
			.component(Components.FLAVOUR,"\"Well this was a tuna fun!\""));
	public static final Item TURTLE = register("turtle", FishItems::new, new Settings()
			.component(Components.SCINAME,"Actinemys marmorata")
			.component(Components.FLAVOUR,"\"This catch was quite the hurdle!\""));
	public static final Item UNIDENTIFIEDFISHOBJECT = register("unidentified_fish_object",
			FishItems::new, new Settings()
					.component(Components.SCINAME,"Alienus Caninus")
					.component(Components.FLAVOUR,"\"...what? the fuck?\""));
	public static final Item WALLEYE = register("walleye", FishItems::new, new Settings()
			.component(Components.SCINAME,"Sander vitreus")
			.component(Components.FLAVOUR,"\"Walleye? What a guy!\""));
	public static final Item WEED = register("weed", FishItems::new, new Settings()
			.component(Components.SCINAME,"Weed!")
			.component(Components.FLAVOUR,"\"Agh! Caught a snag!\""));
	public static final Item WHALE = register("whale", FishItems::new, new Settings()
			.component(Components.SCINAME,"Balaenoptera musculus")
			.component(Components.FLAVOUR,"\"A whale of a time!\""));
	public static final Item WOLFFISH = register("wolffish", FishItems::new, new Settings()
			.component(Components.SCINAME,"Anarhichas lupus")
			.component(Components.FLAVOUR,"\"A true alpha.\""));

	public static Item register(String path, Function<Settings, Item> factory, Settings settings) {
		final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM,
				Identifier.of("minefishing", path));
		return Items.register(registryKey, factory, settings
				.component(Components.RARITY,"Normal")
				.component(Components.VALUE, 0)
				.component(Components.SIZE, 0.0));
	}

	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
		if (stack.contains(Components.RARITY)) {
			String rarity = stack.get(Components.RARITY);
			tooltip.add(Text.translatable("item.minefishing.rarity.info", rarity).formatted(Formatting.AQUA));
		}
		if (stack.contains(Components.SCINAME)) {
			String sciname = stack.get(Components.SCINAME);
			tooltip.add(Text.translatable("item.minefishing.sciname.info", sciname).formatted(Formatting.GRAY));
		}
		if (stack.contains(Components.FLAVOUR)) {
			String flavour = stack.get(Components.FLAVOUR);
			tooltip.add(Text.translatable("item.minefishing.flavour.info", flavour).formatted(Formatting.GRAY));
		}
		if (stack.contains(Components.SIZE)) {
			double size = stack.get(Components.SIZE);
			tooltip.add(Text.translatable("item.minefishing.size.info", size).formatted(Formatting.WHITE));
		}
		if (stack.contains(Components.VALUE)) {
			int value = stack.get(Components.VALUE);
			tooltip.add(Text.translatable("item.minefishing.value.info", value).formatted(Formatting.WHITE));
		}
	}

	protected static void initialize() {
		Minefishing.LOGGER.info("Registering {} Fish", Minefishing.MOD_ID);
	}
}

