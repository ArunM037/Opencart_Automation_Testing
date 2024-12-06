package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountpage;
import testBase.BaseClass;
import utilities.DataProviders;

/*
 * Data is valid - Login Success- Test pass - logout
 * Data is valid - Login Failed - Test fail
 * Data is invalid - Login Success - Test fail - logout
 * Data is invalid - Login Failed - Test pass
 */

public class TC003_LoginDDT extends BaseClass{
	//getting data providers in different class
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="datadriven")
	public void verify_loginDDT(String email , String password,String exp) {
		        logger.info("******* starting TC_003_LoginDDT *******");
		        try {
		        //HomePage
				HomePage hp = new HomePage(driver);
				hp.clickMyAccount();
				hp.clickLogin();
				
				//LoginPage
				LoginPage lp = new LoginPage(driver);
				lp.setEmail(email);
				lp.setPassword(password);
				lp.clickLogin();
				
				//MyAccount
				MyAccountpage am = new MyAccountpage(driver);
				boolean targetpage = am.isMyAccountPageExist();
				
				if(exp.equalsIgnoreCase("Valid")) {
					if(targetpage == true) {
					am.clickLogout();
					Assert.assertTrue(true);
					}else {
					Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("Invalid")) {
					if(targetpage==true) {
						am.clickLogout();
						Assert.assertTrue(false);
					}else {
						Assert.assertTrue(true);
					}
				}
		        }catch(Exception e) {
		        	Assert.fail();
		        }
		        logger.info("***** TC003_LoginDDT Finished ******");
	}

}
