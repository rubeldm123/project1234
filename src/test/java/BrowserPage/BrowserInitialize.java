package BrowserPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialize {

	public static WebDriver driver;
	//pro means Properties
	public Properties pro;
	
	public WebDriver ChooseBrowser() throws IOException {
		pro= new Properties();
		
		FileInputStream f= new FileInputStream("C:\\Users\\rubel\\eclipse-workspace\\HyridFrameWork\\src\\test\\resources\\environmentVariables.properties");
		pro.load(f);
		
		String BR= pro.getProperty("browser");
		
		if(BR.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubel\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(BR.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubel\\Desktop\\chromedriver.exe");
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
}//end class
