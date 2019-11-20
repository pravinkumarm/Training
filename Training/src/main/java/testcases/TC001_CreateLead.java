package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import testng.base.Annotations;



public class TC001_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_CreateLead";
		testcaseDec = "Login, Create Lead and Verify";
		author = "Pravin";
		category = "smoke";
		excelFileName = "TC001";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd, String companyName, String firstName, String lastName) {
		new LoginPage().username(uName).password(pwd).submit().clickcrm().clickcreateleadlink().companyname(companyName);
	}
	
}






