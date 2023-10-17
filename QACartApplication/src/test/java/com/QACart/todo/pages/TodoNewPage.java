package com.QACart.todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.QACart.todo.base.BasePage;

public class TodoNewPage extends BasePage {
	public TodoNewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath="//*[@data-testid='new-todo']")
	WebElement SaisiElement;
	@FindBy (xpath="//*[@data-testid='submit-newTask']")
	WebElement ajoutElement;
	
	public TodoNewPage saisirElement(String Elt) {
		SaisiElement.sendKeys(Elt);
		return this;
	}
	
	public TodoPage ajouterElement() {
		ajoutElement.click();
		return new TodoPage(driver);
	}
	
}
