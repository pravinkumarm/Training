package testng.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Selenium.base.Seleniumbase;
import utils.DataLibrary;

public class Annotations extends Seleniumbase {
	 @BeforeMethod
	  public void beforeMethod() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		
	  }

	  /*@AfterMethod
	  public void afterMethod() {
		  close();
	  }*/
	  @DataProvider(name = "fetchData")
	  public String[][] fetchData() throws IOException{
		  
		return DataLibrary.dataloader(excelFileName);
	  }
}
