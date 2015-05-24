package tk.mechtecs.organics;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
@Mod(modid = OrganicsMod.MODID, version = OrganicsMod.VERSION, name=OrganicsMod.MODNAME)
public class OrganicsMod
{
    public static final String MODID = "organicsmod";
    public static final String MODNAME = "Organics Mod";
    public static final String VERSION = "0.0.1";
	

        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
        
    public static Item tomatoCrop;
    public static Block tomatoCropB;
    public static Item tomatoSeeds;
	
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	tomatoCrop = new Item().setUnlocalizedName("tomatoCrop");
    	tomatoCropB = new tomatoCrop().setUnlocalizedName("tomatoCropB");
    	tomatoSeeds = new ItemSeeds(tomatoCropB, Blocks.farmland).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("tomatoSeeds");
    	
    	
    	GameRegistry.registerItem(tomatoCrop, tomatoCrop.getUnlocalizedName());
    	GameRegistry.registerBlock(tomatoCropB, tomatoCropB.getUnlocalizedName());
    	GameRegistry.registerItem(tomatoSeeds, tomatoSeeds.getUnlocalizedName());
    	
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
