package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//input[@name='username']") 
	WebElement username;
	@FindBy(xpath="//input[@name='password']") 
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);//all webelements initialised with driver,,this refers to current class object
	}
	public HomePage loginToApp(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
}
