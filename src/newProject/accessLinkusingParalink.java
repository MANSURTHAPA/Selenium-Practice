package newProject;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	
public class accessLinkusingParalink {
	   public static void main(String[] args) {									
	        String baseUrl = "http://demo.guru99.com/test/accessing-link.html";					
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mansur\\Downloads\\chromedriver_win32\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        driver.get(baseUrl);					
	        driver.findElement(By.partialLinkText("here")).click();					
	        System.out.println("Title of page is: " + driver.getTitle());							
	        driver.quit();			
	    }	
}
