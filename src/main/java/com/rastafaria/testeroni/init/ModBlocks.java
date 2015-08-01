package com.rastafaria.testeroni.init;

import com.rastafaria.testeroni.block.BlockDark;
import com.rastafaria.testeroni.block.BlockTesteroni;
import com.rastafaria.testeroni.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockTesteroni dark = new BlockDark();

    public static void init() {
        GameRegistry.registerBlock(dark, "dark");
    }

}
