package com.ScreenFunctions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class AuthenticationPage extends GenericMethods {
	
	public String email;

	//********** WebElements *********************
	
		@FindBy(how=How.XPATH,using="//h1[text()='Authentication']")
		public WebElement txt_Authentication_header;
		
		@FindBy(how=How.XPATH,using="//input[@id='email_create']")
		public WebElement edi_emailID_newUser;
		
		
		@FindBy(how=How.XPATH,using="//button[@id='SubmitCreate']")
		public WebElement btn_CreateAccount;
		
		
		@FindBy(how=How.XPATH,using="//button[@id='SubmitCreate']")
		public WebElement rdo_Gender_male;
		
		
	//*******************************************
		
		
	//======================== Methods Implementation ======================
		
		/***
		 * @methodName:verify_AuthenticationHeader
		 * @purpose:this method is designed to click on the sigin link on the homepage
		 * @param:NA
		 * @return:boolean
		 * @author Hanshik
		 */
		
		public boolean verify_AuthenticationHeader()
		{
			boolean status =true;
			
			try
			{
				status=verify_ElementExist("Authentication"," Authentication_Section Header",txt_Authentication_header);
			}catch(Exception e)
			{
				status=false;
			}
			return status;
		}
		/***
		 * @methodName:newUser_EnterEmailId
		 * @purpose:this method is designed to register new user
		 * @param:NA
		 * @return:boolean
		 * @author Hanshik
		 */	
	public boolean newUser_EnterEmailId()
	{
		boolean status=true;
		try
		{
			// create unique email id
			SimpleDateFormat sdf=new SimpleDateFormat("hhmmss");

			Date d=new Date();


			String emailid="abc@gmail.com";

			email=emailid.split("@")[0]+"_"+sdf.format(d)+"@"+emailid.split("@")[1];
			
			status=clickAndSendData("Email id","Authentication",edi_emailID_newUser, email);
			
			//check the status of email id data entry and click on the register button
			
			if(status)
			{
				status=hoverAndClick("Authentication", "CreateAccount", btn_CreateAccount);
			}
			
		}catch(Exception e)
		{
			status=false;
			
		}
		return status;
				
	}
	
	/***
	 * @methodName:fill_UserDetails
	 * @purpose:this method is designed to register new user
	 * @param:NA
	 * @return:boolean
	 * @author Hanshik
	 */	
public boolean fill_UserDetails()
{
	boolean status=true;
	try
	{
		
		status=clickAndSendData("Email id","Authentication",edi_emailID_newUser, email);
		
		//check the status of email id data entry and click on the register button
		
		if(status)
		{
			status=hoverAndClick("Authentication", "CreateAccount", btn_CreateAccount);
		}
		
	}catch(Exception e)
	{
		status=false;
		
	}
	return status;
			
}
	
	
	
	
		
}
