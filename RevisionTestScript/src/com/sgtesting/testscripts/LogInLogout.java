package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInLogout {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lunchBrowser();
		navigateURL();
		login();
		 minimizeFlyOutWindow();
		creatUser1();
		creatUser2();
		creatUser3();
		 logout();
		 loginasUser1();
		 closingVedio();
		 logout1();
		 loginasUser2();
		 logout2();
		 loginasUser3();
		 logout3();
		 adminlogin();
	}
	static void lunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void creatUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("sharath");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
			oBrowser.findElement(By.name("email")).sendKeys("getsharathss@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Arpitha");
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}
	static void creatUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
			oBrowser.findElement(By.name("email")).sendKeys("getsharath@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("abi");
			oBrowser.findElement(By.name("password")).sendKeys("12345");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}
	static void creatUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.name("lastName")).sendKeys("mmm");
			oBrowser.findElement(By.name("email")).sendKeys("getsharu@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("u3");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void loginasUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Arpitha");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void closingVedio()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
}catch(Exception e)
		{
	System.out.println(e);
		}
}
	static void logout1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("u2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void logout2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("u2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void logout3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void adminlogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	 
	 
}

