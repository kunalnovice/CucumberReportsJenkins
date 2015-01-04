package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_Page extends AbstractPage {
	private static WebElement element = null;

	private  WebDriver driver;

	public Home_Page(WebDriver webDriver) {
		super(webDriver);
	}
    public final String createtransaction_id ="";
    
	@FindBy(id = createtransaction_id)
	public WebElement CreateTransaction;

	public void pressCreateTransaction() {
		CreateTransaction.click();

	}

	
}
