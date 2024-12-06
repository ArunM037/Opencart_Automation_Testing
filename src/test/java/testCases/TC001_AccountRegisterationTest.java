package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegisterationTest extends BaseClass{
	
	@Test(groups = {"Regression","Master"})
	public void verify_account() {
		
		try {
		logger.info("***** Starting TC001_AccountRegisterationTest *********");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my Account Link");
		hp.clickRegister();;
		logger.info("Clicked on myRegister Link");
		AccountRegistrationPage red = new AccountRegistrationPage(driver);
		logger.info("Providering Customer details");
		red.setFirstName(randomeString().toUpperCase());
		red.setLastName(randomeString().toUpperCase());
		red.setEmail(randomeString()+"@gmail.com");
		red.setTelephone(randomeNumber());
		
		String password = randomAlphaNumeric();
		
		red.setPassword(password);
		red.setConfirmPassword(password);
		red.setPrivacyPolicy();
		red.clickContinue();
		
		
		logger.info("Validating expected Message");
		String Actual= red.getConfirmationMsg();
		if(Actual.equals("\"Your Account Has Been Created!")){
			logger.info("Test Passed!!");
		}else {
			logger.error("Test failed");
			logger.debug("Debug logs....");
		}
		
		Assert.assertEquals(Actual,"Your Account Has Been Created!" );
		}catch (Exception e) {
			Assert.fail();
		}
		
		logger.info("*******Finished Test TC001_AccountRegisterationTest*******");
	}
}
