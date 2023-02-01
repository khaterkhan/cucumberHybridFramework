package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;

public class Login {
	WebDriver driver;


	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
		DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();

	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String emailText) {
		driver.findElement(By.id("input-email")).sendKeys("khater.khan1982@gmail.com");
		
	 
	}

	@And("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String passwordText) {
		driver.findElement(By.id("input-password")).sendKeys("Ahmad2013!");
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("User should get Successfully logged in")
	public void user_should_get_successfully_logged_in() {
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("User enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidemailText) {
		driver.findElement(By.id("input-email")).sendKeys("iurwekds@gmail.com");
	}

	@And("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidpasswordText) {
		driver.findElement(By.id("input-password")).sendKeys("reeafsklfjk3!");

	}


	@Then("User should get Proper warning message about credential mismatch")
	public void user_should_get_a_proper_warning_message_about_credential_mismatch() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		
	
	}

	
	@When("User dont enters email address into email field")
	public void user_dont_enters_email_address_into_email_field() {
		driver.findElement(By.id("input-email")).sendKeys("");

	}

	@And("User dont enters password into password field")
	public void user_dont_enters_password_into_password_field() {
		driver.findElement(By.id("input-password")).sendKeys("");
		

}	}