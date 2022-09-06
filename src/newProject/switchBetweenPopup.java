package newProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class switchBetweenPopup {
	  public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mansur\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        String alertMessage = "";

	        driver.get("http://jsbin.com/usidix/1");
	        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	       if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
		        alertMessage = driver.switchTo().alert().getText();  
	    	   driver.switchTo().alert().accept();
	        System.out.println(alertMessage);
	        
	       };
	       driver.quit();
	       
	    }
}
