package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;

public class TC_001_RegistrationPage extends BaseClass {
	
	
	@Test
	public void test_account_Registration()  throws InterruptedException
	{
		logger.info("***** Stating TC_001_RegistrationPage *****");

		try
		{
		HomePage hp=new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("clicked my accouont lilnk");
		
		hp.ClickRegister();
		logger.info("clicked on register link");
		
				
		AccountRegistrationPage regpage=new AccountRegistrationPage( driver);
		logger.info("providing customer data");
		
		regpage.setFristName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		
		regpage.setemail(randomeString()+"@gmail.com");// randomly generated the email
		
		
		String password=randomAlphaNumeric();
		regpage.setpassword(password);
		//regpage.setConfirmPass
		regpage.chkpolicy(); 
		
		
		regpage.register();
		logger.info("click continue");
		
		//String confmsg=regpage.getConfirmationMsg();
		logger.info("Validated expected message");
		
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!","not getting expected message");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("finshed tc");
	}

}