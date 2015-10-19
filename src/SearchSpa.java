import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.Landing;

public class SearchSpa {

	static String search_txt= Landing.Search_txt;
	static String back_btn= Landing.Back_btn;
	static String detail_Searchtxt=Landing.Details_search;
	static String spaname=Landing.spa;
	static String servicelink=Landing.Service_link;
	static String stafflink=Landing.Staff_link;
	static String ratelink=Landing.Rate_link;
	static String servicename=Landing.Service_name;
	static String service=Landing.Service;
	static String date_btn=Landing.Date_btn;
	static String sel_Service_btn=Landing.SelService_btn;
	static String sel_Time_btn=Landing.SelTime_btn;
	static String sel_Date_btn=Landing.SelDate_btn;
	static String sel_Book_btn=Landing.SelBookApp_btn;
	static String time_sel=Landing.Time_sel;
	
	
	@Test(priority=1)
	public static void search() throws InterruptedException { 
		System.out.println("tap search");
		Setup.driver.findElement(By.id(search_txt)).click();
		
		//Setup.driver.findElement(By.id(detail_Searchtxt)).click();
		//Setup.driver.findElement(By.id(back_btn)).click();
//		Thread.sleep(1000);
//		System.out.println("tap back");
	}
	
	@Test(priority=2)
	public static void Product_Sel() throws InterruptedException 
		{
		 System.out.println("Product selection");
	//	 Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 WebDriverWait wait = new WebDriverWait(Setup.driver, 30);
		 wait.until(ExpectedConditions.textToBePresentInElement(By.id("com.popcorn.unicorn:id/online_booking"), "Online Booking"));
		 
		 System.out.println("Product selection111");
		  Setup.driver.findElement(By.name(spaname)).sendKeys(Keys.ENTER);
		 Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
		
		 
/*     //Dynamic
		 System.out.println("Product selection");
		 Setup.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Setup.driver.findElement(By.id("com.popcorn.unicorn:id/card_listView")).click();
			Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			List<WebElement> products = Setup.driver.findElements(By.className("android.widget.RelativeLayout"));
				 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			        System.out.println("countlist : " + products.size());*/
			       	
			        /*        List<WebElement> Staff = Setup.driver.findElements(By.className("android.widget.TextView"));
					 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				        System.out.println("countlist : " + Staff.size());
				        int option=0;
				        double RandomValue =(Math.random()*100)% Staff.size();
				        long RoundValue =(Math.round(RandomValue)*100)% Staff.size();
				        
				        if ( option <= Staff.size()) {
				        	
				        	System.out.println( "value : "+RandomValue);
				        	System.out.println( "Round  : "+RoundValue);
				        	
				        	Staff.get((int) RoundValue).click();
				        	
				        } else {
				            throw new NotFoundException("option " + option + " not found");
				        }*/
			
		// working
//		 Setup.driver.findElement(By.id(servicelink)).click();
//		  Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		 Setup.driver.navigate().back();
//		 
		 
		/*Boolean flag=false;
		try {
			flag = Setup.driver.findElement(By.id("android:id/button1")).isDisplayed();

		} catch (Exception e) {
			flag = false;
		}
		if (flag) {
			Setup.driver.findElement(By.id("android:id/button1")).click();
		}
		else*/

		/*Setup.driver.findElement(By.id(stafflink)).click();
		 Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					//Setup.driver.navigate().to(URL);
				 ((JavascriptExecutor) Setup.driver)
		         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		*/
		 
		//Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
	
		
		/*	Boolean flag1=false;
		try {
			flag1 = Setup.driver.findElement(By.id("android:id/button1")).isDisplayed();

		} catch (Exception e) {
			flag1 = false;
		}
		if (flag1) {
			Setup.driver.findElement(By.id("android:id/button1")).click();
		}
		else*/
	
		//Rating Screen
//		 Setup.driver.findElement(By.id(ratelink)).click();
//		 Setup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		 
//		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/ratingBar")).click();;
//		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/review_etxt")).click();
//		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/review_etxt")).sendKeys("Its Good...");
//		Setup.driver.hideKeyboard();
//		 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/submit_img_view")).click();
//		Setup.driver.findElement(By.id("android:id/button1")).click();
//		Setup.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		// System.out.println(rating.size());
		//Setup.driver.findElement(By.className("android.widget.ImageButton")).click();
		System.out.println("Viewing the details ");
		Setup.driver.findElement(By.name(sel_Service_btn)).click();
		}
	
