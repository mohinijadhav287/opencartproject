package maven_Opencart1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Showacase {
	WebDriver driver;
    WebElement web;
	@BeforeSuite()
	public void before_suit()
	{
		 WebDriverManager.chromedriver().setup();
	 	  driver= new ChromeDriver();
	}
	@BeforeTest()
	 public void max()
	 {
		  driver.manage().window().maximize();
	 }
	@BeforeMethod
	public void login_link()
	{
		driver.get("https://www.opencart.com/index.php?route=account/account&member_token=e2d932df3fb35a2dd2ca8cb4110e9fb2");
		web=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		 web.sendKeys("bhoyarpunam11@gmail.com",Keys.ENTER);
		 web=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		 web.sendKeys("8668280471");
		 web=driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
		 web.click();
	     web=driver.findElement(By.xpath("//*[@id=\"input-pin\"]"));
	     web.sendKeys("1234",Keys.ENTER);
	   //  web=driver.findElement(By.xpath("//*[@id=\"account-pin\"]/div[2]/div/div[1]/form/button"));
	   //  web.click();
	}
	@Test(priority=1)
	public void changepassword() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"short-cut\"]/div[2]/div[2]/div/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[4]/td/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[2]/td/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[3]/td/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[5]/td/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapse-menu\"]/div[1]/div/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"collapse-menu\"]/div[3]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapse-menu\"]/div[4]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
        
	}
}