package maven_Opencart1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	WebDriver driver;
	   WebElement w;
	   
	   @BeforeSuite
	   public void beforeSuite()  // always run for chrom driver
	   {
	 	  WebDriverManager.chromedriver().setup();
	 	  driver= new ChromeDriver();
	   }
	   @Test
	   public void register()
	   {
		   driver.get("https://www.opencart.com/index.php?route=account/register");
		   driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("punam bhoyar",Keys.ENTER);
		   driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("punam",Keys.ENTER);
		   driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("bhoyar",Keys.ENTER);
		   driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("bhoyarpunam11gmail.com",Keys.ENTER);
		   driver.findElement(By.xpath("//*[@id=\"input-country\"]")).sendKeys("India",Keys.ENTER);
		   driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("bhoyarpunam11gmail.com",Keys.ENTER);
		  // driver.findElement(By.xpath("//*[@id=\"captcha-image\"]")).sendKeys("bulb",Keys.ENTER);
		   driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[2]")).click();
		   
	   }


}
