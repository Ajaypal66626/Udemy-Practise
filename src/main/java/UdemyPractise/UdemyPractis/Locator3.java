package UdemyPractise.UdemyPractis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win32\\chromedriver.exe");
    WebDriver driver=new  ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    //Sibling- Parent child to Sibling Child Traverse
    System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
    // Traverse Child to Parent
    //     driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header"));

	}

} 
