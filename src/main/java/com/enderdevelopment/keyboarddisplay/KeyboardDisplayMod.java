package com.enderdevelopment.keyboarddisplay;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyboardDisplayMod implements ModInitializer {

    public static final String MOD_ID = "keyboard-display";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Keyboard Display mod initialized.");
    }
}
