package sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SampleProjectExecution {

	@Parameters({ "browser" })
	@Test
	public void launchGmail(String browser){
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://mycase2-stage.cloudapps.cisco.com/case");
				driver.findElement(By.id("userInput")).sendKeys("charhall");
				driver.findElement(By.id("passwordInput")).sendKeys("welcome");
				driver.findElement(By.id("login-button")).click();
				
				
				
			}
			else if(browser.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
				DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
				capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);				
				WebDriver driver = new InternetExplorerDriver(capability);					
				driver.get("https://mycase2-stage.cloudapps.cisco.com/case");
				driver.findElement(By.id("userInput")).sendKeys("charhall");
				driver.findElement(By.id("passwordInput")).sendKeys("welcome");
				driver.findElement(By.id("login-button")).click();
				
				
			}
			else if(browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://mycase2-stage.cloudapps.cisco.com/case");
				driver.findElement(By.id("userInput")).sendKeys("charhall");
				driver.findElement(By.id("passwordInput")).sendKeys("welcome");
				driver.findElement(By.id("login-button")).click();
				
				
			}
		}
			catch(Exception e){
				System.out.println(e);
			}
		
		
		
	}
	
	
}
