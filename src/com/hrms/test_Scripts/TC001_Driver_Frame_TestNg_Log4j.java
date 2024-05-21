package com.hrms.test_Scripts;
import org.hrms.lib.*;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC001_Driver_Frame_TestNg_Log4j {

  @Test
  
     public void tc001_login_logout()throws Exception {
	  DOMConfigurator.configure("log4j.xml");
  
		General gn=new General();
		gn.openAppln();
		Thread.sleep(2000);
		gn.login();
		Thread.sleep(2000);
		gn.logout();
		Thread.sleep(2000);
		gn.closeAplln();
		
  }

	

}
