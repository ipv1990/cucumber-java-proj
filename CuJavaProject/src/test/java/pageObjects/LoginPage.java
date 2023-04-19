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
    @FindBy(xpath="//div[contains(@class,'auth__field')]//input[@placeholder='Логин']")
    @CacheLookup
    WebElement txtLogin;

    @FindBy(xpath="//div[contains(@class,'auth__field')]//input[@placeholder='Пароль']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath="//button[span/text()='Войти']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath="//div[contains(@class,'right-menu')]//span[@class='avatar__default']")
    @CacheLookup
    WebElement InkProfile;

    @FindBy(xpath="//div[@data-menu-item='signout']")
    @CacheLookup
    WebElement InkLogout;

    public void setUserName(String uname) {
        txtLogin.clear();
        txtLogin.sendKeys(uname);
    }

    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickOnPageElement(String path) throws InterruptedException {
        String buttonXpath = new ParseJsonLine().parseJson(path);
        driver.findElement(By.xpath(buttonXpath)).click();
        Thread.sleep(1000);
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