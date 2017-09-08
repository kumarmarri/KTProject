package KT.KTproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
public class DragandDrop 
{
 
	@Test
    public static void dp()
    {
    	WebDriver driver ;
    	System.setProperty("webdriver.chrome.driver","D:\\newworkspace\\KTproject\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
 
   // WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://jqueryui.com/droppable/#default");
    driver.manage().window().maximize();
 
    Actions act = new Actions(driver);
 
    // Script for dragging an element and dropping it in another place
    WebElement iFrame = driver.findElement(By.tagName("iframe"));
   // WebElement findElement = driver.findElement(By.xpath("//div[@id='draggable']"));
    System.out.println(iFrame.getSize());
    driver.switchTo().frame(iFrame);
 
    WebElement From = driver.findElement(By.id("draggable"));
    System.out.println(From.getLocation());
 
    WebElement To = driver.findElement(By.id("droppable"));
    System.out.println(To.getLocation());
 
    act.dragAndDrop(From, To).build().perform();
 
    }
} 