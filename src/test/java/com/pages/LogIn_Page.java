package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page extends AbstractPage {
	// private static WebElement element = null;

	private WebDriver driver;

	public LogIn_Page(WebDriver webDriver) {
		super(webDriver);

	}

	/*
	 * WebDriver driver;
	 * 
	 * public LogIn_Page(WebDriver driver) { this.driver = driver }
	 */
	@FindBy(id = "emailAddressInput")
	public WebElement userName;

	@FindBy(id = "passwordInput")
	public WebElement passwordInput;

	@FindBy(id = "loginButton")
	public WebElement loginButton;

	public void type_UserName(String user_name) {
		userName.sendKeys(user_name);
	}

	public void type_Password(String password) {
		passwordInput.sendKeys(password);
	}

	public void press_btn_LogIn() {
		loginButton.click();
	}

	public Home_Page LoginIn_with_default_user(String user_name, String password) {
		// applog.debug(" LoginIn_with_default_user");
		// driver.findElement(By.id("emailAddressInput")).sendKeys(user_name);

		type_UserName(user_name);
		type_Password(password);
		press_btn_LogIn();
		return PageFactory.initElements(driver, Home_Page.class);
	}
}
