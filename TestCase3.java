package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
		 //Creating lead
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meena");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		 WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select ddValue = new Select(dd);
		 ddValue.selectByVisibleText("Other");
        //Marketing Campaing Drop Down
		 WebElement markCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select mc = new Select(markCamp);
         mc.selectByVisibleText("Road and Track");
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Meena");
         driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bala");
         driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
         driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/14/90");
         driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/14/90");
         driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Comp.Sci");
         driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10,00,000");
         
         WebElement dd1 = driver.findElement(By.id("createLeadForm_currencyUomId"));
         Select dd2=new Select(dd1);
         dd2.selectByVisibleText("INR - Indian Rupee");
         
         WebElement dd3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
         Select dd4=new Select(dd3);
         dd4.selectByValue("IND_SOFTWARE");
	
         driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100000");
         
         WebElement dd5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
         Select dd6 = new Select(dd5);
         dd6.selectByVisibleText("Corporation");
	
         driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("001");
         driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yes");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning");
         driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
         driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
         driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
         driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8939631938");
         driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
         driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Meena");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("meenabala1712@gmail.com");
         driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
         driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("MeenaBala");
         driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Meena");
         driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 7, Jeeva Lane");
         driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Guduvanchery");
         driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
         driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603202");
         driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("603202");
         
         WebElement dd7 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         Select dd8=new Select(dd7);
         dd8.selectByVisibleText("New York");
         
         WebElement dd9 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
         Select dd10 = new Select(dd9);
         dd10.selectByVisibleText("India");
	
         driver.findElement(By.className("smallSubmit")).click();
         
         driver.close();
	
	}

}
