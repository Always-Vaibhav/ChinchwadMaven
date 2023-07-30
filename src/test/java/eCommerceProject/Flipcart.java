package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void flipcartTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening flipcart", true);
	  driver.get("https://www.amazon.in/");
	// Assert.fail();
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
