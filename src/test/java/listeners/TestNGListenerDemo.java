package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1(){
		
		System.out.println("I am inside test1");
	}
	@Test
public void test2() throws Exception{
		
		System.out.println("I am inside test2");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hello guyzzz");
		Thread.sleep(2000);
		driver.close();
	}
@Test
public void test3() {
	System.out.println("I am inside test3");
	throw new SkipException("Skip thois test...");
}
}
