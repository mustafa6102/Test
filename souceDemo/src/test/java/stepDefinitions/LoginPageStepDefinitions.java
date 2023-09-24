package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    
    
    @Given("User at home page")
    public void userAtHomePage() {

        loginPage.userAtHomePage();
    }

    @When("Click login Button")
    public void clickLoginButton() {
        loginPage.clickLogin();
        
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String usernamme) {
        loginPage.checkMessage(usernamme);
    }

    @When("write {string} for username field")
    public void writeForUsernameField(String Username) {
        loginPage.writeUsarnameForUsernameField(Username);


    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("write {string}for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }

    @Then("Click {string} message about username")
    public void clickMessageAboutUsername(String password) {

loginPage.writePasswordForPasswordField(password);

    }

    @When("white Correct {string} for username field")
    public void whiteCorrectForUsernameField(String correctUsername) {
        loginPage.correctUsernameForUSernameField(correctUsername);
        
    }

    @When("write False {string} for password field")
    public void writeFalseForPasswordField(String falsePassword) {
        loginPage.falsePasswordForPasswordField(falsePassword);
        
    }

    @Then("Check {string} message about don't match")
    public void checkMessageAboutDonTMatch(String dontMatch) {
        loginPage.dontMatchErrorMessage(dontMatch);
    }

    @When("write false{string} for username field")
    public void writeFalseForUsernameField(String falseUsername) {
        loginPage.writeFalseUSername(falseUsername);


    }

    @When("white Correct {string} for password field")
    public void whiteCorrectForPasswordField(String correctPassword) {
        loginPage.writeCorrectPassword(correctPassword);
    }

    @Then("Check Successful login")
    public void checkSuccessfulLogin() {
        loginPage.checkSuccessful();
    }
}
