package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInLogout {

	public LogInLogout(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
		//Webelement user name text field
			private WebElement username;
			public WebElement getUserName() {
				return username;
			}
			//Webelement user name text field
			private WebElement pwd;
			public WebElement getpassword() {
				return pwd;
			}
			//webelment for login button
			@FindBy(xpath="//div[text()='Login ']")
			private WebElement oLogin;
			public WebElement getLogin()
			{
				return oLogin;
            }
			//webelment for flyoutwindow
			private WebElement gettingStartedShortcutsPanelId;
			public WebElement getflyoutwindow()
			{
				return  gettingStartedShortcutsPanelId;
			}
			//webelement for userlabale
			@FindBy(xpath="//div[text()='USERS']")
			private WebElement objUsersbtn;
			public WebElement getUsersbtn()
			{
				return objUsersbtn;
			}
			//webelement for adduser
			@FindBy(xpath="//div[text()='Add User']")
			private WebElement objadduserbtn;
			public WebElement getadduserbtn()
			{
				return  objadduserbtn;
			}
			//webelement for firstname
			private WebElement firstName;
			public WebElement getfirstName()
			{
				return firstName;
			}
			//webelement for lastname
			private WebElement lastName;
			public WebElement getlastname()
			{
				return lastName;
			}
			//webelement for email
			private WebElement email;
			public WebElement getemail()
			{
				return email;
			}
			//webelment for user is already exist
			@FindBy(xpath="//input[@name='username']")
			private WebElement objusername;
			public WebElement getusernameOfuser()
			{
				return objusername;
			}
			//webelement for password
			private WebElement password;
			public WebElement getpassword2()
			{
				return password;
			}
			//webelement for retype password
			private WebElement passwordCopy;
			public WebElement getpasswordcopy()
			{
				return passwordCopy;
			}
			//webelement for creat user
			@FindBy(xpath="//span[text()='Create User']")
			private WebElement creatuser;
			public WebElement getcreatuser()
			{
				return creatuser;
			}
			//webelement for logout
			@FindBy(xpath="//a[text()='Logout']")
			private WebElement logout;
			public WebElement getlogout()
			{
				return logout;
		}
			//WebElement for userselect
			@FindBy(xpath="//div[@class='name']//span[text()='arpitha, sharath']")
			private WebElement modifybtn;
			public WebElement getmodifybtn()
			{
				return modifybtn;
			}
			
			//webelement for delet user
			@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
			private WebElement deletebtn;
			public WebElement getdeletebtn()
			{
				return deletebtn;
			}
			//webelement for modify user
			
         }

		
	


