package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().window().maximize();
		 
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("meenabala1712@gmail.com");
	
		 WebElement append = driver.findElement(By.xpath("//input[contains(@value,'Append')]"));
		 append.sendKeys("Meena",Keys.TAB);
		 
		 String text1 = driver.findElement(By.name("username")).getAttribute("value");
		 System.out.println(text1);
		 
		 WebElement clean = driver.findElement(By.xpath("//input[contains(@value,'Clear me!!')]"));
		 clean.clear();
	
		 boolean enabled = driver.findElement(By.xpath("//input[contains(@disabled,'true')]")).isEnabled();
		 System.out.println(enabled);
	}

}
