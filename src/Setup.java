import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utilities.Landing;

public class Setup {
		
	static AppiumDriver driver = null;
	//static AndroidDriver<MobileElement> driver=null;
	@Test
	public static void configure() throws MalformedURLException, InterruptedException
	{
		try{
		  System.out.println("Unicorn installation started :");
		 	//  WebDriver driver;
			    File app = new File(Landing.apk); //trypal_nov14  Android
			    DesiredCapabilities capabilities = new DesiredCapabilities();
			    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			    capabilities.setCapability("deviceName","HT35JW912039"); //Nexus: 00771695054e2b67: 5.0; sample    HT35JW912039: 4.4.3
			    //        capabilities.setCapability("deviceName", "emulator-5554"); //Emulator purpose
			          capabilities.setCapability("platformVersion", "5.1.1");  
			    capabilities.setCapability("platformName", "Android");     
			    capabilities.setCapability("app", app.getAbsolutePath());
			    capabilities.setCapability("app-package", "com.popcorn.unicorn");  
			    capabilities.setCapability("app-activity", "com.popcorn.unicorn.MainActivity"); //com.example.samplespinnerproject
			    //driver1= new RemoteWebDriver( new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			    driver= new AndroidDriver( new URL("http://127.0.0.1:4723/wd/hub"), capabilities) ;
			    System.out.println("Installing the native Archetype app in device...");
		  	/*if (driver.isAppInstalled("com.archetyps.cameraapplication")) {
		  		System.out.println("isAppInstalled - "
		  				+ driver.isAppInstalled("com.popcorn.unicorn"));
		  		System.out.println("App is already installed");
		  	} else 
		  	{
		  		System.out.println("App not installed.");
		  		driver.installApp(Landing.apk);	
		  		
		  		State_Selection();
		    }*/
		}
		catch(Exception e)
		{
			    throw new RuntimeException();
	}
	}
	
	@Test(dependsOnMethods = {"configure"})
	public static void State_Selection() throws InterruptedException
	{
         System.out.println("Location Selection: ");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 
		 Boolean flag=false;
			try {
				flag = Setup.driver.findElement(By.className("android.widget.LinearLayout")).isDisplayed();

			} catch (Exception e) {
				flag = false;
			}
			if (flag) {
				driver.scrollToExact("Hyderabad").click();
		         driver.findElement(By.name("SELECT LOCATION")).click();
			}
		 
		else
		 {
		 WebElement alert= Setup.driver.findElement(By.id("android:id/button1"));
			Setup.driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			alert.click();
			System.out.println("Network Problem...!");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			FirefoxDriver fd= new FirefoxDriver();
			driver.get("wwww.gmail.com");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 }
     } 
	
}







