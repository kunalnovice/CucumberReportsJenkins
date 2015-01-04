package com.utils;

import org.apache.log4j.Logger;

public class Loggers {
    protected Logger applog = Logger.getLogger("appLogger");
    protected Logger exceptionlog = Logger.getLogger("exceptionLogger");
   // Logger logger3 = Logger.getLogger("exceptionLogger");
    
    public static void main(String args[]) {
    	
    	String browser = System.getProperty("browser");
    	
    	Loggers t = new Loggers();
    	t.applog.debug(browser);
    	t.applog.debug("App Logger logs");
    	t.exceptionlog.debug("Process Logger logs");
    	//t.logger3.warn("its an warning");
    }
}