	@Test(priority=3)
	public static void Service_sel() throws InterruptedException 
		{
		/*System.out.println("Service selection");
		Setup.driver.findElement(By.id(servicename)).click();
		 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.name(service)).click();
		Setup.driver.findElement(By.name(sel_Date_btn)).click();
		
		*/
		
		//Dynamic
		System.out.println("Service selection");
		 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/services_list")).click();
		 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 List<WebElement> MainService =Setup.driver.findElements(By.className("android.widget.RelativeLayout"));
		 System.out.println("Service selection1111");
				 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        System.out.println("countlist : " + MainService.size());
	        int option1=1;
	        double ServiceRandomValue =(Math.random()*100)% MainService.size();
	        long ServiceRoundValue =(Math.round(ServiceRandomValue)*100)% MainService.size();
	        
	        if ( option1 <= MainService.size()) {
	        	
	        	System.out.println( "Service value : "+ServiceRandomValue);
	        	System.out.println( "Service Round  : "+ServiceRoundValue);
	        	
	        	MainService.get((int) ServiceRoundValue).click();
	        	
	        } else {
	            throw new NotFoundException("option " + option1 + " not found");
	        }
		
		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*List<WebElement> time = Setup.driver.findElements(By.className("android.widget.TextView"));
			 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        System.out.println("countlist : " + time.size());
		     */  	
		        List<WebElement> Servicelist = Setup.driver.findElements(By.id("com.popcorn.unicorn:id/services_sticky_layout"));
				 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			        System.out.println("countlist : " + Servicelist.size());
			        int option=1;
			        double RandomValue =(Math.random()*100)% Servicelist.size();
			        long RoundValue =(Math.round(RandomValue)*100)% Servicelist.size();
			        
			        if ( option <= Servicelist.size()) {
			        	
			        	System.out.println( "Service value : "+RandomValue);
			        	System.out.println( "Service Round  : "+RoundValue);
			        	
			        	Servicelist.get((int) RoundValue).click();
			        	
			        } else {
			            throw new NotFoundException("option " + option + " not found");
			        }
			        Setup.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			        Setup.driver.findElement(By.name(sel_Date_btn)).click();
		
		}
		
	/*@Test(priority=4)
	public static void Date_sel() throws InterruptedException 
		{
		System.out.println("Date selection");
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/nextMonth")).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/nextMonth")).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id(date_btn)).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.name("10")).click();
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/footer_name_txt_view")).click();
		}
	@Test(priority=5)
	public static void Staff_sel() throws InterruptedException 
		{
		System.out.println("Staff selection");
//		Setup.driver.findElement(By.className("android.widget.RelativeLayout")).click();
//		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Setup.driver.findElement(By.name("PRERNA")).click();
		Setup.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Setup.driver.findElement(By.name(sel_Time_btn)).click();
		
		
		
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/staff_sticky_list_view")).click();
		
		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> time = Setup.driver.findElements(By.className("android.widget.TextView"));
			 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        System.out.println("countlist : " + time.size());
		       	
		        List<WebElement> Staff = Setup.driver.findElements(By.id("com.popcorn.unicorn:id/row_staff_main_layout"));
				 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			        System.out.println("countlist : " + Staff.size());
			        int option=0;
			        double RandomValue =(Math.random()*100)% Staff.size();
			        long RoundValue =(Math.round(RandomValue)*100)% Staff.size();
			        
			        if ( option <= Staff.size()) {
			        	
			        	System.out.println( "Stafe value : "+RandomValue);
			        	System.out.println( "Round  : "+RoundValue);
			        	
			        	Staff.get((int) RoundValue).click();
			        	
			        } else {
			            throw new NotFoundException("option " + option + " not found");
			        }
			        Setup.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					Setup.driver.findElement(By.name(sel_Time_btn)).click();
		
		}
	@Test(priority=6)
	public static void Time_sel() throws InterruptedException 
		{
		System.out.println("Time selection");
		Setup.driver.findElement(By.id(time_sel)).click();
		//Setup.driver.findElement(By.className("android.widget.LinearLayout")).click();
		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	//	Setup.driver.findElement(By.name("01:00 pm")).click();
		
		//
		//List<WebElement> time= Setup.driver.findElement(By.id(time_sel));
		
		List<WebElement> timelist = Setup.driver.findElements(By.className("android.widget.ListView"));
		 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        System.out.println("countlist : " + timelist.size());
	       	
//	        List<WebElement> timefields = Setup.driver.findElements(By.className("android.widget.TextView"));
//			 Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		        System.out.println("countlist : " + timefields.size());
		        int option=1;
		        double RandomValue =(Math.random()*100)% timelist.size();
		        long RoundValue =(Math.round(RandomValue)*100)% timelist.size();
		        
		        if ( option <= timelist.size()) {
		        	
		        	System.out.println( "value : "+RandomValue);
		        	System.out.println( "Round  : "+RoundValue);
		        	
		        	timelist.get((int) RoundValue).click();
		        	
		        } else {
		            throw new NotFoundException("option " + option + " not found");
		        }
		        
		        if ( option <= timefields.size()) {
		        	timefields.get(6).click();
		        	//System.out.println("Clicked :" + timefields.get(1));
		        	
		        	System.out.println( "value : "+number);
		        	
		        } else {
		            throw new NotFoundException("option " + option + " not found");
		        }
		        
		        
		        WebElement Booktest=Setup.driver.findElement(By.name("Other User already booked this service for same date :2015-10-08."));
		        if(Booktest.isDisplayed())
		        {
		        	Setup.driver.findElement(By.id("android:id/button1")).click();
		        	timefields.get(1).click();
		        	System.out.println("Clicked :" + timefields.get(1));
		        }
		        else
		        	  
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Setup.driver.findElement(By.name(sel_Book_btn)).click();
		}
	*/
/*	@Test(priority=7)
	public static void Book() throws InterruptedException 
		{
		//Coment
		System.out.println("Book Appointment");
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
	@Test(priority=8)
	public static void Book_Details() throws InterruptedException 
		{
		System.out.println("Details Book screen");
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement paynow=Setup.driver.findElement(By.id("com.popcorn.unicorn:id/pay_now_txt_view"));
		scrollTo(Setup.driver, paynow);
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/pay_now_txt_view")).click();;
		Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement alert= Setup.driver.findElement(By.id("android:id/button1"));
		Setup.driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		alert.click();
		System.out.println("Booking successfull...!");
		}

	private static void scrollTo(AppiumDriver driver, WebElement paynow) {
		// TODO Auto-generated method stub
		
	}*/
	
	
	/*@Test(priority=8)
	public void scrollingToBottomofAPage() {
		//Setup.driver.navigate().to(URL);
		 ((JavascriptExecutor) Setup.driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}*/
	
