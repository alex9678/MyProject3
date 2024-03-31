package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverview extends AppBasePage {
	@FindBy(css = "#finish")
	private WebElement finishBtn;
	@FindBy(css = "#cancel")
	private WebElement cancelBtn;

	public CheckoutOverview(WebDriver driver) {
		super(driver);

	}

	public void finish() {
		click(finishBtn);
	}

	public void cancel() {
		click(cancelBtn);
	}

}
