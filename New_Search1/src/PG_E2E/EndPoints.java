package PG_E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndPoints {
    public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\a889346\\\\Desktop\\\\Sel\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	EDF edf = new EDF(driver);
	driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9071/edf/");
	System.out.println(driver.getTitle());
	//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	//EndPoint Tab
	WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
    Actions act = new Actions(driver);
    act.moveToElement(element).build().perform();
	//WebDriverWait wait = new WebDriverWait(driver,200);
	edf.Endpoint_tab.click();
	
	WebDriverWait waits = new WebDriverWait(driver,200);
	waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/main/div/div[2]/ul/li/a")));
	
	edf.add.click();
	
	edf.endpoint_name.sendKeys("TestEnd1");
	
	Select sel1 = new Select(edf.endpoint_type);
	sel1.selectByValue("source");
	
	Select sel2 = new Select(edf.endpoint_cred_type);
	sel2.selectByValue("password");
	
	edf.key_password.sendKeys("testing23");
	
	Select sel3 = new Select(edf.endpoint_flow_dir);
	sel3.selectByValue("push");
	
	Select sel4 = new Select(edf.endpoint_method);
	sel4.selectByValue("FTP");
	
	edf.Schema_Submit.click();
}

}