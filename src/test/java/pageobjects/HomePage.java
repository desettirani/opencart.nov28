package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//elements
	@FindBy(xpath="//span[text()='My Account']")
	WebElement inkMyaccount;
	
    @FindBy(linkText="Register")
    WebElement inkRegister;
    
    @FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a")
    WebElement linklogin;
    //Action Methods
    public void ClickMyAccount() {
    	inkMyaccount.click();
    	
    }
    
    public void ClickRegister() {
    	inkRegister.click();
    	
    }
    
    public void ClickLogin() {
    	linklogin.click();
    	
    }
    
    
}
