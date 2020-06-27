import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String args[]){
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		//*****if not want to download drivers of chrome/ff/ie then download webdriver manager depnendency from maven
		//and use below command
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println("First test");
		driver.close();
}
}
