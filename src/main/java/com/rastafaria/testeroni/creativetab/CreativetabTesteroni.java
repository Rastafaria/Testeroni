package com.rastafaria.testeroni.creativetab;

import com.rastafaria.testeroni.init.ModItems;
import com.rastafaria.testeroni.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTesteroni {
    public static final CreativeTabs TESTERONI_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.gravityStone;
        }

        public String getTranslatedTabLabel() {
            return "Testeroni";
        }
    };
}
