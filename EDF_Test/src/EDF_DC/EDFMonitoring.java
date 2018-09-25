package EDF_DC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EDFMonitoring {
	
	public WebDriver driver ;
  @Test(priority = 0 , groups = {"Add"})
  public void ExistingMonitoring() {
		String url = driver.getCurrentUrl();
		  System.out.println(url);
		  EDF edf = new EDF(driver);
		  WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
		    Actions act = new Actions(driver);
		    act.moveToElement(element).build().perform();
			WebDriverWait wait = new WebDriverWait(driver,200);
				edf.DataAsset.click();
				edf.id_data_asset_name.sendKeys("EndToEndMainTest");

			    edf.id_data_asset_name.sendKeys(Keys.ENTER);
			   // driver.findElement(By.linkText("EndToEndMainTest")).click();
			    System.out.println(driver.getTitle());
			    driver.findElement(By.linkText("EndToEndMainTest")).click();
			    edf.catalog.click();
			    List<WebElement> d = driver.findElements(By.tagName("a"));
			    for (WebElement webd : d) {
			    	if (webd.getText() == "11770" || webd.getText() == "11768" || webd.getText() == "11769" )
			    	System.out.println("Files located successfully" );
			    	
			    }
			    System.out.println("Files : 11770 , 11769 , 11768" );
	  }
	  
  
  @BeforeTest(groups = {"Add"})
  public void EDFLogin() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\a889346\\\\Desktop\\\\Sel\\\\chromedriver_win32\\\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9011/edf/");
		System.out.println(driver.getTitle());  
  }
  
  @AfterTest(groups = {"Add"})
  public void Signout() {
	  
	  System.out.println("driver signing out");
	 driver.close();
	  }
  }
  
  
