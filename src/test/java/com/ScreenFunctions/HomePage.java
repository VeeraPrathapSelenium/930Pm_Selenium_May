package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class HomePage extends GenericMethods{

//********** WebElements *********************
	
	@FindBy(how=How.XPATH,using="//a[text()='Contact us']")
	public WebElement lnk_contactus;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Sign in']")
	public WebElement lnk_signin;
	
	
//*******************************************
	
	
//======================== Methods Implementation ======================
	
	/***
	 * @methodName:click_Signin()
	 * @purpose:this method is designed to click on the sigin link on the homepage
	 * @param:NA
	 * @return:boolean
	 * @author Hanshik
	 */
	public boolean click_SignIn()
	{
		boolean status=true;
		
		try
		{
			status=hoverAndClick("HomePage","Sigin",lnk_signin);	
			
					
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
		}
		return status;
		
	}
	
	
}
