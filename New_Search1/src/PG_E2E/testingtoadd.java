package PG_E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testingtoadd {
   public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\a889346\\\\Desktop\\\\Sel\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	EDF edf = new EDF(driver);
	driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9071/edf/");
	System.out.println(driver.getTitle());
	//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	//Onboarding Tab
	WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
    Actions act = new Actions(driver);
    act.moveToElement(element).build().perform();
	WebDriverWait wait = new WebDriverWait(driver,200);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/nav/div[3]/div/a[1]")));
	edf.providers.click();
	edf.TestingDA.click();
	edf.DataAssetsTab.click();
	edf.End2EndDA.click();
	//driver.wait(5000);
	WebDriverWait waits = new WebDriverWait(driver,200);
	waits.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/main/div/div[2]/ul/li[5]"))));
	edf.FormatDATab.click();
	edf.DAFormatAdd.click(); 
	
	Select sel1 = new Select(edf.Input_Type);
	sel1.selectByValue("file");	
	
	Select sel2 = new Select(edf.output_type);
	sel2.selectByValue("nif");	
	
	Select sel3 = new Select(edf.trfm);
	sel3.selectByValue("AAC1");	
	
	Select sel4 = new Select(edf.flow);
	sel4.selectByValue("TestFlow");
	
	/*Select sel5 = new Select(edf.store);
	sel5.selectByValue();*/
	
	// Adding EndPoint 
	
	
	
}
}