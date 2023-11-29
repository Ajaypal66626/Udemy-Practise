package UdemyPractise.UdemyPractis;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_items_into_Cart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] veg = { "Cucumber", "Cauliflower", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedname = name[0].trim();

			List veglist = Arrays.asList(veg);
			if (veglist.contains(formatedname))

			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break;
				if (j == veg.length) {
					break;
				}
			}
		}
	}
}
