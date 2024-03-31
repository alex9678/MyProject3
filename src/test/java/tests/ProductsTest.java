package tests;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

	@Test(description = "add to products test")
	public void tc01_addToProducts() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.addToCart("Sauce Labs Backpack");
	}

	@Test(description = "add products from item page")
	public void tc02_addProductsFromItemPage() {
		productsPage.chooseProduct("Sauce Labs Fleece Jacket");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProduct("Sauce Labs Bolt T-Shirt");
		itemPage.addToCart();
		itemPage.back();

	}

	@Test(description = "checkout test")
	public void tc03_checkout() {
		productsPage.goToCart();
		yourCartPage.continueShopping();
	}

	@Test(description = "add products to cart")
	public void tc04_addProductsToCart() {
		productsPage.goToCart();
		yourCartPage.checkout();

	}

	@Test(description = "Checkout information test")
	public void tc05_checkoutinformationtest() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.addToCart("Sauce Labs Backpack");
		productsPage.goToCart();
		yourCartPage.checkout();

	}

}
