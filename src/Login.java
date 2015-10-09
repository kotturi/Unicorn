import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.Test;

//import com.sun.jna.platform.FileUtils;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utilities.Landing;

public class Login {
	
	static String login=Landing.login_link;
	static String mobile_No=Landing.mobileNo_txt;
	static String password=Landing.password_txt;
	static String loginBtn=Landing.login_Btn;
    static String datafile=Landing.data;
	
	@Test
	public static void user_login() throws BiffException, IOException
	{
		try{
		System.out.println("Login started: ");
		Boolean flag=false;
		try {
			flag = Setup.driver.findElement(By.name("Login")).isDisplayed();

		} catch (Exception e) {
			flag = false;
		}
		if (flag) {
			Setup.driver.findElement(By.id(login)).click();
		}
		
		String FilePath = datafile;
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		// TO get the access to the sheet
		Sheet s = wb.getSheet("Login");
//		System.out.println(" s.getRows()"+ s.getRows());
		for(int row = 1;row < s.getRows();row++)
		{
            //Registered EmailId/Mobile no	
			Setup.driver.findElement(By.id(mobile_No)).click();
			String MobileNo = s.getCell(0,row).getContents();
			Setup.driver.findElement(By.id(mobile_No)).sendKeys(MobileNo);
			Setup.driver.hideKeyboard();
			Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Registered Password 
			Setup.driver.findElement(By.id(password)).click();
			String Password = s.getCell(1,row).getContents();
			Setup.driver.findElement(By.id(password)).sendKeys(Password);
			Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Setup.driver.hideKeyboard();
     	}
		//Button click
		Setup.driver.findElement(By.id(loginBtn)).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		//WebElement alert= Setup.driver.findElement(By.id("android:id/button1"));
		/*Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		alert.click();
		
		Boolean flag1=true;
		try {
			flag1 = alert.isDisplayed();

		} catch (Exception e) {
			flag1 = false;
		}
		if (flag1) {
			alert.click();
			System.out.println("Login Failed");
			//onTestFailure();
			//Setup.driver.close();
		}*/
		
		//else 
			System.out.println("Login success");
		//Setup.driver.findElement(By.id("android:id/button1")).click();
	}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
	}
	
	//Run if user_login() is passed.
	/*@Test(dependsOnMethods = {"user_login"})
	public void test()
	{
		System.out.println("Test method in Login screen");
	}*/
	
		static String filePath = "D:\\SCREENSHOTS\\";
	
    public static void onTestFailure(ITestResult result) {
    	//System.out.println("***** Error "+result.getName()+" test has failed *****");
    	String methodName=result.getName().toString().trim();
    	takeScreenShot();//methodName
    }
    
    
    public  static void takeScreenShot() { //String methodName
    	//get the driver
    //	Setup.driver=TestBase.getDriver();
    	 File scrFile = ((TakesScreenshot)Setup.driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with test method name 
    	 
            try {
				FileUtils.copyFile(scrFile, new File(filePath+"1.png"));
				System.out.println("***Placed screen shot in "+filePath+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
	
}