package magento;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameters {

	protected WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@Test
	public static void test() {

	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
