package UdemyPractise.UdemyPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Checkbox_get_size {
public static void main(String[] args) throws InterruptedException {
	//// In this Practice Program we looking how to handle Check Box and Getting the Size of the Check Box
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
	System.out.println(driver.findElement(By.cssSelector("[id=ctl00_mainContent_IndArm]")).isSelected());
	driver.findElement(By.cssSelector("[id=ctl00_mainContent_IndArm]")).click();
	System.out.println(driver.findElement(By.cssSelector("[id=ctl00_mainContent_IndArm]")).isSelected());
   
	//System.out.println(driver.findElement(By.cssSelector("input[type=checkbox]")).getSize());
	System.out.println("Count is: " + (driver.findElements(By.xpath("//div[@class='row1 padding-bottom-3 home-dis-checkboxes']")).size()));
	////In this Code have some error
	driver.quit();
}
}
