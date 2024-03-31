package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Override
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");

	}

	@Test(description = "Login with Invalid user and password")
	public void tc01_failedtest() {
		loginPage.login("standart user", "12345");
		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = loginPage.getErrorMsg();
		Assert.assertEquals(actual, expected);

	}

	@Test(description = "Login passed")
	public void tc02_loginpassed() {
		loginPage.login("standard_user", "secret_sauce");

	}

	@Test(description = "Logout test")
	public void tc03_logout() {
		productsPage.logout();

	}

}
