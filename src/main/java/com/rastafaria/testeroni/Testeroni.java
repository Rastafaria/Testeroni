package com.rastafaria.testeroni;

import com.rastafaria.testeroni.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "testeroni", name = "Testeroni", version = "1.7.10-1.0")
public class Testeroni
{
    @Mod.Instance("Testeroni")
    public static Testeroni instance;

    @SidedProxy(clientSide = "com.rastafaria.testeroni.proxy.ClientProxy", serverSide = "com.rastafaria.testeroni.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInitialization(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void Initialization(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void PostInitialization(FMLPostInitializationEvent event) {

    }
}
