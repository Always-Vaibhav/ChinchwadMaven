package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void testMeesho() throws InterruptedException {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening meesho", true);
	  driver.get("https://www.meesho.in/");
	  Thread.sleep(5000);
	  driver.close();
	  
	  
	  
  }
}
