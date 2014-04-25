package me.undergroundminer3.uee4.reference;

public final class Names {
	
	private Names() {};
	
	public static final class Blocks {
		
		private Blocks() {};
		
		public static final String INFUSED_CLOTH = "infusedCloth";
		public static final String INFUSED_WOOD = "infusedWood";
		public static final String INFUSED_PLANK = "infusedPlank";
		public static final String ALCHEMICAL_CHEST = "alchemicalChest";
		public static final String ALUDEL = "aludel";
		public static final String GLASS_BELL = "glassBell";
		public static final String CALCINATOR = "calcinator";
		public static final String RESEARCH_STATION = "researchStation";
	}

	public static final class Items {
		
		private Items() {};
		
		public static final String ALCHEMICAL_BAG = "alchemicalBag";
		public static final String ALCHEMICAL_DUST = "alchemicalDust";
		public static final String[] ALCHEMICAL_DUST_SUBTYPES = {"ash", "verdant", "azure", "minium"};
		public static final String ALCHEMICAL_FUEL = "alchemicalFuel";
		public static final String ALCHEMICAL_COAL = "alchemicalCoal";
		public static final String MOBIUS_FUEL = "mobiusFuel";
		public static final String AETERNALIS_FUEL = "aeternalisFuel";
		public static final String[] ALCHEMICAL_FUEL_SUBTYPES = {ALCHEMICAL_COAL, MOBIUS_FUEL, AETERNALIS_FUEL};
		public static final String CHALK = "chalk";
		public static final String INERT_STONE = "stoneInert";
		public static final String MINIUM_SHARD = "shardMinium";
		public static final String MINIUM_STONE = "stoneMinium";
		public static final String PHILOSOPHERS_STONE = "stonePhilosophers";
		public static final String ALCHEMICAL_UPGRADE = "alchemicalUpgrade";
		public static final String[] ALCHEMICAL_UPGRADE_SUBTYPES = {"verdant", "azure", "minium"};
		public static final String DIVINING_ROD = "diviningRod";
		
		public static final String EMC_BUCKET = "bucketEmc";
		public static final String EMC_PACKET = "packetEmc";
	}
	
	public static final class Liquids {
		
		private Liquids() {};
		
		public static final String LIQUID_EMC = "liquidemc";
	}

	public static final class NBT {
		
		private NBT() {};
		
		public static final String CHARGE_LEVEL = "chargeLevel";
		public static final String MODE = "mode";
		public static final String CRAFTING_GUI_OPEN = "craftingGuiOpen";
		public static final String TRANSMUTATION_GUI_OPEN = "transmutationGuiOpen";
		public static final String ALCHEMICAL_BAG_GUI_OPEN = "alchemicalBagGuiOpen";
		public static final String UUID_MOST_SIG = "UUIDMostSig";
		public static final String UUID_LEAST_SIG = "UUIDLeastSig";
		public static final String DISPLAY = "display";
		public static final String COLOR = "color";
		public static final String STATE = "teState";
		public static final String CUSTOM_NAME = "CustomName";
		public static final String DIRECTION = "teDirection";
		public static final String OWNER = "owner";
	}

	public static final class Containers {
		
		private Containers() {};
		
		public static final String VANILLA_INVENTORY = "container.inventory";
		public static final String VANILLA_CRAFTING = "container.crafting";
		public static final String ALCHEMICAL_BAG = "container.uee4:" + Items.ALCHEMICAL_BAG;
		public static final String ALCHEMICAL_CHEST = "container.uee4:" + Blocks.ALCHEMICAL_CHEST;
		public static final String CALCINATOR_NAME = "container.uee4:" + Blocks.CALCINATOR;
		public static final String ALUDEL_NAME = "container.uee4:" + Blocks.ALUDEL;

		public static final String GLASS_BELL = "container.uee4:" + Blocks.GLASS_BELL;
	}
}
