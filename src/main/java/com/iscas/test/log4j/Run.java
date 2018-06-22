package com.iscas.test.log4j;

import com.iscas.test.log4j.common.InitLog4J;
import com.iscas.test.log4j.package1.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/22 16:26
 * @Modified:
 **/
public class Run {
    private static Logger logger = LoggerFactory.getLogger(Run.class);
    private static Logger logger1 = LoggerFactory.getLogger("A");
    private static Logger logger2 = LoggerFactory.getLogger("errorlog");
    public static void main(String[] args) {
        InitLog4J.init();
        logger.info("debug");
        logger1.info("info");
        logger1.error("error");
        logger1.warn("warn");
        try{
            throw new Exception("222");
        }catch (Exception e){
            logger2.error("出错了",e);
//            e.printStackTrace();
        }

        Test.test();
    }
}
