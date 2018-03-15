package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckInOutElement {
	
WebDriver driver;   //diclar driver
	
	//create constractor
	
	public  CheckInOutElement(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	
	}//end constructor

	@FindBy(how=How.XPATH, using =("\".//*[@id='checkInDate_display']\""))
	@CacheLookup
	WebElement ck;
	public WebElement checkIn() {
		return ck;
	}
	
	@FindBy(how=How.XPATH, using =("//*[@id=\"3_21_2018\"]/div/span"))
	@CacheLookup
	WebElement IN;
	public WebElement InDate() {
		return IN;
	}
	
	
	@FindBy(how=How.XPATH, using =("//*[@id=\"3_22_2018\"]/div/span"))
	@CacheLookup
	WebElement Out;
	public WebElement OutDate() {
		return Out;
	}
	
	
	@FindBy(how=How.XPATH, using =(".//*[@id='qqForm_childCount']/button[2]"))
	@CacheLookup
	WebElement NA;
	public WebElement NumberOfAdult() {
		return NA;
	}
	
	
	
	
	
	
	
	

}//end class
