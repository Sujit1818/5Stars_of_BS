package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Pages.LoginPom;
import Com.Utility.BaseClass;

public class Test_1 extends BaseClass{
@Test
public void Test_1() throws Exception {
    //webelement
	LoginPom login = PageFactory.initElements(driver, LoginPom.class);
	//test case steps
	//login.getTxt_email().sendKeys("sujit");
//	login.getTxt_Pass().sendKeys("123456");
	//login.getTxt_Login().click();
	//data from excelsheet

	//verify
	String ExpectedTitle="Log in to acebook";
	String Actual=driver.getTitle();
	Assert.assertEquals(Actual, ExpectedTitle);
}
	
	
	
	
	
}
