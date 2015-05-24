package tk.mechtecs.organicmod.blocks;

import net.minecraft.block.Block;
import tk.mechtecs.organicmod.organicmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tomato_crop_block extends BlockCrops {
	
	public tomato_crop_block() {
		this.setUnlocalizedName("tomatoCropBlock");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
	@Override
	protected Item getSeed()
    {
        return organicmod.tomato_seeds;
    }

	@Override
    protected Item getCrop()
    {
        return organicmod.tomato_crop;
    }
}
