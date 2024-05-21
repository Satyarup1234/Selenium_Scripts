package com.hrms.test_Scripts;
import org.hrms.lib.*;
import org.testng.annotations.Test;

public class TC001_Driver_Frame_TestNg {

  @Test
  
     public void tc001_login_logout()throws Exception {
  
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