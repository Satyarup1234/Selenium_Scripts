package org.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;

	//Test Data
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	
	public String fname="Satya";
	public String lname="Rup";
	public String new_fname="sai";
	public String new_lname="satya";
	
	
	//Objects
	public String login_txt="txtUserName";
	public String pwd_txt="txtPassword";
	public String login_btn="Submit";
	public String logout_link="Logout";
	public String frame_name="rightMenu";
	public String add_btn="/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String fname_txt="/html/body/form/div/div[1]/div[2]/input[3]";
	public String lname_txt="/html/body/form/div/div[1]/div[2]/input[2]";
	public String save_btn="/html/body/form/div/div[1]/div[2]/div[2]/input[1]";
	public String save_btn_new="/html/body/form/div[2]/div[1]/div[2]/div[2]/input[1]";
	public String emp_name="/html/body/div/div[2]/form/table/tbody/tr[2]/td[3]/a";
	public String edit_emp_fname_text="/html/body/form/div[2]/div[1]/div[2]/input[4]";
	public String edit_emp_lname_text="/html/body/form/div[2]/div[1]/div[2]/input[3]";
	public String checkbox="/html/body/div/div[2]/form/table/tbody/tr[1]/td[1]/input";
	public String dlt_btn="/html/body/div/div[2]/form/div[3]/div[1]/input[2]";
	
	
	
	
	
	
	
	
	
	
	
	
	public String edit_btn="/html/body/form/div[2]/div[1]/div[2]/div[2]/input[1]";
}