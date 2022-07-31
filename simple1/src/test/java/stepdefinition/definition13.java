package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definition13 {
	WebDriver driver;
	@Given("I launch Rehuba Chrome browser")
	public void i_launch_rehuba_chrome_browser() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();

	}

	@When("I open Rehuba login page")
	public void i_open_rehuba_login_page() {
		driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/loginpage.html");
		String title=driver.getTitle();
		System.out.println("Current title  :"+title);
		driver.findElement(By.className("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("login")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	@Then("Rehuba login page displaying")
	public void rehuba_login_page_displaying() {
		
		driver.close();

	}



}
