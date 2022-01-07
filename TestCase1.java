package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		//Enter user Name and created a reference in next line		 
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("DemoCSR");
		 
		 //Enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Clicking on Login Button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Clicking on the CRM/SFA link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //clicking on Contacts Tab
		 driver.findElement(By.linkText("Contacts")).click();
		 
		 //Clicking on Create Contact option
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		 //entering the first name and Printing First Name
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Meena");
		String fname =firstName.getText();
		System.out.println(fname);
		
		//last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Bala");;
		
		//click on create contact
		driver.findElement(By.name("submitButton")).click();
	
		//closing the Browser 
		driver.close();
	}

}
