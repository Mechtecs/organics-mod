package tk.mechtecs.organicmod.blocks;

import tk.mechtecs.organicmod.organicmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class paprica_y_block extends BlockCrops{
	
	public paprica_y_block(){
		this.setUnlocalizedName("papricaYCropBlock");
		this.setCreativeTab(organicmod.ct.tabOrganics);
	}
	
	@Override
	protected Item getSeed()
    {
        return organicmod.paprica_y_seeds;
    }

	@Override
    protected Item getCrop()
    {
        return organicmod.paprica_y_crop;
    }
}
