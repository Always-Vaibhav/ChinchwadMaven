package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void snapdealTest() throws InterruptedException {
	  
	  
	  WebDriver driver = new ChromeDriver();
		Reporter.log("opening snapdeal",true);
		
		driver.get("https://www.snapdeal.com/");
	Thread.sleep(2000);	
	driver.close();
  }
}
