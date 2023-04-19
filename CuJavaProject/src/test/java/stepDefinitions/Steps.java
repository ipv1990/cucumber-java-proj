package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.LoginPage;
import pageObjects.ParseJsonLine;
import testRunner.TestRun;

public class Steps {

    public WebDriver driver;
    public LoginPage lp;

    /*public static void main(String[] args) {
        new Steps().user_auth_with_cred("Арапова_О_И.Врач-онколог_ОД");
    }*/

    @Given("я авторизуюсь в системе под пользователем {string}")
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

    @Given("Launch the Chrome Browser")
    public void user_Launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
        driver=new ChromeDriver();

        lp=new LoginPage(driver);
    }

    @And("User opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Then("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_and_Password(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);
    }

    @And("Click on Login")
    public void click_on_Login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(3000);
    }

    @And("Click on element {string}")
    public void click_on_element(String pathXpath) throws InterruptedException {
        lp.clickOnPageElement(pathXpath);
    }

    @And("I can see the element {string} on the page")
    public void element_displayed(String pathXpath) throws InterruptedException {
        String readyXpath = new ParseJsonLine().parseJson(pathXpath);
        if(driver.findElement(By.xpath(readyXpath)).isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            driver.close();
            Assert.assertTrue(false);
        }
        Thread.sleep(1000);
    }

    @But("I cannot see the element {string} on the page")
    public void element_isnt_displayed(String pathXpath) throws InterruptedException {
        String readyXpath = new ParseJsonLine().parseJson(pathXpath);
        try {
            if(driver.findElement(By.xpath(readyXpath)).isDisplayed()) {
                Assert.assertTrue(false);
            }
        }
        catch (NoSuchElementException exception) {
            Assert.assertTrue(true);
        }
        finally {
            Thread.sleep(1000);
        }
    }

    @And("Text of the element {string} is {string}")
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

    @And("Text of the element {string} contains {string}")
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

    @Then("User click on Log out button")
    public void user_click_on_Log_out_button() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(3000);
    }

    @And("User click on Profile")
    public void user_click_on_profile() throws InterruptedException {
        lp.clickProfile();
        Thread.sleep(3000);
    }

    @And("User closes browser")
    public void close_browser() {
        driver.quit();
    }
}