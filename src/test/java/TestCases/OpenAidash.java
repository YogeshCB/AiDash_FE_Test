package TestCases;

import commonMethods.CommMeths;
import commonMethods.Logs;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class OpenAidash {

    WebDriver driver;
    CommMeths commeths;
    String info="INFO";
    String pass="PASS";
    String fail="FAIL";
    SoftAssert assertion = new SoftAssert();

    public OpenAidash(WebDriver driver)
    {
        this.driver=driver;
        commeths = new CommMeths();
        openUrlMethod();
    }

/*
This method helps to open Url for IMDB movies and check for if Web page opened is correct or not
 */

    public void openUrlMethod()
    {
        String url1 = commeths.getInput("urlAiDAsh");

            Logs.startLog("Opening the " + url1 + " page");
            Logs.addToReport("Trying to open the " + url1 + " page", info);
            driver.get(url1);
            Logs.addToReport("Page opening", pass);
            Logs.stopLog();
        }
    }


