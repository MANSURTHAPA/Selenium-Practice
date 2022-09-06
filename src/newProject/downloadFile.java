package newProject;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class downloadFile {
	 public static void main(String[] args) {
	        
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mansur\\Downloads\\chromedriver_win32\\chromedriver.exe");					
         WebDriver driver = new ChromeDriver();
	                String baseUrl = "http://demo.guru99.com/test/yahoo.html";
	      

	        driver.get(baseUrl);
	        WebElement downloadButton = driver.findElement(By
	        .id("messenger-download"));
	        String sourceLocation = downloadButton.getAttribute("href");
	        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

	        try {
	        Process exec = Runtime.getRuntime().exec(wget_command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        } catch (InterruptedException | IOException ex) {
	        System.out.println(ex.toString());
	        }
	        driver.close();
	        }
}
