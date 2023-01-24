package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login
{
	
	@When("^user enters browser \"([^\"]*)\" and exe as \"([^\"]*)\"$")
	public void user_enters_browser_and_exe_as(String arg1, String arg2) throws Throwable
	{
		Object [] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="D:\\automation support\\chromedriver.exe";
		Hashtable<String,Object>o=SeleniumOperations.launchBrowser(input);
	   
	}

	@When("^user enters url as \"([^\"]*)\"$")
	public void user_enters_url_as(String arg1) throws Throwable
	{
		Object i1[] =new Object[1];
		i1[0]="https://www.flipkart.com/";
		Hashtable<String,Object>o1=SeleniumOperations.geturl(i1);
	    
	   
	}
	

	@When("^user cancles login window$")
	public void user_cancles_login_window() throws Throwable
	{
		Object [] i2=new Object[1];
		i2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object>o2=SeleniumOperations.click(i2);
		HTMLReportGenerator.StepDetails(o2.get("STATUS").toString(), "^user cancles login window$", o2.get("MESSAGE").toString());
	    
	}
	
	@Then("^user navigate to Login window and click on My Profile$")
	public void user_navigate_to_Login_window_and_click_on_My_Profile() throws Throwable
	{
		Object[]i3=new Object[1];
		i3[0]="//*[text()='Login']";
		Hashtable<String,Object>o3=SeleniumOperations.moveelement(i3);    
		HTMLReportGenerator.StepDetails(o3.get("STATUS").toString(), "^user navigate to Login window and click on My Profile$", o3.get("MESSAGE").toString());
	
	}


	


}
