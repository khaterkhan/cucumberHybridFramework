package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;

public class Search {
	WebDriver driver;
	@Given("User opens the Application")
	public void user_opens_the_application() {
		
		driver=DriverFactory.getDriver();
	 
	}

	@When("User enters valid products {string} into Search box field")
	public void user_enters_valid_products_into_search_box_field(String validProductText) {
		driver.findElement(By.name("Search")).sendKeys(validProductText);
	
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();
		
	 
	}

	@Then("User Should get valid product display in search result")
	public void user_should_get_valid_product_display_in_search_result() {
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());

	}

	@When("User enters invalid products {string} into Search box field")
	public void user_enters_invalid_products_into_search_box_field(String invalidProductText) {
		driver.findElement(By.name("Search")).sendKeys(invalidProductText);
	}

	@Then("User Should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
		Assert.assertEquals("There is no product that matches the search criteria.", 
		driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText());
		

	}

	@When("User dont  enters any products name into Search box field")
	public void user_dont_enters_any_products_name_into_search_box_field() {
		//intentionally left blank
	
	}



}
