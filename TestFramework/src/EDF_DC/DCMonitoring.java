package EDF_DC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DCMonitoring {
	
	public WebDriver driver;
	
  @Test(groups = {"Validation"},priority = 5)
  public void f() {
		WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
		System.out.println("3");

        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
        driver.findElement(By.xpath("/html/body/header/nav/div[3]/div/a[4]")).click();
		WebDriverWait wait = new WebDriverWait(driver,200);
		//wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/header/nav/div[2]/button"))));
		//Select sel = new Select(driver.findElement(By.linkText("On-Boarding")));
		//driver.findElement(By.xpath("/html/body/header/nav/div[3]/div/a[4]")).click();
		System.out.println("Working on it");
		WebElement text = driver.findElement(By.id("id_data_asset_name"));
		text.sendKeys("EndToEndMainTest");
		text.sendKeys(Keys.ENTER);
		System.out.println("Record entered");
		//driver.wait(10000);
		WebElement record = driver.findElement(By.id("1237"));
		if(record.isEnabled()) {
			System.out.println("Record present and enabled");
			//driver.findElement(By.id("1237")).click();
		}
		else {
			System.out.println("No record found");
		}
		driver.findElement(By.xpath("//*[@id=\"result_list\"]/tbody/tr/td[3]/a")).click();
		System.out.println("Navigated Successfully");
		driver.findElement(By.xpath("/html/body/main/div/div[2]/ul/li[8]")).click();
		System.out.println("Validating file");
		WebElement file = driver.findElement(By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/td[1]/a"));
		System.out.println(file.getAttribute("a"));
		java.util.List<WebElement> files = driver.findElements(By.xpath("//div[@id='tab-9']/*[@href]"));
		System.out.println(files.size());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/td[1]/a")).getText());
		for (WebElement ele : files) {
			String link = ele.getAttribute("href");
			System.out.println(ele.getTagName() + "=" + " " + link + " , " + ele.getText());
		}
		//driver.findElement(By.tagName("href = /edf/file/11770/")).getText();
		if(file.isEnabled()) {
			System.out.println("Files Found 11770, 11769 , 11698");
		} else {
			System.out.println("Invalid File");
		}
		
		WebElement table = driver.findElement(By.id("result_list"));
		java.util.List<WebElement> tabs = driver.findElements(By.tagName("a"));
		System.out.println(tabs.size());
		for(WebElement d : tabs) {
			if(d.getAttribute("href") == "11770" || d.getText() == "11769" || d.getText() == "11698") {
			//System.out.println(d.getText());
			System.out.println(d.getAttribute("href"));
			}
		}
  }
  
  
  @BeforeMethod(groups = {"Validation"})
  public void Login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://dev.oneid.neustar:9011/edf/");
		System.out.println("1");
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		System.out.println("2");
  }
  
  
  @AfterMethod(groups = {"Validation"})
  public void signOut() {
	  driver.close();
	  
  }
}
