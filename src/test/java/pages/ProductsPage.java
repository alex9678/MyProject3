package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends AppBasePage {

	@FindBy(css = ".inventory_item")
	private List<WebElement> areaList;

	@FindBy(css = ".product_sort_container")
	private WebElement dropdown;

	@FindBy(css = "#.shopping_cart_badge")
	private WebElement cartItemsLabel;

	public ProductsPage(WebDriver driver) {
		super(driver);

	}

	public void SelectOption(String optionTest) {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Name (Z to A)");

	}

	public void chooseProduct(String name) {
		for (WebElement area : areaList) {
			WebElement titleLink = area.findElement(By.cssSelector(".inventory_item_name "));
			if (titleLink.getText().equalsIgnoreCase(name)) {
				titleLink.click();
				break;

			}

		}
	}

	public void addToCart(String name) {
		for (WebElement area : areaList) {
			WebElement titleLink = area.findElement(By.cssSelector(".inventory_item_name "));
			if (titleLink.getText().equalsIgnoreCase(name)) {
				WebElement addBtn = area.findElement(By.cssSelector(".btn.btn_primary.btn"));
				addBtn.click();
				break;

			}

		}
	}

	// validation
	public int getItemsInCart() {
		String s = "";
		try {
			s = getText(cartItemsLabel);
		} catch (Exception e) {
			return 0;
		}
		int i = Integer.parseInt(s);
		return i;
	}

}