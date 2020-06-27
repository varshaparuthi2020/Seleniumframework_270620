package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTestNGexample {

	private static WebDriver driver = null;
@BeforeTest
public static void googlesearch() throws InterruptedException{
	
WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
	
	@Test
	public void googleaction() throws InterruptedException{

		driver.get("https://www.google.com/");
		GoogleSearchPage.googletext(driver).sendKeys("varsha");
	
	GoogleSearchPage.googletextsearch(driver).submit();
	//GoogleSearchPage.googletextsearch(driver).sendKeys(Keys.RETURN);
	Thread.sleep(20);	
	}
	
@AfterTest
public void teardown(){
	driver.close();
	driver.quit();
	System.out.println("test done using tedstNG annotaions!!!");
}

	
	
	
	
}
