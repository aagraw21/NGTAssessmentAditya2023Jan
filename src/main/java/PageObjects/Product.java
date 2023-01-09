package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Product {
	public WebDriver driver;
	
	public Product(WebDriver driver) {
		this.driver = driver;
	}

	public void typeProduct() {
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Redmi");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	}

	public void verifyProduct() {
		String TitleExpected="Redmi - Buy Redmi online in India";
		String TitleActual=driver.getTitle();
		Assert.assertEquals(TitleActual, TitleExpected,"Product is not displaying");
		
	}
}
