package com.rastafaria.testeroni.init;

import com.rastafaria.testeroni.item.ItemGravityStone;
import com.rastafaria.testeroni.item.ItemTesteroni;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemTesteroni gravityStone = new ItemGravityStone();

    public static void init() {
        GameRegistry.registerItem(gravityStone, "gravityStone");
    }

}
