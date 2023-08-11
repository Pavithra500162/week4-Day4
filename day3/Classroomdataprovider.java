package week4.day3;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Classroomdataprovider extends LoginLeaf{
	@Test(dataProvider = "sendData" ,timeOut= 2000)
	public void runCreate(String cname, String fname, String lname) {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] sendData() {
		String[][] data = new String[2][3];
		data[0][0] = "Wipro";
		data[0][1] = "Pavithra";
		data[0][2] = "Shanmugam";

		data[1][0] = "Vinsinfo";
		data[1][1] = "Priya";
		data[1][2] = "Shanmugam";
		return data;

	}
}
