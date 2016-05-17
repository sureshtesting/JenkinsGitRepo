package singamPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void LoginTest() throws InterruptedException {
	  
	  System.out.println("Login Success!!");
	  
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.yahoo.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id='yucs-profile']/a/b")).click();
	
  }
}
