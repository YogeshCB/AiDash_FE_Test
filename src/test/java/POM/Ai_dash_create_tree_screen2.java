package POM;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Ai_dash_create_tree_screen2 {

    WebDriver driver;
    CommMeths cm;
    String info = "INFO";
    String pass = "PASS";
    String fail = "FAIL";
    HashMap<Integer, String> LoginMap= new HashMap<Integer, String>();

    public Ai_dash_create_tree_screen2(WebDriver driver) {
        Logs.startLog("Aidash create tree  screen");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        cm = new CommMeths();
    }



    //Xpath for Nearest Circuit
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-container MuiGrid-item'][1]/div/div[2]/div/div/div")
    WebElement NearestCircuit;


    //Xpath for No of phases
    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-container MuiGrid-item'][1]/div/div[2]/div[2]/div/div/div")
    WebElement NoOfphases;

    //Xpath for Submit button
    @FindBy(xpath = "//*[@class='MuiButton-label'][contains(text(),'Submit')]")
    WebElement SubmitButton;

    public void NearestCircuit() {
        cm.elementExplicitWait(driver, NearestCircuit, 100);
        Logs.startLog("Click on Nearest Circuit");


        if (NearestCircuit.isDisplayed()) {
            NearestCircuit.click();
            driver.findElement(By.xpath("//*[contains(text(),'Add Location Information')]")).click();
            Logs.addToReport("Nearest Circuit is clicked", pass);
        } else {
            Logs.addToReport("Nearest Circuit is clicked", fail);
            Logs.stopLog();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            Logs.stopLog();
        }
    }


    public void NoOfphases() {
        cm.elementExplicitWait(driver, NoOfphases, 100);
        Logs.startLog("Click on Nearest Circuit");


        if (NoOfphases.isDisplayed()) {
            NoOfphases.click();
            Logs.addToReport("NoOfphases is clicked", info);
            Logs.stopLog();
        } else {
            Logs.addToReport("NoOfphases Circuit is clicked", pass);
            Logs.stopLog();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        }
    }


    public void SubmitButton() {
        cm.elementExplicitWait(driver, SubmitButton, 100);
        Logs.startLog("Click on Nearest Circuit");


        if (SubmitButton.isDisplayed()) {
            SubmitButton.click();
            Logs.addToReport("NoOfphases is clicked", pass);
            Logs.stopLog();
        } else {
            Logs.addToReport("NoOfphases Circuit is clicked", fail);
            Logs.stopLog();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
    }
}
