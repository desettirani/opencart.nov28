package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	//locators
	
     By logo_img	=By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/img");
     By txt_username=By.name("username");
      By txt_password=By.name("password"); 
      By btn_submit=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

//Action method 
    public void setusername(String username) {
    	
    	driver.findElement(txt_username).sendKeys("username");
    	
    }
    public void setpassword(String password) {
    	
    	
    	driver.findElement(txt_password).sendKeys("passwoord");
    }
    
    public void clicksubmit() {
    	driver.findElement(btn_submit).click();
		
    	
    }
    public boolean check() {
    	
  boolean status  =driver.findElement(logo_img).isDisplayed();
    return status;
    }
    
}