package newProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;	
public class UploadFile {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mansur\\Downloads\\chromedriver_win32\\chromedriver.exe");					
          WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/upload/";
        
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // file path that needs to be uploaded
        uploadElement.sendKeys("C:\\test.html");

        // check the check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}
