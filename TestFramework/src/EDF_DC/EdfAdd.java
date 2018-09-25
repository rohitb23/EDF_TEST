package EDF_DC;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.nio.charset.Charset;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;






public class EdfAdd {
	
	public WebDriver driver ;
	
	//private static Logg 
	
	
  @Test(priority = 0 , groups = {"Add"})
  public void Data_Asset_ADD() throws InterruptedException {
	  System.out.println("Adding Data Asset with Provider");
	  
	//  WebDriver driver;
	String url = driver.getCurrentUrl();
	  System.out.println(url);
	  EDF edf = new EDF(driver);
	  WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
	    Actions act = new Actions(driver);
	    act.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/nav/div[3]/div/a[1]")));
		edf.providers.click();
		//edf.TestingDA.click();
		edf.add.click();
		edf.providername.sendKeys("Testing2Chec200");
		Select sel = new Select(edf.sfaccount);
		sel.selectByVisibleText("Unknown (Unknown) (0)");
		try {
			edf.Submit.click();
		
		} catch (Exception e){
			System.out.println("Exist Alread");
		}
		finally {
			 String generatedString = RandomStringUtils.randomAlphabetic(10);
			 
			
		 
		    System.out.println(generatedString);
		    edf.providername.clear();
		    edf.providername.sendKeys(generatedString);
		    edf.Submit.click();
	//	    driver.wait(5000);
		    System.out.println(driver.getTitle());
		}
		
	/*	try {
		driver.wait(5000);
		} catch (Exception e) {
		System.out.println("Wait causing errors");
		}*/
		WebDriverWait waits = new WebDriverWait(driver,200);
		waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/main/div/div[2]/ul/li[3]")));
		
		
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
        try {
		edf.DataAsset_Submit.click();
        }
        catch (Exception e) {
			System.out.println("DA Exist");
		}
        finally {
       	 String generatedString = RandomStringUtils.randomAlphabetic(10);
		    System.out.println(generatedString);
			String title = generatedString;
		    edf.id_data_asset_name.sendKeys(generatedString);
		    edf.DataAsset_Submit.click();
//		    driver.wait(5000);
		    
		}
	//	driver.wait(5000);
	
		
	//	Assert.assertEquals(driver.getTitle(),"DEV7 EDF |  Provider: " + title);
		
  }
  
  //5
  @Test(priority = 4 , groups = {"Add"})
  public void EndPoint() throws InterruptedException {
	  
	  System.out.println("Adding EndPoint");
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
		try {
		edf.Schema_Submit.click();
		}
		catch (Exception e) {
			System.out.println("Schema Exists");
		}
		
		finally {
			String generatedString = RandomStringUtils.randomAlphabetic(10);
			System.out.println(generatedString);
			edf.endpoint_name.sendKeys(generatedString);
			edf.Schema_Submit.click();
	//		driver.wait(5000);
		    System.out.println(driver.getTitle());
		}
	//	String endPoint = "TestEnd3";
	//	driver.wait(5000);
	//	Assert.assertEquals(driver.getTitle(),"DEV7 EDF |  Endpoint: TestEnd3");
		
  }

	
	//4
  @Test(priority = 3 , groups = {"Add"})
  public void AddFormat() throws InterruptedException {
	  System.out.println("Adding Format");
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
		driver.findElement(By.linkText("End_End_Tests")).click();
		System.out.println("Clicked Succewssfully");
		//edf.TestingDA.click();
		edf.DataAssetsTab.click();
		driver.findElement(By.linkText("EndToEnd")).click();
		//edf.End2EndDA.click();
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
		sel3.selectByValue("2");	
		
		Select sel4 = new Select(edf.flow);
		sel4.selectByValue("1");
		
		edf.store_load_flg.click();
		
		Select sel5 = new Select(edf.endpoint_target);
		sel5.selectByValue("2");
		
		
		Select sel6 = new Select(edf.id_encryption_program);
		sel6.selectByValue("openssl");
		try {
		edf.DAFormatSubmit.click();
	//	driver.wait(5000);
	    System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			System.out.println("Exists Format");
			
		}
	
	//	driver.wait(5000);
		
		String Format = "DEV7 EDF |  Data Asset Format: End_2_End";
		
	  
	  
  }
  
  //2
  @Test ( priority = 1 , groups = {"Add"})
  public void Schema() throws InterruptedException {
	  
	  System.out.println("Adding Schema");
	  EDF edf = new EDF(driver);
		driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9071/edf/");
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		//Onboarding Tab
		WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
	    Actions act = new Actions(driver);
	    act.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/nav/div[3]/div/a[7]")));
	    edf.SchemaTab.click();
	    edf.schemaAdd.click();
	    edf.schemaName.sendKeys("EFT23");
	    edf.SchemaVersion.sendKeys("1.0");
	    Select sel1 = new Select(edf.schemaFormat);
	    sel1.selectByValue("csv");
	    edf.schemaDelimiter.sendKeys(",");
	    try {
	    edf.Schema_Submit.click();
	    }
	    catch(Exception e) {
	    	System.out.println("Schema Exists");
	    }
	    finally {
	    	String generatedString = RandomStringUtils.randomAlphabetic(10);
	    	System.out.println(generatedString);	
	    	edf.schemaName.sendKeys(generatedString);
	    	edf.Schema_Submit.click();
	//    	driver.wait(5000);
		    System.out.println(driver.getTitle());
	    }
  }
  
  //3
  @Test(priority = 2 ,  groups = {"Add"})
  public void transform() throws InterruptedException {
	  System.out.println("Adding transform");
	  EDF edf = new EDF(driver);
		driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9071/edf/");
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		//Onboarding Tab
		WebElement element = driver.findElement(By.xpath("/html/body/header/nav/div[3]/button"));
	    Actions act = new Actions(driver);
	    act.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/nav/div[3]/div/a[8]")));
	    edf.transformTab.click();
	    edf.TransformAdd.click();
	    edf.TransformName.sendKeys("EFT23");
	    Select sel1 = new Select(edf.transformTech);
	    sel1.selectByValue("spark_java");
	    Select sel2 = new Select(edf.id_src_schema);
	    sel2.selectByValue("2");
	    edf.skipEx.sendKeys("ID");
	    try {
        edf.Trans_Submit.click();  
	    }
	    catch (Exception e) {
			System.out.println("TransExists");// TODO: handle exception
		}
	    finally {
	    	String generatedString = RandomStringUtils.randomAlphabetic(10);
	    	System.out.println(generatedString);	
	    	edf.TransformName.sendKeys(generatedString);
	    	edf.Trans_Submit.click();
	  //  	driver.wait(5000);
		    System.out.println(driver.getTitle());
		}
	  
	  
	  
	  
  }
  
  @BeforeMethod(groups = {"Add"})
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\a889346\\\\Desktop\\\\Sel\\\\chromedriver_win32\\\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://a889346:Sai@162329311@dev7.oneid.neustar:9071/edf/");
		System.out.println(driver.getTitle());
	  
  }

  @AfterMethod(groups = {"Add"})
  public void afterMethod() {
	  
	  System.out.println("driver signing out");
	  driver.close();
	  }

}
