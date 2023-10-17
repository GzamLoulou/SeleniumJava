package com.QACart.todo.testcases;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.QACart.todo.factory.DriverFactory;
import com.QACart.todo.pages.LoginPage;
import com.QACart.todo.utils.PropertiesUtils;

public class TodoTest {
	
	WebDriver driver ;
	@BeforeMethod
	public void setup() {
		driver = new DriverFactory().initiallisation();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
    public void CreerNouveauTodo() throws Throwable {
	LoginPage loginPage = new LoginPage(driver);
	Properties prop = PropertiesUtils.loadProperties();
	String element = loginPage
			.getUrl()
			.login(prop.getProperty("email"), prop.getProperty("password"))
			.ajouter()
			.saisirElement(prop.getProperty("element"))
			.ajouterElement()
			.verifAjout();
	Assert.assertEquals(element, prop.getProperty("element"));
	}
	@Test
	public void SupprimerTodo() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Properties prop = PropertiesUtils.loadProperties();
		boolean supp = loginPage
				.getUrl()
				.login(prop.getProperty("email"), prop.getProperty("password"))
				.ajouter()
				.saisirElement(prop.getProperty("element"))
				.ajouterElement()
				.supprimer()
				.verifSupp();
		Assert.assertTrue(supp);
	}

}
