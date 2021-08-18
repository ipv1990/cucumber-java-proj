package stepDefinitions;

import cucumber.api.java.en.*;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;
import pageObjects.ParseJsonLine;
import testRunner.TestRun;

public class Steps {

    public WebDriver driver;
    public LoginPage lp;

    /*public static void main(String[] args) {
        new Steps().user_auth_with_cred("Арапова_О_И.Врач-онколог_ОД");
    }*/

    @Допустим("я авторизуюсь в системе под пользователем {string}")
    public void user_auth_with_cred(String name) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        lp=new LoginPage(driver);

        String etdParams = new ParseJsonLine().getEtd(name);
        //System.out.println(etdParams);
        String url = TestRun.testUrl + etdParams;
        System.out.println(url);
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1600, 900));
    }

    @Допустим("User Launch Chrome Browser")
    public void user_Launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
        driver=new ChromeDriver();

        lp=new LoginPage(driver);
    }

    @И("User opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Тогда("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_and_Password(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);
    }

    @И("Click on Login")
    public void click_on_Login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(3000);
    }

    @И("Click on element {string}")
    public void click_on_element(String pathXpath) {
        lp.clickOnPageElement(pathXpath);
    }

    @И("Элемент {string} будет иметь текст {string}")
    public void page_element_should_be(String pathXpath, String content) throws InterruptedException {
        String readyXpath = new ParseJsonLine().parseJson(pathXpath);
        String elementContent = driver.findElement(By.xpath(readyXpath)).getText();
        if(elementContent.equals(content)) {
            Assert.assertTrue(true);
        } else {
            driver.close();
            Assert.assertTrue(false);
        }
        Thread.sleep(1000);
    }

    @И("Элемент {string} будет содержать текст {string}")
    public void page_element_should_be_contain(String pathXpath, String content) throws InterruptedException {
        String readyXpath = new ParseJsonLine().parseJson(pathXpath);
        String elementContent = driver.findElement(By.xpath(readyXpath)).getText();
        if(elementContent.contains(content)) {
            Assert.assertTrue(true);
        } else {
            driver.close();
            Assert.assertTrue(false);
        }
        Thread.sleep(1000);
    }

    @Тогда("User click on Log out button")
    public void user_click_on_Log_out_button() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(3000);
    }

    @И("User click on Profile")
    public void user_click_on_profile() throws InterruptedException {
        lp.clickProfile();
        Thread.sleep(3000);
    }

    @И("close browser")
    public void close_browser() {
        driver.quit();
    }
}