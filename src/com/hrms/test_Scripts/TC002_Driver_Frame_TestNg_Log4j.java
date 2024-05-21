package com.hrms.test_Scripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.hrms.lib.*;
import org.testng.annotations.Test;

public class TC002_Driver_Frame_TestNg_Log4j {

	@Test

	public void addEmp()throws Exception {
		 DOMConfigurator.configure("log4j.xml");
		General gn=new General();
		gn.openAppln();
		Thread.sleep(2000);
		gn.login();
		Thread.sleep(2000);
		gn.enterFrame();
		gn.addEmp();
		Thread.sleep(2000);
		gn.exitFrame();
		gn.logout();
		Thread.sleep(2000);
		gn.closeAplln();

	}

}