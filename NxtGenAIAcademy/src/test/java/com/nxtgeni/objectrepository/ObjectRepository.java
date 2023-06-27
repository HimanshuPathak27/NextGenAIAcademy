package com.nxtgeni.objectrepository;

/*
 * All the locators values are mentioned here
 * 
 * Naming Rule:
 * For link and partial link text locator => add Link as suffix 
 * 
 * Rest of the locators use relative xpath tricks
 * 
 * 
 */

public class ObjectRepository {	

	// Object Repository of NxtGenAI Module

	// Home Page OR
	public static final String homeLink= "Home";
	public static final String courseOfferedLink= "Course Offered";
	public static final String seleniumAutomationCurriculumLink = "Selenium Automation Curriculum";
	public static final String automationToolsCurriculumLink = "Automation Tools Curriculum";	
	public static final String demoSitesLink= "Demo Sites";
	public static final String practiceAutomationLink= "Practice Automation";
	public static final String registrationFormLink= "Registration Form";
	public static final String alertPopUpLink= "Popup";
	public static final String multipleWindowsLink= "Multiple Windows";
	public static final String webTableLink= "WebTable";
	public static final String mouseEventLink= "Mouse Event";
	public static final String progressBarLink= "Demo Site – Progress Bar";
	public static final String dynamicTransactionLink= "Dynamic Transaction";
	public static final String iFramesLink= "iFrames";	
	public static final String aboutMeLink= "About Me";
	public static final String techTalkLink= "TechTalk";
	public static final String testimonialsLink= "Testimonials";
	public static final String pythonForAutomationLink= "Automation";

	// Register Demo Page OR
	public static final String formTitleXPath = "//*[text()='Register For Demo']";
	public static final String firstNameXPath = "//input[@id='vfb-5']";
	public static final String lastNameXPath= "//input[@id='vfb-7']";
	public static final String genderMaleXPath = "//input[@value='Male']";
	public static final String genderFemaleXPath = "//input[@value='Female']";	
	public static final String genderOtherXPath = "//input[@value='Other']";
	public static final String streetAddressXPath = "//input[@id='vfb-13-address']";
	public static final String apartmentNumberXPath = "//input[@id='vfb-13-address-2']";
	public static final String cityXPath = "//input[@id='vfb-13-city']";
	public static final String stateXPath = "//input[@id='vfb-13-state']";	
	public static final String zipcodeXPath = "//input[@id='vfb-13-zip']";
	public static final String countryXPath = "//select[@id='vfb-13-country']";
	public static final String emailXPath = "//input[@id='vfb-14']";
	public static final String dateOfDemoXPath = "//input[@id='vfb-18']";
	public static final String hourXPath = "//select[@id='vfb-16-hour']";
	public static final String minuteXPath = "//select[@id='vfb-16-min']";
	public static final String mobileNumberXPath = "//input[@id='vfb-19']";
	public static final String seleniumWebDriverXPath = "//input[@value='Selenium WebDriver']";
	public static final String uftXPath = "//input[@value='UFT']";
	public static final String testNGXPath = "//input[@value='TestNG']";
	public static final String coreJavaXPath = "//input[@value='Core Java']";
	public static final String functionalTestingXPath = "//input[@value='Functional Testing']";
	public static final String othersXPath = "//input[@value='Others']";
	public static final String enterYourQueryXPath = "//textarea[@id='vfb-23']";
	public static final String verificationNumberXPath = "//input[@id='vfb-3']";
	public static final String verificationTextXPath = "//*[contains(text(),'Example:')]";	
	public static final String submitXPath = "//input[@id='vfb-4']";

	// Successful Message Page OR
	public static final String successfulMessageXPath = "//div[@class='elementor-widget-container']";

	// Alert and Popup Page OR
	public static final String alertBoxXPath = "//*[@name='alertbox']";
	public static final String confirmAlertBoxXPath = "//*[@name='confirmalertbox']";
	public static final String promptAlertXPath = "//button[normalize-space()='Prompt Alert Box']";


	// Multiple Windows Page OR	
	public static final String browserWindowXPath = "//button[contains(@name,'newbrowserwindow')]";
	public static final String browserTabXPath= "//button[contains(@name,'newbrowsertab')]";
	public static final String messageWindowXPath = "//button[contains(@name,'newmessagewindow')]";

	// MouseEvent Page OR	
	public static final String doubleClickMeXPath= "//button[@id='dblclick']";
	public static final String rightClickMeXPath = "//button[@id='rightclick']";
	public static final String alertPopupOptionXPath= "//a[normalize-space()='Alert Popup']";

}
