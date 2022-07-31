package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definition12 {
	WebDriver driver;
	@Given("i launch Rehuba  Chrome browser")
	public void i_launch_rehuba_chrome_browser() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		 driver=new ChromeDriver();
		 driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/bookingusha.html");
	    System.out.println("I am usha");
	}

	@When("i open Rehuba home page")
	public void i_open_rehuba_home_page() {
		Select dp1=new Select(driver.findElement(By.id("input-group")));
		dp1.selectByIndex(2);
		Select dp2=new Select(driver.findElement(By.id("input-group1")));
		dp2.selectByIndex(3);
		Select dp3=new Select(driver.findElement(By.id("input-group2")));
		dp3.selectByIndex(2);
		Select dp4=new Select(driver.findElement(By.id("input-group3")));
		dp4.selectByIndex(3);
		Select dp5=new Select(driver.findElement(By.id("adult")));
		dp5.selectByIndex(10);
		WebElement radioBoxSelect=driver.findElement(By.id("radio1"));
		Boolean isSelect=radioBoxSelect.isSelected();
		if (isSelect==false)
		{
			radioBoxSelect.click();
		}
		
		String cellvalue=driver.findElement(By.id("Arrival")).getText();
		WebElement arrival=driver.findElement(By.xpath("//input[@id=\"Arrival\"]"));
		arrival.sendKeys("12022022");
		WebElement departure=driver.findElement(By.xpath("//input[@id=\"Departure\"]"));
		departure.sendKeys("27022022");
		WebElement dob1=driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dob1.sendKeys("19091999");
		
		driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		driver.findElement(By.className("phone")).sendKeys("9160201736");
		driver.findElement(By.className("email")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("sub")).click();
		 System.out.println("Hi Usha");
	    
	}

	@Then("rehuba home page is displayed")
	public void rehuba_home_page_is_displayed() {
		 System.out.println("How are you?");
	    
	}

}
