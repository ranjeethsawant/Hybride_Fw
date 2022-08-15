package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global  {

	public WebDriver driver;
	
	//*********** Objects ******************
		
		String txt_un = "txtUserName" ;
		String txt_pw = "txtPassword" ;
		String btn_login = "Submit" ;
		String link_submit = "Logout" ;
		
		String btn_add = "//input[@value='Add']" ;
		String txt_empLN = "//input[@id='txtEmpLastName']" ;
		String txt_empFN = "//input[@id='txtEmpFirstName']";
		String txt_file = "//input[@id='photofile']" ;                     // file upload
		String btn_save = "//input[@type = 'button'][@value='Save']" ;  // save
		
		//************** Data ******************
		
		String url = "http://183.82.103.245/nareshit/login.php" ;
		String un = "nareshit" ;
		String pw = "nareshit" ;
		
		String FN = "first name" ;
		String LN = "last name " ;
		String File = "C:\\Users\\HP\\Pictures\\Screenshots\\Screenshot (20).png" ;
		                                                                  // FL\\FN.extention
	}


