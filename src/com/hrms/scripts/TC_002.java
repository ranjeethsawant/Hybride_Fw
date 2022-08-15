package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002 {

	// public static void main(String[] args) {
	
	@Test 
	
	public void tc_002() {

		DOMConfigurator.configure("log4j.xml");
		
		General obj = new General();
		
		obj.open_App();
		obj.login_App();
		obj.logout_App();
		obj.close_App();	
	}

}
