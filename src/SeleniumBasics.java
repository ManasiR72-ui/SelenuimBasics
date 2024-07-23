import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.WebDriver;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            //ChromeDriver driver = new ChromeDriver();
		//SafariDriver driver = new SafariDriver();
		
		//invoking browser
            WebDriver driver = new ChromeDriver();
            
            //get method - to open any link
            driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.21.0");
            
            //manage.windows
            driver.manage().window().maximize();
            
            driver.getTitle();
            String title = driver.getTitle();
            System.out.println(title);
            if (title.equals("Google")) {
            	System.out.println("Test case passed.");
            }else {
            	System.out.println("Test case is failed");
            }
            
            Thread.sleep(2000);
            
            //driver.getCurrentUrl()
            String url =  driver.getCurrentUrl();
            System.out.println(url);
            
            if (url.equals("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.21.0")) {
            	System.out.println("Test case is passed");
            }else {
            	
            	System.out.println("Test case is failed");
            }
            Thread.sleep(3000);
            
            driver.close();
	} 
           

}
