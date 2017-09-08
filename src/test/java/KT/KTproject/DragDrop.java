package KT.KTproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDrop {
  @Test
  public void f()
  {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D:\\newworkspace\\KTproject\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
	  //driver.get("https://in.puma.com/");
	  
	  driver.manage().window().maximize();
		//driver.get("http://104.155.211.236/");
		driver.navigate().to("http://jqueryui.com/droppable/");
		//Wait for the frame to be available and switch to it
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
		WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(Sourcelocator,Destinationlocator);
		String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
		Assert.assertEquals(actualText, "Dropped!");
  }
}
