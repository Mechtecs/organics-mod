package tk.mechtecs.organicmod.items;

import tk.mechtecs.organicmod.organicmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class tomato_crop extends ItemFood{
	
	public tomato_crop() {
		super(4, false);
		this.setUnlocalizedName("tomatoCrop");
		this.setCreativeTab(organicmod.ct.tabOrganics);
		
	}
	
}
