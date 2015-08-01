package com.rastafaria.testeroni.block;

import com.rastafaria.testeroni.creativetab.CreativeTabTesteroni;

import java.util.Random;

public class BlockDark extends BlockTesteroni {

    public BlockDark() {
        super();
        this.setBlockName("dark");
        this.setBlockTextureName("dark");
        Random rng = new Random();
        float lightLevel = 15 * rng.nextFloat();
        this.setLightLevel(lightLevel);
        this.setBlockUnbreakable();
    }

}
