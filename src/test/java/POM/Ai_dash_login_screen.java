package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class Ai_dash_login_screen {
    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";
    HashMap<Integer, String> LoginMap= new HashMap<Integer, String>();

    //xpath for email address
    @FindBy(xpath = "//*[@id='email']")
    WebElement EnterEmail ;

    //xpath for password field
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordfield;


    @FindBy(xpath = "//*[@id='btn-login']")
    WebElement clickLoginButton;


    public Ai_dash_login_screen(WebDriver driver) {
        Logs.startLog("Aidash Home screen");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        cm = new CommMeths();
    }


    /*
    Function  to search movie director in letter box.
    */
    public void enterEmail()
    {
        cm.elementExplicitWait(driver, EnterEmail, 100);
        Logs.startLog("cliking on email  " );

        if (EnterEmail.isDisplayed()) {
            Logs.addToReport("Select Email Id box on webapp", info);
            EnterEmail.click();
            Logs.addToReport("Email id box has been selected", info);
            EnterEmail.sendKeys("gautam@aidash.com");
            Logs.addToReport("Email has been entered", pass);
            cm.elementExplicitWait(driver, EnterEmail, 700);
            Logs.stopLog();
        }
        else {
            Logs.addToReport("Error while entering email field", fail);
            Logs.stopLog();
        }

    }

    public void  enterPassword ()
    {
        cm.elementExplicitWait(driver, passwordfield, 100);
        Logs.startLog("clicking on passsword field");


        if (passwordfield.isDisplayed()) {
            passwordfield.click();
            Logs.addToReport("Password field has been selected", info);
            passwordfield.sendKeys("test@123");
            Logs.addToReport("password field  with password has been entered", pass);
            System.out.println("passwordfield has been entered");
            cm.elementExplicitWait(driver, EnterEmail, 700);
            Logs.stopLog();

        }
        else {
            Logs.addToReport("Error while entering password field ", fail);
            Logs.stopLog();
        }

    }

    public void clickLoginButton()
    {
        cm.elementExplicitWait(driver, clickLoginButton, 100);
        Logs.startLog("clicking on login button");


        if (clickLoginButton.isDisplayed()) {
            clickLoginButton.click();
            Logs.addToReport("login button is successfully clicked", pass);
            Logs.stopLog();
        }
        else {
            Logs.addToReport("Error while clicking field", fail);
            Logs.stopLog();
        }

    }

}
