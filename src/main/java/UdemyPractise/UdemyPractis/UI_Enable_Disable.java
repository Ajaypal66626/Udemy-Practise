package UdemyPractise.UdemyPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class UI_Enable_Disable {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
/*	
 ///In this Code Second calendar are disable, when user click on the Double trip then it is enable, But the issue of this New UI When click on the Calendar then it is enable.
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	*/
	
	// Try out with different Logic, for above issue, Using get attribute.
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
    if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
    {
    	System.out.println("It is Enable: ");
    	Assert.assertTrue(true);
    }
	
    else
    {
    	System.out.println("It is Disable: ");
    	Assert.assertTrue(false);
    }
        driver.quit();
}
}
