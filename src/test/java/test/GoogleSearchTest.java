package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
public static void main(String[] args) throws InterruptedException {

	googlesearch();
	
	
	
}

public static void googlesearch() throws InterruptedException{
	
WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	GoogleSearchPage.googletext(driver).sendKeys("varsha");
	
	GoogleSearchPage.googletextsearch(driver).submit();
	//GoogleSearchPage.googletextsearch(driver).sendKeys(Keys.RETURN);
	Thread.sleep(20);	
	
	driver.close();
	driver.quit();
	System.out.println("test done!!!");
}
}
