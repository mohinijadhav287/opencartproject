package maven_Opencart1;
    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Opencartover
	{
		Actions act;
		WebDriver driver ;
		WebElement web ;
	   @BeforeSuite()
		public void setup()
		{
		   WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();	
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
		@Test(priority=1)
		//(dataProvider="logindata")
		public void checklogin( )
		{
		// driver.get("https://www.opencart.com/index.php?route=account/login");
		 web=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		 web.sendKeys("bhoyarpunam11@gmail.com",Keys.ENTER);
		 web=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		 web.sendKeys("8668280471");
		 web=driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
		 web.click();
	     web=driver.findElement(By.xpath("//*[@id=\"input-pin\"]"));
	     web.sendKeys("1234");
	     web=driver.findElement(By.xpath("//*[@id=\"account-pin\"]/div[2]/div/div[1]/form/button"));
	     web.click();
		}
		/*@DataProvider(name="logindata")
		public String [][] getdata()
		{
			String [][] data= {//{"vira","punam123"},{"bhoyar","123456"},{"pbhoyar","52004"},
					{"bhoyarpunam11@gmail.com","8668280471"}};
			return data ;
			
		}*/
		@Test(priority=2)
		public void Account()
		{
			
			driver.findElement(By.xpath("//*[@id=\"short-cut\"]/div[1]/div[1]/div/div[2]/p/a")).click();
			driver.findElement(By.xpath("//*[@id=\"input-company\"]")).sendKeys("xyzsd");
			driver.findElement(By.xpath("//*[@id=\"input-tax-id\"]")).sendKeys("Tax12");
            web= driver.findElement(By.xpath("//*[@id=\"input-country\"]"));
            Select s=new Select(web);
            s.selectByVisibleText("Iran");
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div/div/div[1]/form/fieldset[2]/div/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div/div/div[1]/form/fieldset[2]/div/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div/div/div[1]/form/fieldset[2]/div/div[2]/div[2]/button")).click();
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div/div/div[1]/form/fieldset[3]/div/div/div[2]/div/label[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div/div/div[1]/form/fieldset[3]/div/div/div[2]/div/label[2]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"account-edit\"]/div/div/div[1]/form/div/button")).click();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[2]/td/a")).click();
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[3]/td/a")).click();
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[4]/td/a")).click();
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu0\"]/table/tbody/tr[5]/td/a")).click();
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu\"]/div[1]/div/a")).click();
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu\"]/div[3]/div[1]")).click();
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@id=\"collapse-menu\"]/div[4]/div[1]/a")).click();
            driver.navigate().back();
		}
		
		/*@AfterMethod()
		public void screenshot() 
		{
			
		}*/
		@BeforeClass()
		public void appsetuplink()
		{
			 driver.get("https://www.opencart.com/");
		}
		@Test(priority=2)
	 public void verfiylogotitle ()
	 {
		 boolean log =driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/a/img")).isDisplayed();
		 Assert.assertTrue(log); 
		 String Expectedtitle= "OpenCart - Open Source Shopping Cart Solution";
		 String Actualtitle=driver.getTitle();
	 }
		@Test(priority=3)
		public void actionsfeature()
		{           
			act= new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a"))).click().build().perform();//feature
		    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[2]/a"))).click().build().perform();
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[3]/a"))).click().build().perform();
		    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[4]/a"))).click().build().perform();
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[5]/a"))).click().build().perform();
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[6]/a"))).click().build().perform();
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a"))).click().build().perform();
		}
			/*@Test(priority=3)
			public void dmo()
			{
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[2]/a"))).click().build().perform();
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-demo\"]/div[2]/div/div[1]/div/a"))).click().build().perform();
			//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"search\"]/input"))).sendKeys("MacBook").click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"search\"]/button"))).click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"search\"]/button"))).click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"cms-demo\"]/div[2]/div/div[2]/div/a"))).click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath(""))).click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath(""))).click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath(""))).click().build().perform();	
			//act.moveToElement(driver.findElement(By.xpath(""))).click().build().perform();		
		} */
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
	
	
