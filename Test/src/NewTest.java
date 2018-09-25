import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
 	public WebDriver driver ;
	
  @Test
  public void f() {
	driver.getTitle(); 
	  Assert.assertEquals("DEV1 EDF |  Home",driver.getTitle());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://dev.oneid.neustar:9011/edf/");
		System.out.println("1");
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		System.out.println("2");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
