package com.hrms.test_Scripts;
import org.hrms.lib.*;


public class TC001_Driver_Frame {

  public static void main(String[] args)throws Exception {
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
  