package Function;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserPage.BrowserInitialize;
import PageFactory.CheckInOutElement;

public class CheckInOutPage extends  BrowserInitialize{
	public CheckInOutElement ci=new CheckInOutElement(driver);

@BeforeTest
	//InitializeBrowser
	public void OpenBrowser() throws IOException {
		driver=  ChooseBrowser();
		driver.get("https://disneyworld.disney.go.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}


@Test()	

	public void ChekIn() throws InterruptedException {
	
ci.checkIn().click();
ci.InDate().click();
ci.OutDate().click();
	
	

	

	/*Thread.sleep(3000);
    
    driver.findElement(By.xpath(".//*[@id='qqForm_childCount']/button[2]")).click();
    
    
    driver.findElement(By.xpath(".//*[@id='partyMixSelectChildAge1']/div/div/wdpr-uiplus-select-box/ol/button")).click();
    driver.findElement(By.xpath(".//*[@id='partyMixSelectChildAge1']/div/div/wdpr-uiplus-select-box/ol/div/ul/li[7]/a/div/span")).click();
    driver.findElement(By.xpath(".//*[@id='qqForm_childCount']/button[2]")).click();
    
    driver.findElement(By.xpath(".//*[@id='partyMixSelectChildAge2']/div/div/wdpr-uiplus-select-box/ol/button")).click();
    driver.findElement(By.xpath(".//*[@id='partyMixSelectChildAge2']/div/div/wdpr-uiplus-select-box/ol/div/ul/li[14]/a/div")).click();
    
    
    driver.findElement(By.xpath(".//*[@id='selectDestination']/ol/button")).click();
    driver.findElement(By.xpath("//*[@id=\"selectDestination\"]/ol/div/ul/li[1]/a/div/span")).click();
    driver.findElement(By.xpath("//*[@id=\"findPricesButton\"]")).click();
    
    
    
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("window.scrollTo(0,500)");
*/
}
		
	


	
	
	

}//end class
