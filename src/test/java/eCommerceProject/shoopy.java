package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class shoopy {
  @Test
  public void shoopytest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening shoopy", true);
	  driver.get("https://www.shoopy.in/");
	 
	  Thread.sleep(5000);
	  driver.close();
  }
}
