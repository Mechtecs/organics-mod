package tk.mechtecs.organicmod.blocks;

import tk.mechtecs.organicmod.organicmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class paprica_g_block extends BlockCrops{
	
	public paprica_g_block(){
		this.setUnlocalizedName("papricaGCropBlock");
		this.setCreativeTab(organicmod.ct.tabOrganics);
	}
	
	@Override
	protected Item getSeed()
    {
        return organicmod.paprica_g_seeds;
    }

	@Override
    protected Item getCrop()
    {
        return organicmod.paprica_g_crop;
    }
}
