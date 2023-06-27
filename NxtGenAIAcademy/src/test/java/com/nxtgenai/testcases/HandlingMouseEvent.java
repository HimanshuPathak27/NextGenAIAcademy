package com.nxtgenai.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import com.nxtgenai.pages.NxtGenMouseEventPage;

public class HandlingMouseEvent extends TestBase{
  
	@BeforeClass
	public void validatingMouseEventNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToMouseEvent();
	}
	
	@Test(priority=1)
	public void validateDoubleClickAction(){		
		NxtGenMouseEventPage mouseEvent = PageFactory.initElements(driver, NxtGenMouseEventPage.class);
		mouseEvent.performDoubleClick();		
	}
	
	@Test(priority=2)
	public void validateAlertPopupOption(){		
		NxtGenMouseEventPage mouseEvent = PageFactory.initElements(driver, NxtGenMouseEventPage.class);
		mouseEvent.performRightClick();		
	}
}
