package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutComplete extends AppBasePage {

	@FindBy(css = ".complete-header")
	private WebElement textLabel;
	@FindBy(css = "#back-to-products")
	private WebElement finishBtn;

	public CheckOutComplete(WebDriver driver) {
		super(driver);

	}

	public String getTextMsg() {
		return getText(textLabel);

	}

	public void finish() {
		click(finishBtn);
	}

}
