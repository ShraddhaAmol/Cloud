package trial;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{
	
	
	public static void main(String[] args)
	{
		
	
	//launch browser
	System.setProperty("webdriver.chrome.driver", "D:\\automation support\\chromedriver.exe");
	
	
	//open application
	
	ChromeDriver d1=new ChromeDriver();
	
	d1.manage().window().maximize();
	d1.get("https://www.flipkart.com/");
	// cancle  login window
	
	d1.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	//navigate on login
	
	Actions act=new Actions(d1);
	WebElement e1= d1.findElementByXPath("//*[text()='Login']");
	act.moveToElement(e1).build().perform();
	
	//click on myprofile
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.click();
	}
	

}
