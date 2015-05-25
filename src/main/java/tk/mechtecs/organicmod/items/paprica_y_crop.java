package tk.mechtecs.organicmod.items;

import tk.mechtecs.organicmod.organicmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class paprica_y_crop extends ItemFood{

	public paprica_y_crop() {
		super(4, false);
		this.setUnlocalizedName("papricaYCrop");
		this.setCreativeTab(organicmod.ct.tabOrganics);
	}

}
