package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups ={"Sanity","Master"})
	public void verify_Login() {
		
		
		logger.info("****** starting TC_002_LoginTest ******");
		try {
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		//MyAccount
		MyAccountpage am = new MyAccountpage(driver);
		boolean targetpage = am.isMyAccountPageExist();
		
		Assert.assertTrue(targetpage);
		} catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("***** TC002_LoginTest is Finishe****");
		
	}

}
