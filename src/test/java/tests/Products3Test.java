package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Products3Test extends BaseTest {
	
	@Test(description= "test product badge")
	public void tc01_productbadge() {
		
		int before = productsPage.getItemsInCart();
		productsPage.chooseProduct("Sauce Labs Backpack");
		int actual = productsPage.getItemsInCart();
		Assert.assertEquals(actual, before + 2);
		
	}
	
}
