package com.TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

SimpleDateFormat sdf=new SimpleDateFormat("hhmmss");

Date d=new Date();


String emailid="abc@gmail.com";

String email=emailid.split("@")[0]+"_"+sdf.format(d)+"@"+emailid.split("@")[1];

System.out.println(email);

	
		
		

	}

}
