Feature: Login Functionality
Background: User Successfully loggerd in 
 When user enters browser "webdriver.chrome.driver" and exe as "D:\\automation support\\chromedriver.exe"
 When user enters url as "https://www.flipkart.com/"
 
 Scenario:
 When user cancles login window
 Then user navigate to Login window and click on My Profile
 Then verify login process
