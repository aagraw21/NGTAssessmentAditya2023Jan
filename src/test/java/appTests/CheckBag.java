package appTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Bag;
import PageObjects.Product;

public class CheckBag {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url=BaseClass.getUrl();
		driver.get("https://www.myntra.com/login/password");
	}

	@Test
	public void testBag() throws Exception {
		Bag bag=new Bag(driver);
		bag.login();
		bag.addToCart();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		Thread.sleep(10000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[.='Unisex Lunar Backpack']")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
