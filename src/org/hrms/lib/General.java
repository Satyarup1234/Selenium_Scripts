
package org.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	public void openAppln() {
		driver =new ChromeDriver();
		driver.get(url);
		Log.info("Appln Opened");
		Reporter.log("Appln Opened");
	}
	public void login() {
		driver.findElement(By.name(login_txt)).sendKeys(un);
		driver.findElement(By.name(pwd_txt)).sendKeys(pw);
		driver.findElement(By.name(login_btn)).click();
		Log.info("Login Completed");
	}
	
	public void logout() {
		driver.findElement(By.linkText(logout_link)).click();
		Log.info("Logout Completed");
	}
	
	public void closeAplln() {
		driver.close();
		Log.info("Appln Closed");
	}
	
	public void enterFrame() {
		driver.switchTo().frame(frame_name);
		Log.info("Entered into frame");
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
		Log.info("Exited into frame");
	}
	
	public void addEmp() {
		driver.findElement(By.xpath(add_btn)).click();;
		driver.findElement(By.xpath(fname_txt)).sendKeys(fname);
		driver.findElement(By.xpath(lname_txt)).sendKeys(lname);
		driver.findElement(By.xpath(save_btn)).click();
		Log.info("New Employee Added");
	}
	
	public void editEmpname() {
		driver.findElement(By.xpath(emp_name)).click();
		driver.findElement(By.xpath(edit_btn)).click();
		driver.findElement(By.xpath(edit_emp_fname_text)).clear();
		driver.findElement(By.xpath(edit_emp_fname_text)).sendKeys(new_fname);
		driver.findElement(By.xpath(edit_emp_lname_text)).clear();
		driver.findElement(By.xpath(edit_emp_lname_text)).sendKeys(new_lname);
		driver.findElement(By.xpath(save_btn_new)).click();
		
	}
	
	public void deleteEmp() {
		driver.switchTo().frame(frame_name);
		driver.findElement(By.xpath(checkbox)).click();
		driver.findElement(By.xpath(dlt_btn)).click();
		driver.switchTo().defaultContent();
		
		
	}
	
	
}