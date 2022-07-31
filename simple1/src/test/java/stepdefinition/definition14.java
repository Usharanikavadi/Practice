package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definition14 {
	WebDriver driver;
	@Given("I launch Rehuba Register Chrome browser")
	public void i_launch_rehuba_register_chrome_browser() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();

	}

	@When("I open Rehuba Register page")
	public void i_open_rehuba_register_page() {
		driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("9160201736");
		driver.findElement(By.id("email")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		driver.findElement(By.id("username")).sendKeys("Usharani12");
		driver.findElement(By.id("password")).sendKeys("Usha12345");
		driver.findElement(By.id("confirm-password")).sendKeys("Usha12345");
		WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();
		//driver.switchTo().alert();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	@Then("Rehuba Register page displaying")
	public void rehuba_register_page_displaying() {
	   
	}
	
	


}
