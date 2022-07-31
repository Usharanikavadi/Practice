package practice1;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayPage1 {
	public static String browser="edge";
	public static WebDriver driver;
	@BeforeMethod
	public void beforemethod() throws IOException
	{
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
//		String path1="D:\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", path1);
//		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\ScreenShorts/eaby1.png"));
		System.out.println("Screen shot was taken successfully");
	}
  @Test
  public  void search() {
	  driver.findElement(By.id("gh-ac")).sendKeys("cars");
	  List<WebElement> cat=driver.findElements(By.xpath("//select[@id='gh-cat']"));
	  for(WebElement x: cat)
	  {
		  if(x.getText().toLowerCase().equals(cat)) {
			  x.click();
		  }
	  }
	  driver.findElement(By.id("gh-cat")).click();
  }
}