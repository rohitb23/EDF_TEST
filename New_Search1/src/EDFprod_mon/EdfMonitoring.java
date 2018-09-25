package EDFprod_mon;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EdfMonitoring {
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","/etc/sensu/plugins/selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
	driver.get("https://oneiddevops:Qu6150e!xXWD@oneid.neustar/edf/");
	System.out.println("Login to EDF successfully");
	
	System.out.println(driver.getTitle());
	driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	System.out.println("Searching for a Data Asset");
	WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
    Actions act = new Actions(driver);
    act.moveToElement(element).build().perform();
    driver.findElement(By.xpath("/html/body/header/nav/div[3]/div/a[4]")).click();
//	WebDriverWait wait = new WebDriverWait(driver,200);
	WebElement text = driver.findElement(By.id("id_data_asset_name"));
	text.sendKeys("AAC1");
	text.sendKeys(Keys.ENTER);
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
