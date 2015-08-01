package com.rastafaria.testeroni;

import com.rastafaria.testeroni.handler.ConfigurationHandler;
import com.rastafaria.testeroni.init.ModBlocks;
import com.rastafaria.testeroni.init.ModItems;
import com.rastafaria.testeroni.proxy.IProxy;
import com.rastafaria.testeroni.reference.Reference;
import com.rastafaria.testeroni.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.MOD_GUI_FACTORY_CLASS)
public class Testeroni
{
    @Mod.Instance(Reference.MOD_ID)
    public static Testeroni instance;

    @SidedProxy(clientSide = "com.rastafaria.testeroni.proxy.ClientProxy", serverSide = "com.rastafaria.testeroni.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInitialization(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void Initialization(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void PostInitialization(FMLPostInitializationEvent event) {
    }
}
