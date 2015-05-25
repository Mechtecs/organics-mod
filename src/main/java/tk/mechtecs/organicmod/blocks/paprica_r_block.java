package tk.mechtecs.organicmod.blocks;

import tk.mechtecs.organicmod.organicmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class paprica_r_block extends BlockCrops{
	
	public paprica_r_block(){
		this.setUnlocalizedName("papricaRCropBlock");
		this.setCreativeTab(organicmod.ct.tabOrganics);
	}
	
	@Override
	protected Item getSeed()
    {
        return organicmod.paprica_r_seeds;
    }

	@Override
    protected Item getCrop()
    {
        return organicmod.paprica_r_crop;
    }
}
