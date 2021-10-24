import org.openqa.selenium.chrome.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
public class Fisrt {
	
	public static void main(String arg[]) throws IOException {
		
	       // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        String url = "https://www.google.co.in/";
        driver.get(url);

		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image,new File("D:\\Eclipse\\googless.png"));
	
	}
	
}
