package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends LoginLeaf{
	@Test
	public void leadcreate() 
	{
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd=new Select(source);
	dd.selectByVisibleText("Employee");
	WebElement marketCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));         
    Select mdd=new Select(marketCamp);
    mdd.selectByValue("9001");
    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));         
    Select odd=new Select(ownership);
    odd.selectByIndex(5);
    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));         
    Select coun=new Select(country);
    coun.selectByVisibleText("India");
    driver.findElement(By.name("submitButton")).click();
    driver.close();
	}
}
