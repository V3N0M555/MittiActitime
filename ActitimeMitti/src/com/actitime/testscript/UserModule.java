package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class UserModule extends BaseClass {
	@Test
	public void createUser() {
	driver.findElement(By.xpath("//div[text()='USERS']")).click();
	driver.findElement(By.xpath("//div[text()='Add User']")).click();
	driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Veom1");
	driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("v1");
	driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("v1@g.com");
	driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("adm");
	driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("adm12");
	driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("adm12");
	driver.findElement(By.xpath("//span[text()='Create User']")).click();
	}
	
	@Test
	public void deleteUser() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='USERS']")).click();
		WebElement ele = driver.findElement(By.id("showDisabledUsersChBox"));
		if(!ele.isSelected()) 
			ele.click();
		driver.findElement(By.xpath("//input[contains(@class,'filterFieldInput')]")).sendKeys("v1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='userListTableContainer']/table/tbody/tr/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
	}
}
