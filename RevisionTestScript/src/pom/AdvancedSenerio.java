package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSenerio {

	
	public static WebDriver oBrowser=null;
	public static  LogInLogout oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logIn();
		flyoutwindow();
		creatuser();
		
	}	
	
	static void launchBrowser()
	{
		try
		{	
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new LogInLogout(oBrowser);
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void logIn()
	{
		try {
		oPage. getUserName().sendKeys("admin");
		oPage. getpassword().sendKeys("manager");
		oPage.getLogin().click();
		Thread.sleep(5000);
	}catch(Exception e)
		{
		System.out.println(e);
		}
}
     static void flyoutwindow()
     {
    	try
    	{
    		oPage.getflyoutwindow().click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
     }
     static void creatuser()
     {
    	 try {
    		 oPage.getUsersbtn().click();
    		 oPage. getadduserbtn().click();
    		 Thread.sleep(4000);
    		 
    		 oPage.getfirstName().sendKeys("sharath");
    		 oPage. getlastname().sendKeys("arpitha");
    		 oPage.getemail().sendKeys("getsharath@gmail.com");
    		 oPage. getusernameOfuser().sendKeys("arpi");
    		 oPage.getpassword2().sendKeys("1234");
    		 oPage.getpasswordcopy().sendKeys("1234");
    		 oPage.getcreatuser().click();
    		 Thread.sleep(4000);
    		 
    	 }catch(Exception e)
    	 {
    		System.out.println(e); 
    	 }
     }
     
}
