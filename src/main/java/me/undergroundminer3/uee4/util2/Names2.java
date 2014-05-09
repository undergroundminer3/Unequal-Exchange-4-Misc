package me.undergroundminer3.uee4.util2;

import me.undergroundminer3.uee4.reference.Textures;

public final class Names2 {

	private Names2() {};

	public final static class Pipes
	{
		private Pipes() {};

		public static final String EMC1_WOOD_PIPE = "emcAirPipeWood";
		public static final String EMC1_STONE_PIPE = "emcAirPipeStone";
		public static final String EMC1_COBBLESTONE_PIPE = "emcAirPipeCobblestone";
		public static final String EMC1_QUARTZ_PIPE = "emcAirPipeQuartz";
		public static final String EMC1_GOLD_PIPE = "emcAirPipeGold";
		public static final String EMC1_DIAMOND_PIPE = "emcAirPipeDiamond";
		
		public static final String EMC2_WOOD_PIPE = "emcHeatPipeWood";
		public static final String EMC2_STONE_PIPE = "emcHeatPipeStone";
		public static final String EMC2_COBBLESTONE_PIPE = "emcHeatPipeCobblestone";
		public static final String EMC2_QUARTZ_PIPE = "emcHeatPipeQuartz";
		public static final String EMC2_GOLD_PIPE = "emcHeatPipeGold";
		public static final String EMC2_DIAMOND_PIPE = "emcHeatPipeDiamond";
	}

	public final static class NETIDS {

		private NETIDS() {};

		public static final int POWER_UPDATE = 1;
		public static final int GUI_WIDGET = 2;

		public static final String PIPE_CHANNEL_NAME = "UEE4-PIPE";
	}

	public final static class EmcMachines {

		private EmcMachines() {};

		public static final String CONV_MJ_EMCAIR = "mjToEmc1Block";
		public static final String CONV_EMCAIR_MJ = "emc1ToMjBlock";

	}

	public final static class EmcTiles {

		private EmcTiles() {};

		public static final String CONV_MJ_EMC1 = "mjToEmc1Tile";
		public static final String CONV_EMC1_MJ = "emc1ToMjTile";

	}

	public final static class FacadeBlacklist {

		private FacadeBlacklist() {};
		
		public static final String BLACKLIST_PREFIX = Textures.RESOURCE_PREFIX.toUpperCase();

		public static final String CONV_MJ_EMC1 = BLACKLIST_PREFIX + "mjToEmc1Tile";
		public static final String CONV_EMC1_MJ = BLACKLIST_PREFIX + "emc1ToMjTile";

	}
	
	public static final class Engines {
		
		private Engines() {};
		
		public static final String ENGINE_TILE_NAME = "uee4EnginePlus";
		
		public static final String ENGINE_WOOD_TE = "uee4/engineWood";
		public static final String ENGINE_WOOD_LOC_NAME = "tile.uee4.redstoneEngineBcPlus";
		public static final String ENGINE_WOOD_INTERN_NAME = "redstone";
	}
	
	public static final class GuiIDS {
		
		private GuiIDS() {};
		
		public static final int GUI_ENGINEPLUS = 10;
	}
	
	public static final class Energy {
		
		private Energy() {};
		
		public static final String CHANNEL_EMCAIR = "unequalExchangeEmcAir";
	}
}
