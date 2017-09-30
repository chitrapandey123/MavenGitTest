package WedriverTest.WedriverTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.List;		
import java.util.concurrent.TimeUnit;


public class Test1 {
	WebDriver driver;
	String baseUrl = "http://demo.guru99.com/selenium/newtours/";
			
	    @Test		
	    public void TC1() {									
	        
	    	System.setProperty("webdriver.chrome.driver","/Users/Shared/Jenkins/Home/jobs/MavenGitTest/workspace/chromedriver");					
	        driver = new ChromeDriver();					
	        		
	        String underConsTitle = "Under Construction: Mercury Tours";					
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

			driver.get(baseUrl);
			System.out.println("Testcase passes "+Thread.currentThread().getStackTrace()[1].getMethodName());
			/*
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));	

	        String[] linkTexts = new String[linkElements.size()];							
			int	i = 0;	
			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
				linkTexts[i] = e.getText();							
				i++;
			}	
			
			//test each link		
			for (String t : linkTexts) {
				
				driver.findElement(By.linkText(t)).click();		

				if (driver.getTitle().equals(underConsTitle)) {							
					System.out.println("\"" + t + "\""								
							+ " is under construction.");			
				} 
				else {
				System.out.println("\"" + t + "\""								 + " is working.");			
				}		
				driver.navigate().back();	
			}		*/		
	    }	
	    
	    @Test
	    public void TC2(){
	    	driver.get("https://www.google.com");
	    	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    	System.out.println("Testcase passes "+Thread.currentThread().getStackTrace()[1].getMethodName());
	    		
	    }
	    
	    //@AfterSuite
	    
	    public void close(){
	    	driver.quit();
	    }
	    
	    
	}


