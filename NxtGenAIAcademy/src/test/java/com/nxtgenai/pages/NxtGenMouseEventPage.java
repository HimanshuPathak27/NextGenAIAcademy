package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.nxtgenai.listeners.CustomListeners;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenMouseEventPage extends CustomListeners{

	public WebDriver driver;

	public NxtGenMouseEventPage(WebDriver driver) {
		this.driver = driver;
	}	

	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.doubleClickMeXPath)
	@CacheLookup
	WebElement doubleClickMeBtn;

	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.rightClickMeXPath)
	@CacheLookup
	WebElement rightClickMeBtn;

	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.alertPopupOptionXPath)
	@CacheLookup
	WebElement alerttPopupOption;
	
	//Reusable Methods
	public void performDoubleClick() {
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickMeBtn).perform();
		test.log(Status.PASS,"Double click action is performed");
		System.out.println("Double click action is performed");
	}

	public void performRightClick() {
		Actions action = new Actions(driver);
		action.contextClick(rightClickMeBtn).click(alerttPopupOption).perform();
		test.log(Status.PASS,"Right click action is performed and Alert Popup option is selected");
		System.out.println("Right click action is performed and Alert Popup option is selected");
	}

}
