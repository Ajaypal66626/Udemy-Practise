package UdemyPractise.UdemyPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Dyanmic_UI_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000);
		
		//By this line the code will not be execute bcoz system will confuse by this xpath ("//a[@value='CCU']"), this is same for Departure Selector UI.
		//driver.findElement(By.xpath("//a[@value='CCU']")).click();
		
		driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		
		
		// parent Child locator relationship xpath
		// This code is different type and Standard format for select dynamic dropdown 
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXJ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='VTZ']")).click();
		
	}
}
