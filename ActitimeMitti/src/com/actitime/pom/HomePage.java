package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="TASKS")
	private WebElement tasksTab;
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement usersTab;
	@FindBy(linkText="Logout")
	private WebElement logoutBtn;
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getTasksTab() {
		return tasksTab;
	}
	public WebElement getUsersTab() {
		return usersTab;
	}
	public void clickLogout() {
		logoutBtn.click();
	}
	
}
