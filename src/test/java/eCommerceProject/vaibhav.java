package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class vaibhav {
  @Test
  public void vaibhav() throws InterruptedException 
  {
	  
	WebDriver driver = new ChromeDriver();
	Reporter.log("opening amzon",true);
	
	driver.get("https://mail.google.com/mail/u/0/#inbox");
Thread.sleep(2000);	
driver.close();
 
	  
  }
}
