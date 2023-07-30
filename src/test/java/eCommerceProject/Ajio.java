package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() throws InterruptedException {
	  
	//  System.getProperty("user.dir");
	//  System.out.println();
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening Ajio", true);
	  driver.get("https://www.ajio.com/");
	 
	  Thread.sleep(5000);
	  driver.close();
  }
}
