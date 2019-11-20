package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testng.base.Annotations;

public class ClickCRMSFA extends Annotations {

	public ClickCRMSFA() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement eleCRMSFA;

	public ClickCreateLead clickcrm() {
		click(eleCRMSFA);
		return new ClickCreateLead();
	}
}
