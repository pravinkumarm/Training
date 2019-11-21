package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testng.base.Annotations;

public class LoginPage extends Annotations {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "username")
	WebElement eleUname;
	@FindBy(how = How.ID, using = "password")
	WebElement elepass;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement elesubmit;

	public LoginPage username(String data) {
		clearAndType(eleUname, data);
		return this;
	}

	public LoginPage password(String data) {
		clearAndType(elepass, data);
		return this;
	}

	public ClickCRMSFA submit() {
		click(elesubmit);
		return new ClickCRMSFA();
	}

}
