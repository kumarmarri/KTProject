package KT.KTproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamic_Xpaths {
  @Test
  public void f()
  {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D:\\newworkspace\\KTproject\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
	  //driver.get("https://in.puma.com/");
	  
	  driver.manage().window().maximize();
		//driver.get("http://104.155.211.236/");
		driver.navigate().to("http");
  }
}
