import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Landing;

public class Logout {
	static String hamburger= Landing.Hamburger;
	static String logout= Landing.Logout;
	
	@Test(priority=1)
	public static void Logoutapp() throws InterruptedException { 
		System.out.println("tap On Logout");
		Setup.driver.findElement(By.id(hamburger)).click();
		Setup.driver.findElement(By.id(logout)).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id("android:id/button1")).click();
		System.out.println("Successfully Logout");
	}
}
