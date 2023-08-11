package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class LoginLeaf {
	public RemoteWebDriver driver;
	@BeforeMethod
	@Parameters({"url","uname","password","browser"})
	
	public void login(String url,String uname,String password,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
			{
			driver=new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);;
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
}
