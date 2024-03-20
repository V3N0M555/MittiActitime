package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() {
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		driver.findElement(By.id("projectPopup_projectNameField")).click();
		driver.findElement(By.className("x-btn-text")).click();
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("projVenom");
		driver.findElement(By.linkText("Our Company")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		
	}
	
}