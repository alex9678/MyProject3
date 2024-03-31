package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AppBasePage {

	@FindBy(css = ".btn.btn_primary.btn")
	private WebElement addToCartBtn;
	@FindBy(css = "#back-to-products")
	private WebElement backBtn;

	public ItemPage(WebDriver driver) {
		super(driver);

	}

	public void addToCart() {
		click(addToCartBtn);

	}

	public void back() {
		click(backBtn);
	}

}
