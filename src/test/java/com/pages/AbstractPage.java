package com.pages;
/**
 * Kunal commented
 
//import com.opencredo.ui.acceptance.test.config.webdriver.WaitConditions;
*/
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import com.utils.Loggers;

/**
 * Reusable methods for all page objects
 */
public abstract class AbstractPage extends Loggers {
    private String path;
    private final WebDriver driver;
    //private final int waitTimeOutSeconds;

    public AbstractPage( WebDriver driver) {
       
        this.driver = driver;
       
    }

    public void deleteAllCookies() {
        getDriver().manage().deleteAllCookies();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void goTo() {
        getDriver().navigate().to(path);
    }

    public String getPath() {
        return path;
    }

    /**
     * Go to page and wait until url reflects
     * expected page (or timeout reached)
     */
    
    
    
    /**  
     * Kunal commented to be enabled later
     *  
     *  
     *  public void goToAndWait() {
        goTo();
        ensure_is_current();
    }

 
    public void ensure_is_current() {
        wait_until_true_or_timeout(WaitConditions.urlContains(path));
    }

    public boolean is_text_present(String text) {
        wait_until_true_or_timeout(WaitConditions.pageContainsText(text));
        return true;
    }
*/
    /**
     * wait until condition is true or timeout kicks in
     */
  /*  protected <V> V wait_until_true_or_timeout(ExpectedCondition<V> isTrue) {
        Wait<WebDriver> wait = new WebDriverWait(this.driver, waitTimeOutSeconds)
                .ignoring(StaleElementReferenceException.class);
        try {
            return wait.until(isTrue);
        } catch (TimeoutException rte) {
            throw new TimeoutException(rte.getMessage() + "\n\nPageSource:\n\n" + getDriver().getPageSource());
        }
    }
*/
    public void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void submit(WebElement element) {
        element.click();
    }
/*
    public void selectDropdownByText(WebElement element, String visibleText){
        Select filterSelect = new Select(element);
        waitForDropdownItems(element);
        filterSelect.selectByVisibleText(visibleText);
    }

    private void waitForDropdownItems(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(),waitTimeOutSeconds );
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement find(By locator) {
        try {
            return getDriver().findElement(locator);
        } catch (NoSuchElementException ex) {
            throw new NoSuchElementException(ex.getMessage() + "\n\nPageSource:\n\n" + getDriver().getPageSource());
        }
    }
*/
public String getTime() {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	System.out.println(dateFormat.format(cal.getTime()));
   return (dateFormat.format(cal.getTime()));
}
}