package com.rastafaria.testeroni.init;

import com.rastafaria.testeroni.item.ItemGravityStone;
import com.rastafaria.testeroni.item.ItemTesteroni;
import com.rastafaria.testeroni.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemTesteroni gravityStone = new ItemGravityStone();

    public static void init() {
        GameRegistry.registerItem(gravityStone, "gravityStone");
    }

}
