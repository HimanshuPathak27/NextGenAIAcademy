package com.nxtgenai.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.nxtgenai.listeners.CustomListeners;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenRegisterDemoPage extends CustomListeners{

	WebDriver driver;	

	public NxtGenRegisterDemoPage(WebDriver driver) {
		this.driver = driver;
	}	

	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.formTitleXPath) 
	@CacheLookup
	WebElement formTitle;		

	@FindBy(xpath=ObjectRepository.firstNameXPath) 
	@CacheLookup
	WebElement firstName;

	@FindBy(xpath=ObjectRepository.lastNameXPath)
	@CacheLookup
	WebElement lastName;

	@FindBy(xpath=ObjectRepository.genderMaleXPath)
	@CacheLookup
	WebElement genderMale;	

	@FindBy(xpath=ObjectRepository.genderFemaleXPath)
	@CacheLookup
	WebElement genderFemale;	

	@FindBy(xpath=ObjectRepository.othersXPath)
	@CacheLookup
	WebElement genderOther;

	@FindBy(xpath=ObjectRepository.streetAddressXPath)
	@CacheLookup
	WebElement streetAddress;	

	@FindBy(xpath=ObjectRepository.apartmentNumberXPath)
	@CacheLookup
	WebElement apartmentNumber;	

	@FindBy(xpath=ObjectRepository.cityXPath)
	@CacheLookup
	WebElement city;		

	@FindBy(xpath=ObjectRepository.stateXPath)
	@CacheLookup
	WebElement state;	

	@FindBy(xpath=ObjectRepository.zipcodeXPath)
	@CacheLookup
	WebElement zipcode;		

	@FindBy(xpath=ObjectRepository.countryXPath)
	@CacheLookup
	WebElement country;		

	@FindBy(xpath=ObjectRepository.emailXPath)
	@CacheLookup
	WebElement emailID;	

	@FindBy(xpath=ObjectRepository.dateOfDemoXPath)
	@CacheLookup
	WebElement dateOfDemo;	

	@FindBy(xpath=ObjectRepository.hourXPath)
	@CacheLookup
	WebElement hour;	

	@FindBy(xpath=ObjectRepository.minuteXPath)
	@CacheLookup
	WebElement minute;	

	@FindBy(xpath=ObjectRepository.mobileNumberXPath)
	@CacheLookup
	WebElement mobileNumber;	

	@FindBy(xpath=ObjectRepository.seleniumWebDriverXPath)
	@CacheLookup
	WebElement seleniumWebDriver;	

	@FindBy(xpath=ObjectRepository.uftXPath)
	@CacheLookup
	WebElement uft;	

	@FindBy(xpath=ObjectRepository.testNGXPath)
	@CacheLookup
	WebElement testNG;	

	@FindBy(xpath=ObjectRepository.coreJavaXPath)
	@CacheLookup
	WebElement coreJava;	

	@FindBy(xpath=ObjectRepository.functionalTestingXPath)
	@CacheLookup
	WebElement functionalTesting;	

	@FindBy(xpath=ObjectRepository.othersXPath)
	@CacheLookup
	WebElement others;	

	@FindBy(xpath=ObjectRepository.enterYourQueryXPath)
	@CacheLookup
	WebElement enterYourQuery;	

	@FindBy(xpath =ObjectRepository.verificationTextXPath)
	@CacheLookup
	WebElement verificationText;	

	@FindBy(xpath=ObjectRepository.verificationNumberXPath)
	@CacheLookup
	WebElement verificationNumber;	

	@FindBy(xpath=ObjectRepository.submitXPath)
	@CacheLookup
	WebElement submit;		

	// Reusable methods

	public void validateFormTitle(String fTitle) {
		String actFormTitle = formTitle.getText();
		String expFormTitle = fTitle;
		if(actFormTitle.equals(expFormTitle)) 
		{
			test.log(Status.PASS,"Both the actual and expected form titles are same");
			System.out.println("Both the actual and expected form titles are same");
			test.log(Status.PASS,"The Form Title is "+ actFormTitle);
			System.out.println("The Form Title is "+ actFormTitle);
			test.log(Status.PASS,"Browser is Maximized");	
			System.out.println("Browser is Maximized");
		}
		else
		{
			test.log(Status.FAIL,"Both the actual and expected form titles are not same");
			System.out.println("Both the actual and expected form titles are not same");
			test.log(Status.FAIL,"The Actual Form Title is "+ actFormTitle);
			System.out.println("The Actual Form Title is "+ actFormTitle);
			test.log(Status.FAIL,"The Expected Form Title is "+ expFormTitle);
			System.out.println("The Expected Form Title is "+ expFormTitle);
		}
	}

	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
		test.log(Status.PASS,"First Name is " + fname);
		System.out.println("First Name is " + fname);
	}

	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
		test.log(Status.PASS,"Last Name is " + lname);
		System.out.println("Last Name is " + lname);
	}

	public void selectGenderRadioBtn(String gender) {
		if (gender.equalsIgnoreCase("Male")) {
			genderMale.click();
			test.log(Status.PASS,"Male Radio Button is Selected");
			System.out.println("Male Radio Button is Selected");
		}
		else if (gender.equalsIgnoreCase("Female")) {
			genderFemale.click();
			test.log(Status.PASS,"Female Radio Button is Selected");
			System.out.println("Female Radio Button is Selected");
		}
		else if (gender.equalsIgnoreCase("Other")) {
			genderOther.click();
			test.log(Status.PASS,"Other Radio Button is Selected");
			System.out.println("Other Radio Button is Selected");
		}
	}

	public void enterStreetAddress(String strAdd) {
		streetAddress.sendKeys(strAdd);
		test.log(Status.PASS,"Street Address is " + strAdd);
		System.out.println("Street Address is " + strAdd);
	}

	public void enterApartNum(String aptNum) {
		apartmentNumber.sendKeys(aptNum);
		test.log(Status.PASS,"Apartment Number is " + aptNum);	
		System.out.println("Apartment Number is " + aptNum);
	}

	public void enterCity(String cityVal) {
		city.sendKeys(cityVal);
		test.log(Status.PASS,"City is " + cityVal);
		System.out.println("City is " + cityVal);
	}

	public void enterState(String stateVal) {
		state.sendKeys(stateVal);
		test.log(Status.PASS,"State is " + stateVal);
		System.out.println("State is " + stateVal);
	}

	public void enterZipCode(String zipcodeVal) {
		zipcode.sendKeys(zipcodeVal);
		test.log(Status.PASS,"Postal Code is " + zipcodeVal);
		System.out.println("Postal Code is " + zipcodeVal);
	}

	public void selectCountryDropDown(String countryVal) {
		Select countryDrpDn = new Select(country);
		countryDrpDn.selectByVisibleText(countryVal);
		test.log(Status.PASS,countryVal + " is selected from Country drop down");
		System.out.println(countryVal + " is selected from Country drop down");
	}

	public void enterEmailID(String eid) {
		emailID.sendKeys(eid);
		test.log(Status.PASS,"Email is " + eid);
		System.out.println("Email is " + eid);
	}

	public void enterDateOfDemo(String dod) {
		dateOfDemo.sendKeys(dod);
		test.log(Status.PASS,"Date of Demo is " + dod);
		System.out.println("Date of Demo is " + dod);
	}

	public void selectHHDropDown(String hh) {
		Select hourDropDown = new Select (hour);
		hourDropDown.selectByVisibleText(hh);
		test.log(Status.PASS,hh + " is selected in HH Dropdown");
		System.out.println(hh + " is selected in HH Dropdown");
	}

	public void selectMMDropDown(String mm) {
		Select minuteDropDown = new Select (minute);
		minuteDropDown.selectByVisibleText(mm);
		test.log(Status.PASS,mm + " is selected in MM Dropdown");
		System.out.println(mm + " is selected in MM Dropdown");
	}

	public void enterMobileNum(String mobileNum) {
		mobileNumber.sendKeys(mobileNum);
		test.log(Status.PASS,"Mobile Number is " + mobileNum);
		System.out.println("Mobile Number is " + mobileNum);
	}

	public void selectSeleniumWebDriverChkBox(String status) {		
		if(seleniumWebDriver.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			seleniumWebDriver.click();
			test.log(Status.PASS,"Selenium WebDriver Check Box is unchecked");
			System.out.println("Selenium WebDriver Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			seleniumWebDriver.click();
			test.log(Status.PASS,"Selenium WebDriver Check Box is checked");
			System.out.println("Selenium WebDriver Check Box is checked");
		}
	}

	public void selectUFTChkBox(String status) {
		if(uft.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			uft.click();
			test.log(Status.PASS,"UFT Check Box is unchecked");
			System.out.println("UFT Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			uft.click();
			test.log(Status.PASS,"UFT Check Box is checked");
			System.out.println("UFT Check Box is checked");
		}
	}

	public void selectTestNGChkBox(String status) {
		if(testNG.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			testNG.click();
			test.log(Status.PASS,"TestNG Check Box is unchecked");
			System.out.println("TestNG Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			testNG.click();
			test.log(Status.PASS,"TestNG Check Box is checked");
			System.out.println("TestNG Check Box is checked");
		}
	}

	public void selectCoreJavaChkBox(String status) {
		if(coreJava.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			coreJava.click();
			test.log(Status.PASS,"Core Java Check Box is unchecked");
			System.out.println("Core Java Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			coreJava.click();
			test.log(Status.PASS,"Core Java Check Box is checked");
			System.out.println("Core Java Check Box is checked");
		}
	}

	public void selectFunctionalTestingChkBox(String status) {
		if(functionalTesting.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			functionalTesting.click();
			test.log(Status.PASS,"Functional Testing Check Box is unchecked");
			System.out.println("Functional Testing Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			functionalTesting.click();
			test.log(Status.PASS,"Functional Testing Check Box is checked");
			System.out.println("Functional Testing Check Box is checked");
		}
	}

	public void selectOthersChkBox(String status) {
		if(others.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			others.click();
			test.log(Status.PASS,"Others Check Box is unchecked");
			System.out.println("Others Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			others.click();
			test.log(Status.PASS,"Others Check Box is checked");
			System.out.println("Others Check Box is checked");
		}
	}

	public void enterEnterYourQuery(String query) {
		enterYourQuery.sendKeys(query);
		test.log(Status.PASS,"The Query Enter is " + query);
		System.out.println("The Query Enter is " + query);
	}

	public void enterVerificationNum() {	
		// Example 84
		String verificationVal = verificationText.getText();
		String num[]=verificationVal.split(":");    //Example: 84
		verificationNumber.sendKeys(num[1].trim());
		test.log(Status.PASS,"Enter Any Two Digits is: " + num[1].trim());
		System.out.println("Enter Any Two Digits is: " + num[1].trim());
	}

	public void clickSubmitBtn() {
		submit.click();
		test.log(Status.PASS,"Submit Button is Clicked");
		System.out.println("Submit Button is Clicked");
	}

}
