package KT.KTproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class popup_window {
  @Test
public void f() throws InterruptedException 
  {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D:\\newworkspace\\KTproject\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      
	  //driver.get("https://in.puma.com/");
	  driver.manage().window().maximize();
	  
	//driver.get("http://104.155.211.236/");
		driver.navigate().to("https://www.hdfcbank.com");
		Thread.sleep(3000);
		
		//close add
		driver.findElement(By.xpath("//*[@id='cee_closeBtn']")).click();
		Thread.sleep(3000);
		
		//get parent window name
		String homepage= driver.getWindowHandle();
		System.out.println(homepage );
		Thread.sleep(3000);
		
		//click on search
		driver.findElement(By.xpath("//div[@class='sf-searchicon']")).click();
		Thread.sleep(3000);
		
		//click on alert
		driver.switchTo().alert().accept();
		
		//DropDown
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='selectedvalue']"));
		dropdown.click();
		
		//Set<String> windowHandles = driver.getWindowHandles();
		
		//Selecting element from dropdown
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(@id,'prepaidcard')]")).click();
		
		//click on login
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='loginwrap']/a")).click();
		
		//shifting control to child window
		
		/*for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle);
	
		    Thread.sleep(2000);
		    driver.close();
		    driver.switchTo().window(homepage);
		    
		}
		
		driver.switchTo().window(homepage);*/
		
		
		
		Thread.sleep(4000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator<String> ite = windows.iterator();
		
		while( ite.hasNext())
		{
			String currentid = ite.next().toString();
			System.out.println(currentid);
			
			if(!currentid.equals(homepage ))
			{
				driver.switchTo().window(currentid);
				//driver.manage().window().maximize();
				
				System.out.println(" page maximized");
				//Thread.sleep(5000);
				
				  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kumar");
			}
		}
		
		//Thread.sleep(3000);
		driver.close();
  }
  }


