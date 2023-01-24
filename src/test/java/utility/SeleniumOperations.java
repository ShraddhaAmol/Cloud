package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static ChromeDriver d1=null;
	public static Hashtable<String, Object>output=new Hashtable<String,Object>();
	
	
	public static Hashtable<String, Object> launchBrowser(Object[] input)
	{
		try
		{
		String bname=(String)input[0];
		String exe=(String)input[1];
		System.setProperty(bname,exe);
		d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		output.put("STATUS", "PASS");
		output.put("MESSAGE", "launchBrowser"+input[0].toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
			output.put("STATUS", "FAIL");
			output.put("MEASSAGE", "launchBrowser"+input[0].toString());
		}
		return output;
	}
	
	public static Hashtable<String, Object> geturl(Object[] input)
	{
		try
		{
		String url1=(String)input[0];
		d1.manage().window().maximize();
		d1.get(url1);
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		output.put("STATUS", "PASS");
	    output.put("MESSAGE", "geturl"+input[0].toString());

		}
		catch(Exception e)
		{
			System.out.println(e);
			output.put("STATUS", "FAIL");
		output.put("MEASSAGE", "geturl"+input[0].toString());
		}
		return output;
	}
	
	public static Hashtable<String, Object> click(Object[] input)
	{
		try
		{
		String xpath1=(String)input[0];
		d1.findElementByXPath(xpath1).click();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		output.put("STATUS", "PASS");
		output.put("MESSAGE", "click"+input[0]);

		}
		catch(Exception e)
		{
			System.out.println(e);
			output.put("STATUS", "FAIL");
			output.put("MEASSAGE", "click"+input[0].toString());
		}
		return output;
	}
	public static Hashtable<String, Object> moveelement(Object []input)
	{
		try
		{
		String xpath1=(String)input[0];
		Actions act=new Actions(d1);
		WebElement e1= d1.findElementByXPath(xpath1);
		act.moveToElement(e1).build().perform();
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.click();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		output.put("STATUS", "PASS");
		output.put("MESSAGE", "moveelement"+input[0].toString());

		}
		catch(Exception e)
		{
			System.out.println(e);
			output.put("STATUS", "FAIL");
			output.put("MEASSAGE", "moveelement"+input[0].toString());
		}
		return output;
	}

	
	public static void main(String[] args)
	{
		Object [] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="D:\\automation support\\chromedriver.exe";
		SeleniumOperations.launchBrowser(input);
		
		Object i1[] =new Object[1];
		i1[0]="https://www.flipkart.com/";
		SeleniumOperations.geturl(i1);
		
		
		Object [] i2=new Object[1];
		i2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.click(i2);
	
		
		Object[]i3=new Object[1];
		i3[0]="//*[text()='Login']";
		
		SeleniumOperations.moveelement(i3);
		
		
		
		
		
		
		
		
	}
	
}
