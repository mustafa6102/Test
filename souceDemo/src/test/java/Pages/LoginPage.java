package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class LoginPage {
    WebDriver driver;
   ElementHelper elementHelper;
    WebDriverWait wait;

public LoginPage(WebDriver driver){
    this.driver = driver;
    this.wait =new WebDriverWait(driver, 10);
    this.elementHelper = new ElementHelper(driver);
}
By loginButton = By.cssSelector("#login-button");
By errorMessage = By.cssSelector("h3[data-test='error']");
By usernamebax = By.cssSelector("#user-name");
By passwordBox = By.cssSelector("#password");
By productText = By.cssSelector(".title");
    public void userAtHomePage() {
    driver.get("https://www.saucedemo.com/");

    }

    public void clickLogin() {
driver.findElement(loginButton).click();
    }

    public void checkMessage(String usernamme) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsarnameForUsernameField(String username) {
        driver.findElement(usernamebax).click();
        elementHelper.sendKey(usernamebax, "abcdefg");

    }

    public void writePasswordForPasswordField(String password) {
driver.findElement(passwordBox).click();
elementHelper.sendKey(passwordBox, "123456");
    }

    public void correctUsernameForUSernameField(String correctUsername) {
driver.findElement(usernamebax).click();
elementHelper.sendKey(usernamebax, "standard_user");
    }

    public void falsePasswordForPasswordField(String falsePassword) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox, "abc1234");
    }

    public void dontMatchErrorMessage(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeCorrectPassword(String correctPassword) {
        driver.findElement(usernamebax).click();
        elementHelper.sendKey(usernamebax, "secret_sauce");
    }

    public void writeFalseUSername(String falseUsername) {
        driver.findElement(usernamebax).click();
        elementHelper.sendKey(usernamebax, "asdfg");
    }

    public void checkSuccessful() {
        elementHelper.checkVisible(productText);
    }
}
