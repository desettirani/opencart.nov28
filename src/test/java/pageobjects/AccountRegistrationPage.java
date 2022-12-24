package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(name="firstname")
	WebElement txt_fristname;

	@FindBy(id="input-lastname")
	WebElement txt_lastname;

	
	@FindBy(name="email")
	WebElement txt_Email;

	
	@FindBy(name="password")
	WebElement txt_Password;
	
	
	@FindBy(name="agree")
	WebElement chkpolicy;
	
	@FindBy(xpath="//*[text()='Continue']")
	WebElement btnCountinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	
	
	public void setFristName(String fname) {
		txt_fristname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txt_lastname.sendKeys(lname);
	}
	
	public void setemail(String email) {
		 txt_Email.sendKeys(email);
	}
	
	
	
	public void setpassword(String password) {
		txt_Password.sendKeys(password);
	}
	
	public void chkpolicy() {
		/*
		 * chkpolicy.click(); Actions actions = new Actions(driver);
		 * actions.moveToElement(chkpolicy).build().perform();
		 * System.out.println("asd");
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", chkpolicy);
		js.executeScript("arguments[0].scrollIntoView(true);", chkpolicy);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// calling the method
		js.executeScript("document.getElementsByName('agree').click");
		System.out.println();
	}
	
	public void register() {
		btnCountinue.click();;
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
}




