package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass {//(enabled = false)
	@Test
	public void createCustomer() {
//		driver.findElement(By.linkText("TASKS")).click();
//		driver.findElement(By.xpath("//div[text()='Add New']")).click();
//		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
//		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("V3n0m");
//		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("V3n0m");
//		driver.findElement(By.className("x-btn-text")).click();
//		driver.findElement(By.linkText("Our Company")).click();
//		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		TaskListPage taskListPg = new TaskListPage(driver);
		taskListPg.getTasksTab().click();
		taskListPg.getAddNewBtn().click();
		taskListPg.getAddNewCustBtn().click();
		taskListPg.getCustNameTbx().sendKeys("V3n0m");
		taskListPg.getCustDescriptionTbx().sendKeys("V3n0m");
		taskListPg.getCustDropdown().click();
		taskListPg.getOurCompOfDropdwn().click();
		taskListPg.getSubmitCreateCusBtn().click();
		
		String actualName = driver.findElement(By.xpath("//div[@class='tasksTable hasSelectedCustomer']/div[1]/div[@class='title ellipsis']")).getText();
		String expName="V3n0m";
		Assert.assertEquals(actualName,expName );
	}
	@Test
	public void deleteCustomer() {
//		driver.findElement(By.linkText("TASKS")).click();
//		driver.findElement(By.xpath("//div[@class='customersProjectsPanel']//div[@class='cellWrapper']/input")).sendKeys("V3n0m");
//		driver.findElement(By.xpath("//div[@class='customersProjectsPanel']/div[@class='customersProjectsTreeContainer']/div/div[3]/div/div[1]/div[2]/div[2]/div[4]")).click();
//		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']/div/div[4]//div[text()='ACTIONS']")).click();
//		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']/div[4]//div[text()='Delete']")).click();
//		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		
		TaskListPage taskListPg = new TaskListPage(driver);
		taskListPg.getTasksTab().click();
		taskListPg.getSearchBarInTaskPg().sendKeys("V3n0m");
		taskListPg.getFirstSearchResult().click();
		taskListPg.getActionsBtn().click();
		taskListPg.getDeleteBtn().click();
		taskListPg.getDeleteConfirmBtn().click();
		
		
	}

}
