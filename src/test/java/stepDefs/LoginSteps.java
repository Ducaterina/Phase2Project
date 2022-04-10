package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened SWAGLABS application in browser")
	public void i_have_opened_swaglabs_application_in_browser() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameVal);
	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	}

	@When("I click on the Login Button")
	public void i_click_on_the_login_button() {
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}

	@Then("I should be landed on the products page")
	public void i_should_be_landed_on_the_products_page() {
		System.out.println("Inside the product page");
	}
	
	@Then("I should be getting {string}")
	public void i_should_be_getting(String ExpMsg) {
		WebElement ErrorMsg = driver.findElement(By.xpath("//div[@class = 'error-message-container error']"));
		String ActualMsg = ErrorMsg.getText();
		
		Assert.assertEquals(ActualMsg, ExpMsg);
	}
}