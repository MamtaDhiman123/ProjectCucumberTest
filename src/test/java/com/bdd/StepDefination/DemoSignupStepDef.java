package com.bdd.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bdd.Pageobject.DemoSignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSignupStepDef {

	public WebDriver driver;
	public DemoSignUpPage SignUp;

	@Given("user open the browser")
	public void user_open_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		SignUp = new DemoSignUpPage(driver);

	}

	@When("user enter url  {string}")
	public void user_enter_url(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@When("user click on Sign up")
	public void user_click_on_sign_up_link() throws InterruptedException {
		SignUp.click_on_SignUp();
		Thread.sleep(5000);

	}

	@When("user enter username as  {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String uname, String pwd) {
		SignUp.UserName(uname);
		SignUp.Password(pwd);

		
	}

	@When("user  click on Sign up")
	public void user_click_on_sign_up_button() {
		SignUp.click_on_Button2();

	}

	@Then("user is signup successfully and page title should be {string}")
	public void user_is_signup_successfully_and_page_title_should_be(String expected_title) {
		String actualtitle = driver.getTitle();

		if (actualtitle.equals(expected_title)) {

			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
