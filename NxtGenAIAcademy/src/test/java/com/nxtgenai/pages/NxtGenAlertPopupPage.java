package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.nxtgenai.listeners.CustomListeners;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenAlertPopupPage extends CustomListeners{

	public WebDriver driver;

	public NxtGenAlertPopupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.alertBoxXPath) 
	@CacheLookup
	WebElement alertBox;
	
	@FindBy(xpath=ObjectRepository.confirmAlertBoxXPath) 
	@CacheLookup
	WebElement confirmAlertBox;
	
	@FindBy(xpath=ObjectRepository.promptAlertXPath) 
	@CacheLookup
	WebElement promptAlertBox;
	
	// Reusable methods	
	public void clickAlertBoxButton() {
		alertBox.click();	
		test.log(Status.PASS, "Alert Button is clicked");
		System.out.println("Alert Button is clicked");
	}	

	public void clickConfirmAlertBoxButton() {
		confirmAlertBox.click();
		test.log(Status.PASS, "Confirm Alert Button is clicked");
		System.out.println("Confirm Alert Button is clicked");
	}
	
	public void clickPromptAlertBoxButton() {
		promptAlertBox.click();
		test.log(Status.PASS, "Prompt Alert Button is clicked");
		System.out.println("Prompt Alert Button is clicked");
	}
	
	public void captureAlertMessage() {
		String alertBoxMsg = driver.switchTo().alert().getText();
		test.log(Status.PASS, "Captured Alert Message is "+ alertBoxMsg);
		System.out.println("Captured Alert Message is "+ alertBoxMsg);
	}
	
	public void setAlertMessage(String msg) {
		driver.switchTo().alert().sendKeys(msg);
		test.log(Status.PASS, "Alert Message entered is "+ msg);
		System.out.println("Alert Message entered is "+ msg);
	}
	
	public void clickOkAlertButton() {
		driver.switchTo().alert().accept();
		test.log(Status.PASS, "Ok Button is clicked");
		System.out.println("Ok Button is clicked");
	}
	
	public void clickCancelAlertButton() {
		driver.switchTo().alert().dismiss();
		test.log(Status.PASS, "Cancel Button is clicked");
		System.out.println("Cancel Button is clicked");
	}
		
}
