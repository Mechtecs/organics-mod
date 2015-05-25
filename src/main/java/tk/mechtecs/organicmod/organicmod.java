package tk.mechtecs.organicmod;

import com.jcraft.jorbis.Block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
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
    public static final String VERSION = "0.0.3";
    public static final String MODNAME = "The ORGANICS Mod";
    
    /*
     * Items
     */
    public static Item tomato_crop;
    public static Item tomato_seeds;
    
    public static Item paprica_y_crop;
    public static Item paprica_r_crop;
    public static Item paprica_g_crop;
    public static Item paprica_y_seeds;
    public static Item paprica_r_seeds;
    public static Item paprica_g_seeds;

    /*
     * Blocks
     */
    
    public static CreativeTab ct;
    
    public static tk.mechtecs.organicmod.blocks.tomato_crop_block tomato_crop_block;
    public static tk.mechtecs.organicmod.blocks.paprica_g_block paprica_g_block;
    public static tk.mechtecs.organicmod.blocks.paprica_r_block paprica_r_block;
    public static tk.mechtecs.organicmod.blocks.paprica_y_block paprica_y_block;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ct = new CreativeTab();
    	
    	tomato_crop = new tomato_crop();
    	tomato_crop_block = new tomato_crop_block();
    	tomato_seeds = new ItemSeeds(tomato_crop_block, Blocks.farmland).setUnlocalizedName("tomatoSeeds").setCreativeTab(ct.tabOrganics);
    	
    	paprica_g_crop = new tk.mechtecs.organicmod.items.paprica_g_crop();
    	paprica_g_block = new paprica_g_block();
    	paprica_g_seeds = new ItemSeeds(paprica_g_block, paprica_g_block).setUnlocalizedName("papricaGSeeds").setCreativeTab(ct.tabOrganics);
    	
    	paprica_r_crop = new tk.mechtecs.organicmod.items.paprica_r_crop();
    	paprica_r_block = new paprica_r_block();
    	paprica_r_seeds = new ItemSeeds(paprica_r_block, paprica_r_block).setUnlocalizedName("papricaRSeeds").setCreativeTab(ct.tabOrganics);
    	
    	paprica_y_crop = new tk.mechtecs.organicmod.items.paprica_y_crop();
    	paprica_y_block = new paprica_y_block();
    	paprica_y_seeds = new ItemSeeds(paprica_y_block, paprica_y_block).setUnlocalizedName("papricaYSeeds").setCreativeTab(ct.tabOrganics);
    	
    	GameRegistry.registerItem(tomato_crop, "tomato_crop");
    	GameRegistry.registerItem(tomato_seeds, "tomato_seeds");
    	
    	GameRegistry.registerItem(paprica_g_crop, "paprica_g_crop");
    	GameRegistry.registerItem(paprica_g_seeds, "paprica_g_seeds");
    	
    	GameRegistry.registerItem(paprica_r_crop, "paprica_r_crop");
    	GameRegistry.registerItem(paprica_r_seeds, "paprica_r_seeds");
    	
    	GameRegistry.registerItem(paprica_y_crop, "paprica_y_crop");
    	GameRegistry.registerItem(paprica_y_seeds, "paprica_y_seeds");
    	
    	GameRegistry.registerBlock(tomato_crop_block, "tomato_crop_block");
    	GameRegistry.registerBlock(paprica_g_block, "paprica_g_block");
    	GameRegistry.registerBlock(paprica_r_block, "paprica_r_block");
    	GameRegistry.registerBlock(paprica_y_block, "paprica_y_block");

    	MinecraftForge.addGrassSeed(new ItemStack(tomato_seeds), 10);
    	MinecraftForge.addGrassSeed(new ItemStack(paprica_g_seeds), 10);
    	MinecraftForge.addGrassSeed(new ItemStack(paprica_r_seeds), 10);
    	MinecraftForge.addGrassSeed(new ItemStack(paprica_y_seeds), 10);

    	if(event.getSide() == Side.CLIENT)
    	{
    	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	    
    	    	renderItem.getItemModelMesher().register(tomato_crop, 0, new ModelResourceLocation(this.MODID+":"+"tomato_crop", "inventory"));
    	    	renderItem.getItemModelMesher().register(tomato_seeds, 0, new ModelResourceLocation(this.MODID+":"+"tomato_seeds", "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(paprica_r_crop, 0, new ModelResourceLocation(this.MODID+":"+"paprica_r_crop", "inventory"));
    	    	renderItem.getItemModelMesher().register(paprica_r_seeds, 0, new ModelResourceLocation(this.MODID+":"+"paprica_r_seeds", "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(paprica_y_crop, 0, new ModelResourceLocation(this.MODID+":"+"paprica_y_crop", "inventory"));
    	    	renderItem.getItemModelMesher().register(paprica_y_seeds, 0, new ModelResourceLocation(this.MODID+":"+"paprica_y_seeds", "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(paprica_g_crop, 0, new ModelResourceLocation(this.MODID+":"+"paprica_g_crop", "inventory"));
    	    	renderItem.getItemModelMesher().register(paprica_g_seeds, 0, new ModelResourceLocation(this.MODID+":"+"paprica_g_seeds", "inventory"));
    	}
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
