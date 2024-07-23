import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(1000);
		
		WebElement from = driver.findElement(By.id("src"));
	    //WebElement from = driver.findElement(By.className("sc-fjdhpX cvRLz"));
		  
		System.out.println(from);
		from.sendKeys("Pune");
		
		
		try {
		
			driver.findElement(By.linkText("https://www.redbus.in/info/aboutus")).click();
			
		}catch(NoSuchElementException e) {
		System.out.println(e);
		}
//		
		driver.findElement(By.linkText("https://www.redbus.in/info/aboutus")).click();
		
         Thread.sleep(5000);
         driver.close();
		
         

	}
}
