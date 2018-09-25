package Search;

import java.net.HttpURLConnection;
import java.net.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.URL;



public class Full_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a889346\\Desktop\\Sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://am-pp.oneid.neustar/neusso/XUI/#login/&goto=https://ig-pp.oneid.neustar:443/oneid/neusearch/&realm=/NeuXim");
	//driver.wait(10000);
	driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,200);
	wait.until(ExpectedConditions.presenceOfElementLocated((By.id("idToken1"))));
/*	List<WebElement>  d = driver.findElements(By.tagName("iframe"));
	System.out.println(d.size());*/
	
	/*			WebDriverWait wait = new WebDriverWait(driver,10);
		Boolean d = wait.until(ExpectedConditions.elementToBeSelected(By.name("callback_0")));*/
		//String ds = driver.findElement(By.id("idToken1")).getText();
		System.out.println("We are here ");

		driver.findElement(By.id("idToken1")).sendKeys("shubham");
	   /*driver.notifyAll();
	   driver.wait(100000);
		boolean ise = driver.findElement(By.xpath("//*[@id=\"idToken1\"]")).isEnabled();
		if(ise) {
			 driver.findElement(By.xpath("//*[@id=\"idToken1\"]")).sendKeys("shubham");
		} else {
			driver.wait(10000);
		}
		driver.findElement(By.id("idToken2")).sendKeys("Shubham1");
		driver.findElement(By.id("loginButton_0")).click();
		System.out.println("We are In");
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		driver.findElement(By.id("idToken2")).sendKeys("Shubham1");
		driver.findElement(By.id("loginButton_0")).click();
		System.out.println("On Search Page :)");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
		//driver.wait(1000);		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println(tags.size());
		for(int i=0; i<tags.size(); i++) {
			WebElement elem = tags.get(i);
			System.out.println(elem.getText());
			String url = elem.getAttribute("href");
			System.out.println(url);
			//System.out.println(url);
			verifyLinkActive(url); 
			//driver.close();
		}
		System.out.println("We are done");
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
	//String d = "test" ;
        try 
        {
         java.net.URL link = new java.net.URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)link.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
              System.out.println((linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND));
            }
        } catch (Exception e) {
           
        }
        
   //     return d;
    } 
	
}
