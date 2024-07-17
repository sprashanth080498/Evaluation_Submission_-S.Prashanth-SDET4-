package SDET_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	WebDriver driver;
	@BeforeTest
		public void bt() 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
}
	@Test(priority = 0)
	public void tc_1() throws InterruptedException {
		Thread.sleep(3000);
		WebElement size=driver.findElement(By.id("courses-iframe"));
		System.out.println(size.getSize());
		driver.switchTo().frame(size);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Mentorship")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	@AfterTest
	public void AT()
	{//closes the driver
		driver.close();
		
	}
}
