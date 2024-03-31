package tests;

import org.testng.annotations.Test;

public class Products2Test extends BaseTest {

	@Test(description = "checkout page test")
	public void tc01_checkoutpage() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.addToCart("Sauce Labs Fleece Jacket");
		productsPage.goToCart();
		yourCartPage.checkout();
		checkoutInformation.cancel();
		yourCartPage.checkout();
		checkoutInformation.nemaleTofes("Alex", "sdcd", "712321");
		checkoutOverview.finish();
		checkoutComplete.getTextMsg();
		checkoutComplete.finish();

	}

	@Test(description = "add products from item page")
	public void tc02_addProductsFromItemPage() {
		productsPage.chooseProduct("Sauce Labs Fleece Jacket");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProduct("Sauce Labs Backpack");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProduct("Sauce Labs Bolt T-Shirt");
		itemPage.addToCart();
		itemPage.back();
		productsPage.goToCart();
		yourCartPage.checkout();
		checkoutInformation.nemaleTofes("Alex", "aaaa", "34343");
		checkoutOverview.finish();
		checkoutComplete.getTextMsg();
		checkoutComplete.finish();

	}
	
	@Test(description = "Select test")
	public void tc03_select() {
		productsPage.SelectOption("Name (Z to A)");
		
	}

}
