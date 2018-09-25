package EDF_DC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class DCMonitoring {
	
	public WebDriver driver;
	
  @Test(groups = {"Validation"},priority = 1)
  public void f() {
//	    driver.findElement(By.name("user")).sendKeys("a889346");
//	    driver.findElement(By.name("pass")).sendKeys("Sai@162329311");
//	    driver.findElement(By.name("login")).click();
       WebElement searchbox =     driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[2]/input"));
       searchbox.sendKeys("EndToEndMainTest");
       searchbox.sendKeys(Keys.ENTER);
       WebDriverWait wait = new WebDriverWait(driver,200);
	   wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/app-root/div[3]/div/app-home/div[3]/div/ul/li[1]"))));
       driver.findElement(By.xpath("/html/body/app./c]-root/div[3]/div/app-home/div[3]/div/ul/li[1]")).click();
       wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/app-root/div[3]/div/app-home/div[6]/table/tbody/tr/td[2]/span"))));
       driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[6]/table/tbody/tr/td[2]/span")).click();
       driver.findElement(By.linkText("Files")).click();
       
       WebElement d = driver.findElement(By.className("data-search-table"));
       List<WebElement> lst = driver.findElements(By.tagName("tr"));
       for(WebElement ss : lst) {
    	   System.out.println(ss.getAttribute("text"));
       }
      
		System.out.println("File Present : 11770");
		System.out.println("File Present : 11769");
		System.out.println("File Present : 11768");
  }
  
  
  @BeforeMethod(groups = {"Validation"})
  public void Login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://datacatalog.neustar.biz:8010/dc/");
		System.out.println("1");
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		System.out.println("2");
  }
  
  
  @AfterMethod(groups = {"Validation"})
  public void signOut() {
	  System.out.println("Signing Out");
	 driver.close();
	  
  }
}
