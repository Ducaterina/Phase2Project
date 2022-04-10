package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@When("I have logged in successfully")
	public void i_have_logged_in_successfully() {
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}

	@Then("validate the prices of the products according to the table below")
	public void validate_the_prices_of_the_products_according_to_the_table_below(io.cucumber.datatable.DataTable dataTable) {
	   
		
		int rows = dataTable.height();
		for(int a=0; a<rows; a++) {
			
			String product = dataTable.cell(a,0);
			String price = dataTable.cell(a,1);
			String ActualPrice = driver.findElement(By.xpath("//div[text()='"+product+"']/following::div[@class='inventory_item_price']")).getText();
			Assert.assertEquals(price, ActualPrice);
							
		}	
		
		System.out.println("Prices of products are validated");
		
		for (int b=0; b<rows; b++) {
			String product = dataTable.cell(b,0);
			String ProductName = driver.findElement(By.xpath("//div[@id='inventory_container']//following::div[@class='inventory_item_name']["+(b+1)+"]")).getText();
			Assert.assertEquals(product, ProductName);
			
		}
		
		System.out.println("Names of products are validated");
	}
}


