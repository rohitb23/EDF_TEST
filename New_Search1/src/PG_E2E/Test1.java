package PG_E2E;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PG_E2E.EDF;
public class Test1 {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\a889346\\\\Desktop\\\\Sel\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		EDF edf = new EDF(driver);
		driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9071/edf/");
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
	    Actions act = new Actions(driver);
	    act.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/nav/div[3]/div/a[1]")));
		edf.providers.click();
		edf.add.click();
		edf.providername.sendKeys("Testing");
		Select sel = new Select(edf.sfaccount);
		sel.selectByVisibleText("Unknown (Unknown) (0)");
		//edf.Submit.click();
		
		
		
	}
	
	public static void  Data_Asset_Add(WebDriver driver) {
		
		
		
		
	}
	
	
}
