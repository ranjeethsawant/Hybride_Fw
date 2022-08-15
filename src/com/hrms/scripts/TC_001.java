package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	
	@Test 
	
	public void tc_001() {
	
	//public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		
		General obj = new General();
		
		obj.open_App();
		obj.close_App();
	}

}
