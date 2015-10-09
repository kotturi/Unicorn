import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Landing;

public class Hamburger {
	
	static String hamburger= Landing.Hamburger;
	static String booking= Landing.Booking;
	static String favourites= Landing.Favourites;
	static String reviews= Landing.Reviews;
	static String profile= Landing.Profile;
	
	
	@BeforeMethod
	public static void search() throws InterruptedException { 
		System.out.println("tap On Hamburtger");
		Setup.driver.findElement(By.id(hamburger)).click();
		
	}
	
	@Test(priority=1)
	public static void About() throws InterruptedException { 
		System.out.println("tap On About");
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/txt_about")).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Setup.driver.navigate().back();
		
	/*	WebElement element= Setup.driver.findElement(By.name("Version: v0.3"));
		fnHighlightMe(Setup.driver,element);*/
		
		Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
	}
	
	
	@Test(priority=2)
	public static void Booking() throws InterruptedException { 
		System.out.println("tap On Booking");
		Setup.driver.findElement(By.id(booking)).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
		//Setup.driver.navigate().back();
		
	}
	@Test(priority=3)
	public static void Favourites() throws InterruptedException { 
		System.out.println("tap On Favourites");
		Setup.driver.findElement(By.id(favourites)).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
		//Setup.driver.navigate().back();
		
	}
	@Test(priority=4)
	public static void Reviews() throws InterruptedException { 
		System.out.println("tap On Reviews");
		Setup.driver.findElement(By.id(reviews)).click();
		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
		//Setup.driver.navigate().back();
		
	}
	@Test(priority=5)
	public static void Profile() throws InterruptedException { 
		System.out.println("tap On Profile");
		Setup.driver.findElement(By.id(profile)).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
		//Setup.driver.navigate().back();
		
	}
	
	

/*public static void fnHighlightMe(WebDriver driver,WebElement element) throws InterruptedException{
 //Creating JavaScriptExecuter Interface
  JavascriptExecutor js = (JavascriptExecutor)driver;
  for (int iCnt = 0; iCnt < 6; iCnt++) {
     //Execute javascript
        js.executeScript("arguments[0].style.border='4px groove green'", element);
        Thread.sleep(1000);
        js.executeScript("arguments[0].style.border=''", element);
  }
}*/
	
	}
