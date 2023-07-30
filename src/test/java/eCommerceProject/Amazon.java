package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() throws InterruptedException {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening amazon", true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
}
