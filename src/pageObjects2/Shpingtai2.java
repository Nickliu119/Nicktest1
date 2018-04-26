package pageObjects2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shpingtai2 {
	//元素定位
	
	//输入用户名框
	@FindBy (xpath = "/html/body/div/div/form[1]/div[1]/div/div[1]/input")
	WebElement inputBox_username;
	
	//输入密码框
	@FindBy (xpath = "/html/body/div/div/form[1]/div[2]/div/div[1]/input")
	WebElement inputBox_password;
	
	//登录按钮
	@FindBy (xpath = "/html/body/div/div/form[1]/div[3]")
	WebElement login_submitBtn;
	
	//业务逻辑和操作方法
	
	//登录方法
	public void login (String username, String password) {
		
		inputBox_username.sendKeys(username);
		inputBox_password.sendKeys(password);
		login_submitBtn.click();
	}
}
