package com.QACart.todo.pages;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.QACart.todo.base.BasePage;
import com.QACart.todo.utils.PropertiesUtils;

public class LoginPage extends BasePage{

Properties prop = new Properties();

public LoginPage(WebDriver driver) {
		super(driver);
		
	}
@FindBy (id="email")
WebElement email;
@FindBy (id="password")
WebElement password;
@FindBy (id="submit")
WebElement submit;



public TodoPage login(String mail,String pass) {
	email.sendKeys(mail);
	password.sendKeys(pass);
	submit.click();
return new TodoPage(driver);
}
public LoginPage getUrl() throws Throwable {
	Properties prop = PropertiesUtils.loadProperties();
	driver.get(prop.getProperty("url"));
return this;}
}
