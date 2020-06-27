package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchwithactiononlocators {

	
	
	By txtingoogle= By.name("q");
	By txtsearchbox =By.name("btnK");
	
	WebDriver driver = null;
	
	public GoogleSearchwithactiononlocators(WebDriver driver){
		
		this.driver=driver;
	}
	public WebElement textgoogle(String text)
{
		WebElement elm=driver.findElement(txtingoogle);
	elm.sendKeys(text);
	return elm;
		

}
	
	public WebElement textsearch()
	{
			WebElement elm=driver.findElement(txtsearchbox);
		elm.submit();
		return elm;
			

	}
}
