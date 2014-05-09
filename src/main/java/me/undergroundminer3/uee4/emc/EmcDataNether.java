package me.undergroundminer3.uee4.emc;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/* packaged */
class EmcDataNether implements EmcDataProvider {
	
	public static final Item lavaBlockItem = new ItemStack(Blocks.lava).getItem();

	@Override
	public EmcData provide(final ItemStack stack) {

		final Item item = stack.getItem();
		
		if (item == null) return new EmcData();
		
		final int damage = stack.getItemDamage();
		final EmcData data = new EmcData();
		boolean got = false;
		
		data.kindoma = -1000; //nether
		
		if (item == lavaBlockItem) {
			got = true;
			data.kindoma = -700; //also in bottom of overworld
			
		}
		
		//TODO everything in nether

		return got == true ? data.mul(stack.stackSize) : null;
	}

	@Override
	public String getModAndName() {
		return "UEE4's Nether Emc provider";
	}
}
