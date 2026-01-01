package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By usernameTextBox = By.id("Email");
	private By passwordTextBox = By.id("Password");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
//		usernameTextBox.clear();
//		usernameTextBox.sendKeys(username);
		
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
//		passwordTextBox.clear();
//		passwordTextBox.sendKeys(password);
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
		
	}
	
	public void clickButton() {
		driver.findElement(loginButton).click();
	}
}
