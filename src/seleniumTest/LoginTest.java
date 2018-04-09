package seleniumTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.*;
class LoginTest {
	 static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mohamadobaid97@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("0595435135");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();

	}

}
