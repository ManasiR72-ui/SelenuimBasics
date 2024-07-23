import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/trains/rctc-to-pune-trains/#all");
        
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        
       // WebElement from = driver.findElement(By.id("src"));
        WebElement from = driver.findElement(By.className("modify-header searchOuter"));
        
        System.out.println(from);
		
       from.sendKeys("Mumbai");
		

	}

}
