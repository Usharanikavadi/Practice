package Browsers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	public static String browser="edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/loginpage.html");
		driver.findElement(By.className("username")).sendKeys("Usharani");
		driver.findElement(By.id("password")).sendKeys("Kavadi1234");
		driver.findElement(By.id("login")).click();
		Alert alert=driver.switchTo().alert();
  		alert.accept();
  		//driver.close();
	}

}
