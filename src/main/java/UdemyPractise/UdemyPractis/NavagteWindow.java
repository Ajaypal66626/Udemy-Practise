package UdemyPractise.UdemyPractis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavagteWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goggle.com");
     	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
     	driver.navigate().back();
     	driver.navigate().forward();
     	driver.close();
     	
	}

}
   