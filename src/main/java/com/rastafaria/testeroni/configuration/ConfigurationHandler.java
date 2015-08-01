package com.rastafaria.testeroni.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try {
            //load .cfg as a Configuration object
            configuration.load();

            //read Configuration for properties
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "en exemplar").getBoolean(true);
        } catch(Exception e) {
            //Log exceptions
        } finally {
            //Save the configuration
            configuration.save();
        }

        //System.out.println("Config Test: " + configValue);
    }
}
