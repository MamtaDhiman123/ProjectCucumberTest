package com.bdd.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSignUpPage {
	WebDriver ldriver;

	public DemoSignUpPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "signin2")
	WebElement SignUp_link1;

	@FindBy(id = "sign-username")
	WebElement username;

	@FindBy(id = "sign-password")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign up']")
	WebElement SignUp_button;

	public void click_on_SignUp() {

		SignUp_link1.click();
	}

	public void UserName(String uname) {
		username.sendKeys(uname);
	}

	public void Password(String pwd) {
		password.sendKeys(pwd);
	}

	public void click_on_Button2() {
		SignUp_button.click();
	}

}
