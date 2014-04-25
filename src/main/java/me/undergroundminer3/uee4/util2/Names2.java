package me.undergroundminer3.uee4.util2;

import me.undergroundminer3.uee4.reference.Reference;
import me.undergroundminer3.uee4.reference.Textures;

public final class Names2 {

	private Names2() {};

	public final static class Pipes
	{
		private Pipes() {};

		public static final String EMC1_WOOD_PIPE = "emc1PipeWood";
		public static final String EMC1_STONE_PIPE = "emc1PipeStone";
		public static final String EMC1_COBBLESTONE_PIPE = "emc1PipeCobblestone";
		public static final String EMC1_QUARTZ_PIPE = "emc1PipeQuartz";
		public static final String EMC1_GOLD_PIPE = "emc1PipeGold";
		public static final String EMC1_DIAMOND_PIPE = "emc1PipeDiamond";
	}

	public final static class NETIDS {

		private NETIDS() {};

		public static final int POWER_UPDATE = 0;

		public static final String PIPE_CHANNEL_NAME = "UEE4-PIPE";
	}

	public final static class EmcMachines {

		private EmcMachines() {};

		public static final String CONV_MJ_EMC1 = "mjToEmc1Block";
		public static final String CONV_EMC1_MJ = "emc1ToMjBlock";

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
}
