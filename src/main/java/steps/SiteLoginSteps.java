package steps;

import pages.SiteLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SiteLoginSteps extends ScenarioSteps {
	SiteLoginPage siteLoginPage;
	
	@Step
    public void start_browser() {
        SiteLoginPage loginPage = getPages().get(SiteLoginPage.class);
        loginPage.open();
    }
	
	@Step
    public void typeLoginForm_username(String userLogin) {
		siteLoginPage.typeLoginForm_username(userLogin);
    }
	
	@Step
    public void typeLoginForm_password(String userPassword) {
		siteLoginPage.typeLoginForm_password(userPassword);
    }
	
	@Step
	public void clickLoginForm_submit_button() {
		siteLoginPage.clickLoginForm_submit_button();
	}

}
