package com.actitime.testscript;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	
	@Test
	public void createTask() throws InterruptedException {
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
		driver.findElement(By.xpath("//div[text()='Create new tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='createTasksPopup_selectCustomerAndProject']/table/tbody//button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='x-menu-list']//a[text()='Our Company']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@id='createTasksPopup_selectCustomerAndProject']/table/tbody//button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='x-menu-list']//a[text()='proj1Venom']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td/input")).sendKeys("createacti");
		driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
		
		
		
	}

}
