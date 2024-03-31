package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppBasePage extends BasePage {

	@FindBy(css = "#shopping_cart_container")
	private WebElement cartBtn;

	@FindBy(css = "#react-burger-menu-btn")
	private WebElement menuBtn;
	@FindBy(css = "#logout_sidebar_link")
	private WebElement logoutBtn;

	public AppBasePage(WebDriver driver) {
		super(driver);

	}

	public void goToCart() {
		click(cartBtn);

	}

	public void logout() {
		click(menuBtn);
		waiting(1000);
		click(logoutBtn);
	}

}
