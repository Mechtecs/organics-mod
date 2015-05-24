package tk.mechtecs.organics;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class tomatoCrop extends BlockCrops{
	
	@Override
	protected Item getSeed()
    {
        return OrganicsMod.tomatoSeeds;
    }

	@Override
    protected Item getCrop()
    {
        return OrganicsMod.tomatoCrop;
    }

}
