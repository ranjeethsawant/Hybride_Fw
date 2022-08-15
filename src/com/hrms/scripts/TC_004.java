package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_004 {

@Test
	
	public void tc_004() {
	
	DOMConfigurator.configure("log4j.xml");
	
	General obj = new General();
		
	obj.open_App();
	obj.login_App();
	obj.enter_frame();
	obj.add_emp();
	obj.exit_frame();
	obj.logout_App();
	obj.close_App();
}
}