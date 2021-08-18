package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver rdriver) {
        driver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(id="Username")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath="//input[@value='Log in']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath="//div[contains(@class,'header-links-wrapper')]//span[contains(@class,'ico-user sprite-image')]")
    @CacheLookup
    WebElement InkProfile;

    @FindBy(xpath="//div[contains(@class,'header-links-wrapper')]//span[contains(@class,'ico-user sprite-image')]/../..//li/a[contains(@href,'logout')]")
    @CacheLookup
    WebElement InkLogout;

    public void setUserName(String uname) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);
    }

    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickOnPageElement(String path) {
        String buttonXpath = new ParseJsonLine().parseJson(path);
        driver.findElement(By.xpath(buttonXpath)).click();
    }

    public String getElementXpath(String path) {
        return (new ParseJsonLine().parseJson(path));
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickProfile() {
        InkProfile.click();
    }

    public void clickLogout() {
        InkLogout.click();
    }
}