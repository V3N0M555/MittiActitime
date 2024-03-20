package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement usernameTbx;
	@FindBy(name="pwd")
	private WebElement passwordTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin() {
		usernameTbx.sendKeys("admin");
		passwordTbx.sendKeys("manager");
		loginBtn.click();
	}
	

}
