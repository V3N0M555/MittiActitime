package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(linkText="TASKS")
	private WebElement tasksTab;
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addNewCustBtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameTbx;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement custDescriptionTbx;
	@FindBy(className = "x-btn-text")
	private WebElement custDropdown;
	@FindBy(linkText = "Our Company")
	private WebElement ourCompOfDropdwn;
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement submitCreateCusBtn;
	
	@FindBy(xpath="//div[@class='customersProjectsPanel']//div[@class='cellWrapper']/input")
	private WebElement searchBarInTaskPg;
	@FindBy(xpath="//div[@class='customersProjectsPanel']/div[@class='customersProjectsTreeContainer']/div/div[3]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement firstSearchResult;
	@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']/div/div[4]//div[text()='ACTIONS']")
	private WebElement actionsBtn;
	@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']/div[4]//div[text()='Delete']")
	private WebElement deleteBtn;
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement deleteConfirmBtn;
	
	public  TaskListPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getTasksTab() {
		return tasksTab;
    }
	public WebElement getAddNewBtn() {
		return addNewBtn;
    }
	public WebElement getAddNewCustBtn() {
		return addNewCustBtn;
    }
	public WebElement getCustNameTbx() {
		return custNameTbx;
    }
	public WebElement getCustDescriptionTbx() {
		return custDescriptionTbx;
    }
	public WebElement getCustDropdown() {
		return custDropdown;
    }
	public WebElement getOurCompOfDropdwn() {
		return ourCompOfDropdwn;
    }
		public WebElement getSubmitCreateCusBtn() {
		return submitCreateCusBtn;
    }
		
	public WebElement getSearchBarInTaskPg() {
		return searchBarInTaskPg;
    }
	public WebElement getFirstSearchResult() {
		return firstSearchResult;
    }
	public WebElement getActionsBtn() {
		return actionsBtn;
    }
	public WebElement getDeleteBtn() {
		return deleteBtn;
    }
	public WebElement getDeleteConfirmBtn() {
		return deleteConfirmBtn;
    }
	
	
	
}
