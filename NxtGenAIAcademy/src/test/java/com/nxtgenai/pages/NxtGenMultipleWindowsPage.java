package com.nxtgenai.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.nxtgenai.listeners.CustomListeners;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenMultipleWindowsPage extends CustomListeners{
	
	public WebDriver driver;

	public NxtGenMultipleWindowsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.browserWindowXPath) 
	@CacheLookup
	WebElement browserWindow;
	
	@FindBy(xpath=ObjectRepository.messageWindowXPath) 
	@CacheLookup
	WebElement messageWindow;
	
	@FindBy(xpath=ObjectRepository.browserTabXPath) 
	@CacheLookup
	WebElement browserTab;
	
	public void clickNewBrowserWindowBtn() {
		browserWindow.click();
		test.log(Status.PASS,"New Browser Window Button is clicked");
		System.out.println("New Browser Window Button is clicked");
	}
	
	public void clickNewMessageWindowBtn() {
		messageWindow.click();
		test.log(Status.PASS,"New Message Window Button is clicked");
		System.out.println("New Message Window Button is clicked");
	}
	
	public void clickNewBrowserTabBtn() {
		browserTab.click();
		test.log(Status.PASS,"New Browser Tab Button is clicked");	
		System.out.println("New Browser Tab Button is clicked");
	}	

}