	/*public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }*/
	
	/*@Test(priority=1)
	public static void search1() throws InterruptedException {
		
		System.out.println("tap search");
		int option=0;
		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Trends(Setup.driver,option);
		Trends(Setup.driver,option);
	}
	public static void Trends(AppiumDriver driver, int option) { 
		System.out.println("Trends");
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement trend= Setup.driver.findElement(By.id("com.popcorn.unicorn:id/trend_search_layout"));
		if(trend.isDisplayed())
		{
			trend.click();
		Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//com.popcorn.unicorn:id/tag_group
        List<WebElement> trenditem = driver.findElements(By.className("android.widget.LinearLayout"));
        Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("count" + trenditem.size());
        Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // if (option >= 0 && option <= trenditem.size()) {
        	trenditem.get(0).click();
        	System.out.println("Clicked : ");
        } else {
            throw new NotFoundException("option " + option + " not found");
        }
    }*/
	/*@Test(priority=2)
	public static void Product_Sel() throws InterruptedException {
	
		System.out.println("Product selection");
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/list_item_layout")).click();
		System.out.println(Setup.driver.findElement(By.id("com.popcorn.unicorn:id/spa_name_text_view")));
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/services_layout")).click();
		WebElement alert= Setup.driver.findElement(By.id("android:id/button1"));
		if(alert.isDisplayed())
		{
			Setup.driver.findElement(By.id("android:id/button1")).click();
		}
		else
			Setup.driver.navigate().back();
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/services_layout")).click();
		if(alert.isDisplayed())
		{
			Setup.driver.findElement(By.id("android:id/button1")).click();
		}
		else
		
		Setup.driver.navigate().back();
		Setup.driver.findElement(By.id("com.popcorn.unicorn:id/rate_it_layout")).click();
		if(alert.isDisplayed())
		{
			Setup.driver.findElement(By.id("android:id/button1")).click();
		}
		else
		Setup.driver.navigate().back();
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Viewing the details ");
		Setup.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		JavascriptExecutor jse = (JavascriptExecutor)Setup.driver;
//		jse.executeScript("scroll(0, 400)"); //y value '250' can be altered
		//Setup.driver.scrollToExact("Reviews");
		Setup.driver.findElement(By.name("SELECT SERVICE")).click();
		
	}
*/
	
	
}
