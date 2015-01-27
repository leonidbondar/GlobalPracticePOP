package pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class SiteLoginPage extends PageObject {
	private final String pageURL = new String("/site/login");
	
	public String getPageURL() {
		return pageURL;
	}
	
	public void navigateToPage() {
		getDriver().get(getBaseURL() + pageURL);
	}

	@FindBy(id = "LoginForm_username")
	private WebElement loginForm_username;
	
	public void typeLoginForm_username(String userLogin) {
		element(loginForm_username).clear();
		element(loginForm_username).sendKeys(userLogin);
	}
	
	@FindBy(id = "LoginForm_password")
	private WebElement loginForm_password;
	
	public void typeLoginForm_password(String userPassword) {
		element(loginForm_password).clear();
		element(loginForm_password).sendKeys(userPassword);
	}
	
	@FindBy(name = "yt0")
	private WebElement loginForm_submit_button;
	
	public void clickLoginForm_submit_button() {
		element(loginForm_submit_button).click();
	}
	
}
