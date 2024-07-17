package SDET_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
WebDriver driver;
@BeforeTest 
public void BT() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
	driver.manage().window().maximize();
}
@Test
public void alert_1() throws InterruptedException
{
	driver.findElement(By.cssSelector("#alertBox")).click();
	Alert A=driver.switchTo().alert();
	Thread.sleep(3000);
	A.accept();
	Thread.sleep(3000);
}
@Test(enabled=true)
public void alert_2() throws InterruptedException {
	WebElement alert2=driver.findElement(By.xpath("//button[@id=\"confirmBox\"]"));
	alert2.click();
	Alert A=driver.switchTo().alert();
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	A.accept();
	//String text=alert2.getText();
	//Assert.assertEquals( "Press a button!",text);
	//System.out.println("Assertion passed for first alert");
	}
@Test(enabled=true)
public void alert_3() 
{
	driver.findElement(By.cssSelector("#promptBox")).click();
	Alert A=driver.switchTo().alert();
	A.accept();
	
}
}