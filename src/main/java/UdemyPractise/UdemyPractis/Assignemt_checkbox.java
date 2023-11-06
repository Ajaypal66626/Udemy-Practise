package UdemyPractise.UdemyPractis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Assignemt_checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement chk=driver.findElement(By.id("checkBoxOption1"));
		//chk.click();
		
		if(!chk.isSelected()) {
			chk.click();
			System.out.println("Option-1 is Selected Successfully!");
			
		}
		else
		{
			System.out.println("Option-1 is Already Selected");
		}
		
		
		System.out.println("Check Box Selected Status :" + chk.isSelected());
		
		chk.click();
		System.out.println("Check Box Unchecked Successfully!");
		
		System.out.println("Check Box Selected Status :" + chk.isSelected());
		
////Count of the CheckBox
		
		
		//System.out.println(driver.findElements(By.xpath("(//div[@id='checkbox-example'])[1]")).size());
		
		
		List<WebElement> chk_count=(List<WebElement>) driver.findElements(By.xpath("(//div[@id='checkbox-example'])[1]"));
	    int count =chk_count.size();
		System.out.println("Check Box count is :" + count);
		
	}
}
