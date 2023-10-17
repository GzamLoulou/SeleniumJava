package com.QACart.todo.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.QACart.todo.factory.DriverFactory;
import com.QACart.todo.pages.LoginPage;
@Test
public class LoginTest{
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new DriverFactory().initiallisation();
	}
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	public void connecterAvecEmailEtMotdepasse() throws Throwable {

	LoginPage loginPage = new LoginPage(driver);
	boolean  welcome = loginPage
			.getUrl()
			.login("gzam@gmail.com", "21572558")
			.welcomeDisp();
	Assert.assertTrue(welcome);
	}

}
