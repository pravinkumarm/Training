package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testng.base.Annotations;

public class Createleadpage extends Annotations {

	public Createleadpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]") WebElement elecompanyname;
	
	
	public Createleadpage companyname(String data) {
		clearAndType(elecompanyname, data);
		return this;
	}
}
