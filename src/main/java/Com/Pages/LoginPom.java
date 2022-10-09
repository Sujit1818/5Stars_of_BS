package Com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement txt_email;
	@FindBy(how = How.XPATH, using = "//input[@name='pass']")
	private WebElement txt_Pass;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	private WebElement txt_Login;
	public WebElement getTxt_email() {
		return txt_email;
	}
	
	public WebElement getTxt_Pass() {
		return txt_Pass;
	}
	
	public WebElement getTxt_Login() {
		return txt_Login;
	}
	
}
