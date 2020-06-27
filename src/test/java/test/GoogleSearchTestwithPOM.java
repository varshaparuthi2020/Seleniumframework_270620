package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchwithactiononlocators;

public class GoogleSearchTestwithPOM {

	private static WebDriver driver = null;
	 
public static void main(String[] args) throws InterruptedException {

	googlesearch();
	
	
	
}

public static void googlesearch() throws InterruptedException{
	
WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	GoogleSearchwithactiononlocators gsp = new GoogleSearchwithactiononlocators(driver);
	gsp.textgoogle("varshaparuthi");
	gsp.textsearch();
	
	
	//GoogleSearchPage.googletextsearch(driver).submit();
	//GoogleSearchPage.googletextsearch(driver).sendKeys(Keys.RETURN);
	Thread.sleep(20);	
	
	driver.close();
	driver.quit();
	System.out.println("test done!!!");
}
}
