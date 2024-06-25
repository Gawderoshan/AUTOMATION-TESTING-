package org.automation.qa2.Automation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser2 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT GAWADE\\Desktop\\roshan\\automation\\chromedriver-win64\\chromedriver.exe");
      
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
       
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       
       driver.get("https://demo.automationtesting.in/Index.html");
       Thread.sleep(3000);
       
       // email textbox
       WebElement email=driver.findElement(By.id("email"));
       email.sendKeys("rohita23@gmail.com");
       Thread.sleep(3000);
       
       // enter  btn
       WebElement enterBtn=driver.findElement(By.id("enterimg"));
       enterBtn.click();
       
       // firstname textbox
       WebElement firstname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
      firstname.sendKeys("rohit");
      
      // lastname textbox
     WebElement  lastname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
     lastname.sendKeys("khan");
     
     //address textbox
       WebElement address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
      address.sendKeys("Newyork streets tower no 5");
      
      
      WebElement emailname=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
   	 emailname.sendKeys("rohitkhan@gmail.com");
   	 
   	 WebElement phoneno=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
   	 phoneno.sendKeys("1234567891");
   	 
   	
     WebElement  genderselect=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")); 
     genderselect.click();
   			
		Thread.sleep(8000);
		driver.close();
		
	}

}
