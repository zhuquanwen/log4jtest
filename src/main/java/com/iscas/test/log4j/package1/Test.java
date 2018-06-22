package com.iscas.test.log4j.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void test(){
        logger.debug("test debug");
        logger.info("test info");
        logger.warn("test warn");
        logger.error("test error");
    }
}
