package appTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Product;

public class CheckProduct {

	WebDriver driver;
	BaseClass base=new BaseClass();
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url=BaseClass.getUrl();
		driver.get(url);
	}

	@Test
	public void testProduct() {
		Product product=new Product(driver);
		product.typeProduct();
		String TitleExpected="Redmi - Buy Redmi online in India";
		String TitleActual=driver.getTitle();
		Assert.assertEquals(TitleActual, TitleExpected,"Product is not displaying");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}