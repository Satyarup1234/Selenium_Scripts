package com.hrms.test_Scripts;
import org.hrms.lib.*;

public class TC004_DLT_BTN {

	public static void main(String[] args)throws Exception {
		General gn=new General();
		gn.openAppln();
		Thread.sleep(2000);
		gn.login();
		Thread.sleep(2000);
		gn.enterFrame();
		gn.deleteEmp();
		Thread.sleep(2000);	
		gn.exitFrame();
		gn.logout();
		Thread.sleep(2000);
		gn.closeAplln();

	}

}
