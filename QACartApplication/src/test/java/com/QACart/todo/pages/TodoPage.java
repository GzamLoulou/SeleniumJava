package com.QACart.todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.QACart.todo.base.BasePage;

public class TodoPage extends BasePage{

	public TodoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//h2[@data-testid='welcome']")
	WebElement welcome;
	@FindBy (xpath="//button[@aria-label='delete']")
	WebElement buttonPlus;
	@FindBy (xpath="//*[@data-testid='todo-text']")
	WebElement verifAjout;
	@FindBy (xpath="//*[@data-testid='delete']")
	WebElement suppElt;
	@FindBy (xpath="//*[@data-testid='no-todos']")
	WebElement verifSupp;
	public boolean welcomeDisp() {
		return welcome.isDisplayed();
	}
	public TodoNewPage ajouter() {
		buttonPlus.click();
		return new TodoNewPage(driver);
	}
	public String verifAjout() {
		return verifAjout.getText();
	}
	public TodoPage supprimer() {
		suppElt.click();
	return this ;
	}
	public boolean verifSupp() {
		return verifSupp.isDisplayed();
	}
}
