package com.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.GenericMethods.GenericMethods;
import com.Reporting.ExtentReports_Reporting;
import com.ScreenFunctions.AuthenticationPage;
import com.ScreenFunctions.HomePage;
import com.TestNGAnnotations.Annotations;

public class Tc_01_ValidateSigin2 extends Annotations{

	
	@Test
	
	public void Tc_01_ValidateSigin()
	{
		boolean status=true;
		
		GenericMethods gm=new GenericMethods();
		
		status=gm.launchBrowser("chrome");
		
		// check the browser status and click on the sign in link
		if(status)
		{
			
			HomePage homepage=PageFactory.initElements(driver, HomePage.class);
			
			status=homepage.click_SignIn();
			
			//check the status of the sigin link and proceed further
			
			if(status)
			{
				AuthenticationPage ap=PageFactory.initElements(driver, AuthenticationPage.class);
				
				ap.verify_AuthenticationHeader();
			}
		}
		
		
		
	}
	
	
}
