import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import utilities.Landing;


public class Registration {
	
	static String signUp=Landing.SignUp;
	static String fname=Landing.Reg_firstname;
	//static String lname=Landing.Reg_lastname;
	static String email=Landing.Reg_email;
	static String mobile=Landing.Reg_mobile;
	static String password=Landing.Reg_password;
	static String cPassword=Landing.Reg_Cpassword;
	static String login_btn=Landing.Reg_signUp_btn;
	static String datafile=Landing.data;
	
	
	@Test(priority=1)
	public static void Landing_signup()
	{
		try
		{
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		Setup.driver.findElement(By.id(signUp)).click();
		System.out.println("Tap on Signup");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public static void Signup()
	{
		try
		{
			System.out.println("Registration Screen");
			//driver.findElement(By.id(fname)).click();
			String FilePath = datafile;
			FileInputStream fs = new FileInputStream(FilePath);
			Workbook wb = Workbook.getWorkbook(fs);

			// TO get the access to the sheet
			Sheet s = wb.getSheet("Register");
			//System.out.println(" s.getRows()"+ s.getRows());
			for(int row = 1;row < s.getRows();row++)
			{
			    String FirstName = s.getCell(0,row).getContents();
			    Setup.driver.findElement(By.id(fname)).click();
			    Setup.driver.findElement(By.id(fname)).sendKeys(FirstName);

			    /*String LastName= s.getCell(1, row).getContents();
			    Setup.driver.findElement(By.id(lname)).click();
			    Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    Setup.driver.findElement(By.id(lname)).sendKeys(LastName);*/
			    
			    String Email= s.getCell(1, row).getContents();
			    Setup.driver.findElement(By.id(email)).click();
			    Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    Setup.driver.findElement(By.id(email)).sendKeys(Email);
			    
			    String Mobile= s.getCell(2, row).getContents();
			    Setup.driver.findElement(By.id(mobile)).click();
			    Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    Setup.driver.findElement(By.id(mobile)).sendKeys(Mobile);

			    String Password= s.getCell(3, row).getContents();
			    Setup.driver.findElement(By.id(password)).click();
			    Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    Setup.driver.findElement(By.id(password)).sendKeys(Password);
			    Setup.driver.hideKeyboard();
			    
			    String Cpassword= s.getCell(4, row).getContents();
			    Setup.driver.findElement(By.id(cPassword)).click();
			    Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    Setup.driver.findElement(By.id(cPassword)).sendKeys(Cpassword);
			    Setup.driver.hideKeyboard();
			    
			    Thread.sleep(1000);
			    Setup.driver.findElement(By.id(login_btn)).click();
			    Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			      
			    Setup.driver.findElement(By.id("android:id/button1"));
			    Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    Setup.driver.findElement(By.id("android:id/button1")).click();
			    System.out.println("Registration successfully completed");
			  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
