package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Dropdown.html");
		 driver.manage().window().maximize();
		 WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		 Select dd1 = new Select(dropdown1);
		 dd1.selectByIndex(1);
		 
		 WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		 Select dd2 = new Select(dropdown2);
		 dd2.selectByVisibleText("Selenium");
		 
		 WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		 Select dd3 = new Select(dropdown3);
		 dd3.selectByValue("1");		 
		 
		 WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		 Select dd4 = new Select(dropdown4);
		int size = dd4.getOptions().size();
		System.out.println(size);
		
		WebElement dropdown5 = driver.findElement(By.xpath("//div[@class='example'][5]/select"));
		dropdown5.sendKeys("Selenium");
		

		WebElement dropdown6 = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		dropdown6.sendKeys("Selenium");
	
		

	}

}
