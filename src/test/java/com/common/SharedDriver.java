package com.common;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



import java.util.concurrent.TimeUnit;


/**
 * Based on shared webdriver implementation in cucumber-jvm examples
 * A new instance of SharedDriver is created for each Scenario and passed to  Stepdef classes via Dependency Injection
 */
public class SharedDriver extends EventFiringWebDriver {
    private static final WebDriver REAL_DRIVER;
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            REAL_DRIVER.quit();
        }
    };

    static {
    	System.setProperty("webdriver.chrome.driver", "C:/KM/dOWNLOADS_new/ChromeDriver/chromedriver.exe");
        REAL_DRIVER = new ChromeDriver();
        REAL_DRIVER.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    } 
   /* static {
    	 String browser = System.getProperty("browser");
    	 System.out.println("Browser value is "+ browser);
    	
 			switch (browser) {
 			
 			case "ie":
 				REAL_DRIVER = new InternetExplorerDriver();
 				break;
 			case "Firefox":
 				REAL_DRIVER = new FirefoxDriver();
 				break;
 			case "Chrome":
 				 System.setProperty("webdriver.chrome.driver", "C:/KM/dOWNLOADS_new/ChromeDriver/chromedriver.exe");
 				REAL_DRIVER = new ChromeDriver();
 				break;
 			default:
 				System.out.println("in default");
 				REAL_DRIVER = new FirefoxDriver();
 				break;
 			}
 			REAL_DRIVER.manage().timeouts()
 					.implicitlyWait(100, TimeUnit.SECONDS);
 			REAL_DRIVER.manage().window().maximize();
 			System.out
 					.println("deleting cookies for passing it to next scenario");
 			Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }
    */
   
    public SharedDriver() {
        super(REAL_DRIVER);
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException("You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
        }
        super.close();
    }

    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void deleteAllCookies() {
        manage().deleteAllCookies();
    }

    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
        scenario.write("Current Page URL is " + getCurrentUrl());
        try {
            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

}
