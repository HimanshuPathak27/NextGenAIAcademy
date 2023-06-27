package com.nxtgenai.testcases;

import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import org.openqa.selenium.support.PageFactory;

public class ScreenNavigation extends TestBase{

	@Test(priority=1)
	public void validatingHomePageNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToHomePage();
	}

	@Test(priority=2)
	public void validatingSeleniumAutomationCurriculumNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToSeleniumAutomationCurriculum();
	}

	@Test(priority=3)
	public void validatingAutomationToolsCurriculumNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToAutomationToolsCurriculum();
	}

	@Test(priority=4)
	public void validatingRegistrationFormNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToRegistrationForm();
	}

	@Test(priority=5)
	public void validatingAlertPopUpNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToAlertPopUp();
	}

	@Test(priority=6)
	public void validatingMultipleWindowsNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToMultipleWindows();
	}

	@Test(priority=7)
	public void validatingWebTableNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToWebTable();
	}
	
	@Test(priority=8)
	public void validatingMouseEventNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToMouseEvent();
	}
	
	@Test(priority=9)
	public void validatingProgressBarNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToProgressBar();
	}
	
	@Test(priority=10)
	public void validatingDynamicTransactionNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToDynamicTransaction();
	}
	
	@Test(priority=11)
	public void validatingFramesNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToFrames();
	}

	@Test(priority=12)
	public void validatingTechTalkNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToTechTalk();
	}

	@Test(priority=13)
	public void validatingTestimonialsNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToTestimonials();
	}

	@Test(priority=14)
	public void validatingPythonForAutomationNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToPythonForAutomation();
	}

}

