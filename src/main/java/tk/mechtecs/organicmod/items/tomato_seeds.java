package tk.mechtecs.organicmod.items;

import tk.mechtecs.organicmod.blocks.tomato_crop_block;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class tomato_seeds extends ItemSeeds{
	
	public tomato_seeds(tomato_crop_block arg0, Block arg1) {
		super(arg0, arg1);
		super.setUnlocalizedName("tomato_seeds");
		this.setUnlocalizedName("tomato_seeds");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
