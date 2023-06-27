package com.nxtgenai.testcases;

import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import com.nxtgenai.pages.NxtGenRegisterDemoPage;
import com.nxtgenai.pages.NxtGenSuccessfulMessagePage;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;


public class RegisterDemo extends TestBase{

	@Test(dataProviderClass = com.nxtgenai.utilities.TestUtil.class,dataProvider = "registerDemo")
	public void registerUser(Hashtable<String,String> data) throws InterruptedException{
		
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToRegistrationForm();
		
		NxtGenRegisterDemoPage registerUser = PageFactory.initElements(driver, NxtGenRegisterDemoPage.class);
		
		registerUser.validateFormTitle(data.get("TitleValidation"));
		registerUser.enterFirstName(data.get("FirstName"));
		registerUser.enterLastName(data.get("LastName"));
		registerUser.selectGenderRadioBtn(data.get("Gender"));
		registerUser.enterStreetAddress(data.get("StreetAddress"));
		registerUser.enterApartNum(data.get("ApartmentNumber"));
		registerUser.enterCity(data.get("City"));
		registerUser.enterState(data.get("State"));
		registerUser.enterZipCode(data.get("PinCode"));
		registerUser.selectCountryDropDown(data.get("Country"));
		registerUser.enterEmailID(data.get("EmailID"));
		registerUser.enterDateOfDemo(data.get("DemoDate"));
		registerUser.selectHHDropDown(data.get("HH"));
		registerUser.selectMMDropDown(data.get("MM"));
		registerUser.enterMobileNum(data.get("MobileNumber"));		
		registerUser.selectSeleniumWebDriverChkBox(data.get("SeleniumWebDriver"));
		registerUser.selectUFTChkBox(data.get("UFT"));		
		registerUser.selectTestNGChkBox(data.get("TestNG"));
		registerUser.selectCoreJavaChkBox(data.get("CoreJava"));
		registerUser.selectFunctionalTestingChkBox(data.get("FunctionalTesting"));
		registerUser.selectOthersChkBox(data.get("Others"));		
		registerUser.enterEnterYourQuery(data.get("Query"));
		registerUser.enterVerificationNum();
		registerUser.clickSubmitBtn();		
		
		NxtGenSuccessfulMessagePage successfulMsg = PageFactory.initElements(driver, NxtGenSuccessfulMessagePage.class);
		successfulMsg.validateSuccessfulMessage(data.get("Expected Successful Message"));
	}

}

