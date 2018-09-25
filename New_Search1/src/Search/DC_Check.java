package Search;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DC_Check {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://datacatalog.neustar.biz:8010/dc/");
		System.out.println("1");
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		System.out.println("2");
		//driver.wait(5000);
		/*driver.findElement(By.name("user")).sendKeys("A889346");
		driver.findElement(By.name("pass")).sendKeys("Sai@162329311");
		
		driver.findElement(By.name("login")).click();
		*/
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/app-root/div[3]/div/app-home/div[2]/input"))));
		//driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[2]/input")).sendKeys("EndToEndMainTest");
		driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[2]/input")).sendKeys(Keys.ENTER);
	
		
		// Checking for Data Asset 
		
		WebDriverWait wait1 = new WebDriverWait(driver,200);
		wait1.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/app-root/div[3]/div/app-home/div[3]/div/ul/li[1]"))));
		
		driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[3]/div/ul/li[1]")).click();
		
		
		WebDriverWait wait2 = new WebDriverWait(driver,200);
		wait2.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/app-root/div[3]/div/app-home/div[6]/table/tbody/tr/td[2]/span"))));
		
		driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-home/div[6]/table/tbody/tr/td[2]/span")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver,200);
		wait3.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/app-root/div[3]/div/app-search-drilldown-component/div/ul/li[2]/a"))));
		
		driver.findElement(By.xpath("/html/body/app-root/div[3]/div/app-search-drilldown-component/div/ul/li[2]/a")).click();
		
		
		
		
		
	}
	
}
