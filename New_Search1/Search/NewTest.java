package Search;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	//public WebDriver driver = null ;
	
  @Test
  public void f() {
	  
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://dev.oneid.neustar:9011/edf/");
		System.out.println("1");
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		System.out.println("2")
	  
  }

  @AfterMethod
  public void afterMethod(WebDriver driver) {
	  driver.close();
  }

}