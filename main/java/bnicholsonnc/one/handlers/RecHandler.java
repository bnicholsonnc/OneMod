package bnicholsonnc.one.handlers;

import bnicholsonnc.one.One;
import bnicholsonnc.one.init.ArmorInit;
import bnicholsonnc.one.init.BlockInit;
import bnicholsonnc.one.init.ItemInit;
import bnicholsonnc.one.init.ToolInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecHandler {

	public static void registerCrafting() {
		//diamond dust
		GameRegistry.addShapedRecipe(new ResourceLocation("diamond dust"), 
				new ResourceLocation("custom_items"), new ItemStack(
						ItemInit.diamond_dust), new Object[]{"rrr",
						"rdr","rrr",'r',Blocks.REDSTONE_BLOCK,'d',
						Blocks.DIAMOND_BLOCK});
		
		//command block
				GameRegistry.addShapedRecipe(new ResourceLocation("command_block"),
							new ResourceLocation("Blocks"), new ItemStack(
								Blocks.COMMAND_BLOCK), new Object[] { "www",
								"wdw", "www", 'w', Blocks.PLANKS, 'd',
								ItemInit.diamond_dust });
		//barrier block
				GameRegistry.addShapedRecipe(new ResourceLocation("barrier block"),
						new ResourceLocation("Blocks"), new ItemStack(
							Blocks.BARRIER, 8), new Object[] { "ggg",
							"gog", "ggg", 'g', Blocks.GLASS, 'o',
							Blocks.OBSIDIAN });
		
		//platinum sword
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum sword"), 
					new ResourceLocation("custom_tools"), new ItemStack(ToolInit.platinum_sword), 
					new Object[]{" p "," p "," s ", 's', Items.STICK,'p', ItemInit.platinum_ingot});
			
			//platinum pickaxe
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum pickaxe"), 
					new ResourceLocation("custom_tools"), new ItemStack(ToolInit.platinum_pickaxe), 
					new Object[]{"ppp"," s "," s ", 's', Items.STICK,'p', ItemInit.platinum_ingot});
			
			//platinum shovel
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum shovel"), 
					new ResourceLocation("custom_tools"), new ItemStack(ToolInit.platinum_shovel), 
					new Object[]{" p "," s "," s ", 's', Items.STICK,'p', ItemInit.platinum_ingot});
			
			//platinum axe
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum axe"), 
					new ResourceLocation("custom_tools"), new ItemStack(ToolInit.platinum_axe), 
					new Object[]{"pp ","ps "," s ", 's', Items.STICK,'p', ItemInit.platinum_ingot});
			
			//platinum hoe
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum hoe"), 
					new ResourceLocation("custom_tools"), new ItemStack(ToolInit.platinum_hoe), 
					new Object[]{"pp "," s "," s ", 's', Items.STICK,'p', ItemInit.platinum_ingot});
			
			//platinum helmet
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum helmet"), 
					new ResourceLocation("custom_tools"), new ItemStack(ArmorInit.platinum_helmet), 
					new Object[]{"ppp","p p","   ",'p', ItemInit.platinum_ingot});
			
			//platinum chestplate
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum chestplate"), 
					new ResourceLocation("custom_tools"), new ItemStack(ArmorInit.platinum_chestplate), 
					new Object[]{"p p","ppp","ppp",'p', ItemInit.platinum_ingot});
			
			//platinum leggings
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum leggings"), 
					new ResourceLocation("custom_tools"), new ItemStack(ArmorInit.platinum_leggings), 
					new Object[]{"ppp","p p","p p",'p', ItemInit.platinum_ingot});
			
			//platinum boots
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum boots"), 
					new ResourceLocation("custom_tools"), new ItemStack(ArmorInit.platinum_boots), 
					new Object[]{"   ","p p","p p",'p', ItemInit.platinum_ingot});
			
			//platinum ore
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum ore"), 
					new ResourceLocation("custom_ore"), new ItemStack(BlockInit.platinum_ore), 
					new Object[]{"sss","sis","sss",'s',Blocks.STONE,'i',ItemInit.platinum_ingot});
			
			//platinum block
			GameRegistry.addShapedRecipe(new ResourceLocation("platinum block"), 
					new ResourceLocation("custom_block"), new ItemStack(BlockInit.platinum_block), 
					new Object[]{"iii","iii","iii",'i',ItemInit.platinum_ingot});
	}
	
	public static void registerSmelting(){
			
			//platinum ingot
		GameRegistry.addSmelting(BlockInit.platinum_ore, new ItemStack(ItemInit.platinum_ingot), 10);
	}
}
