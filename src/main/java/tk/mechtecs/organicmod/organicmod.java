package tk.mechtecs.organicmod;

import com.jcraft.jorbis.Block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import tk.mechtecs.organicmod.blocks.*;
import tk.mechtecs.organicmod.items.*;

@Mod(modid = organicmod.MODID, version = organicmod.VERSION, name = "The ORGANICS Mod")
public class organicmod
{
    public static final String MODID = "organicmod";
    public static final String VERSION = "1.0";
    public static final String MODNAME = "The ORGANICS Mod";
    
    /*
     * Items
     */
    public static Item tomato_crop;
    public static Item tomato_seeds;
    
    /*
     * Blocks
     */
    public static tk.mechtecs.organicmod.blocks.tomato_crop_block tomato_crop_block;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	tomato_crop = new tomato_crop();
    	tomato_crop_block = new tomato_crop_block();
    	tomato_seeds = new ItemSeeds(tomato_crop_block, Blocks.farmland).setUnlocalizedName("tomato_seeds").setCreativeTab(CreativeTabs.tabAllSearch);
    	
    	GameRegistry.registerItem(tomato_crop, tomato_crop.getUnlocalizedName());
    	GameRegistry.registerItem(tomato_seeds, tomato_seeds.getUnlocalizedName());
    	
    	GameRegistry.registerBlock(tomato_crop_block, tomato_crop_block.getUnlocalizedName());
    	
    	
    	if(event.getSide() == Side.CLIENT)
    	{
    	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	    
    	    	renderItem.getItemModelMesher().register(tomato_crop, 0, new ModelResourceLocation(this.MODID+":"+tomato_crop.getUnlocalizedName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(tomato_seeds, 0, new ModelResourceLocation(this.MODID+":"+tomato_seeds.getUnlocalizedName(), "inventory"));
    	}
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
