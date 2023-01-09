package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseClass;

public class Bag {
	public WebDriver driver;

	public Bag(WebDriver driver) {
		this.driver = driver;
	}

	public void login() throws Exception {

		driver.findElement(By.xpath("//input[@id='mobileNumberPass']")).sendKeys(BaseClass.getEmail());

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys(BaseClass.getPassword());

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();

		Thread.sleep(4000);
//
//		driver.findElement(By.xpath("//button[@class='btn primary lg block submitButton']")).click();
//
//		Thread.sleep(3000);

	}

	public void addToCart() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Unisex lunar backpack");
		 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
	      driver.findElement(By.xpath("//img[@alt='Wildcraft Unisex Lunar Backpack']")).click();
	      Thread.sleep(4000);
	      for(String winHandle : driver.getWindowHandles()){
	    	    driver.switchTo().window(winHandle);
	    	}
	      driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();

	}

	public void verifyCart() {

	}
}
