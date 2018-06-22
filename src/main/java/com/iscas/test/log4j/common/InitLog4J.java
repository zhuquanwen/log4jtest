package com.iscas.test.log4j.common;

import org.apache.log4j.PropertyConfigurator;

/**
 * @Author: zhuquanwen
 * @Description:
 * @Date: 2018/6/22 16:35
 * @Modified:
 **/
public class InitLog4J {
    public static void init(){
        PropertyConfigurator.configure("log4j.properties");
    }
}
