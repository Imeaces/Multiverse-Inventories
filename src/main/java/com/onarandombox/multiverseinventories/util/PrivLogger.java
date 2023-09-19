package com.onarandombox.multiverseinventories.util;

import java.util.logging.Logger;

public final class PrivLogger {
    public final static void warning(String msg){
        LOGGER.warning(msg);
    }
    private static final Logger LOGGER = Logger.getLogger("PrivDebug");
}