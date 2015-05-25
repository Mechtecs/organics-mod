package tk.mechtecs.organicmod.items;

import tk.mechtecs.organicmod.organicmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class paprica_r_crop  extends ItemFood{

	public paprica_r_crop() {
		super(4, false);
		this.setUnlocalizedName("papricaRCrop");
		this.setCreativeTab(organicmod.ct.tabOrganics);
	}

}
