package maven_Opencart1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Login {
	WebDriver driver;
	   WebElement web;
	   Actions A;
	   @BeforeSuite
	   public void beforeSuite()  // always run for chrom driver
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
		public void lognlink()
		{
			driver.get("https://www.opencart.com/index.php?route=account/login");
	    }
	@Test(priority=1,dataProvider="logindata")
		public void checklog(String use,String pass)
		{
		// driver.get("https://www.opencart.com/index.php?route=account/login");
		 web=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		 web.sendKeys(use);
		 web=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		 web.sendKeys(pass);
		 web=driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
		 web.click();
	     web=driver.findElement(By.xpath("//*[@id=\"input-pin\"]"));
	     web.sendKeys("1234",Keys.ENTER);
	   //  web=driver.findElement(By.xpath("//*[@id=\"account-pin\"]/div[2]/div/div[1]/form/button"));
	   //  web.click();
		}
		@DataProvider(name="logindata")
		public String [][] getdata()
		{
			String [][] data= {{"vira","punam123"},{"bhoyar","123456"},{"pbhoyar","52004"},{"bhoyerpuna11@gmail.com","8668280471"}};
			return data ;
			
		}
		@AfterClass()
	    public void teardown()
		 {
			driver.close();
		 }
		@AfterSuite()
		public void cleanup()
		 {
			System.out.println("all close up activies complted");
		 }
}
