package com.onarandombox.multiverseinventories.util;

import java.util.logging.Logger;

public final class PrivLogger {
    public final static void warning(String msg){
        LOGGER.warning((seq++) + ": " + msg);
    }
    private static int seq = 0;
    private static final Logger LOGGER = Logger.getLogger("PrivDebug");
}