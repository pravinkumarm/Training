package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testng.base.Annotations;

public class ClickCreateLead extends Annotations {

	public ClickCreateLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead") WebElement eleclickcreatelead;
	
	public Createleadpage clickcreateleadlink() {
		click(eleclickcreatelead);
		return new Createleadpage();
	}
	
}
