package PG_E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Data_Asset_Add {

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
		//edf.TestingDA.click();
		edf.add.click();
		edf.providername.sendKeys("Testing2Checking231");
		Select sel = new Select(edf.sfaccount);
		sel.selectByVisibleText("Unknown (Unknown) (0)");
		
		edf.Submit.click();
		try {
		driver.wait(5000);
		} catch (Exception e) {
		System.out.println("Wait causing errors");
		}
		
		edf.DataAssetsTab.click();
		edf.DataAssetsADD.click();
		edf.id_data_asset_name.sendKeys("End_2_EndTesttocheck");
		
		Select sel1 = new Select(edf.id_data_asset_type);
		sel1.selectByValue("first party");	
		Select sel2 = new Select(edf.name_space);
		sel2.selectByVisibleText("biz/neustar/dna");	
		Select sel3 = new Select(edf.domain_name);
		sel3.selectByVisibleText("Business");	
		Select sel4 = new Select(edf.line_of_business);
		sel4.selectByVisibleText("Security");	
		Select sel5 = new Select(edf.geography);
		sel5.selectByVisibleText("Global");
		Select sel6 = new Select(edf.source_channel);
		sel6.selectByVisibleText("Batch");
		Select sel7 = new Select(edf.source_cadence);
		sel7.selectByVisibleText("Weekly");
		
		edf.source_frequency.sendKeys("1");
		
		
		Select sel8 = new Select(edf.source_feed_type);
		sel8.selectByVisibleText("Incremental");
		
		edf.source_score.sendKeys("100");
		
		Select sel9 = new Select(edf.authoritative_score);
		sel9.selectByVisibleText("High value");
		
		Select sel10 = new Select(edf.relationship_type);
		sel10.selectByVisibleText("Billing relationship Telco Wireless");
		
		Select sel11 = new Select(edf.household_granularity);
		sel11.selectByVisibleText("Individual");
		
		Select sel12 = new Select(edf.phone_wire_type);
		sel12.selectByVisibleText("Wireless");
		
		Select sel13 = new Select(edf.alert_level);
		sel13.selectByVisibleText("info - notify on start/finish of flow");
		
		edf.alert_poc.sendKeys("rohit.baweja@team.neustar");

		edf.DataAsset_Submit.click();
		
		
		
		
		
		
	}
	
	
}

