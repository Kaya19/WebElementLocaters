/*
This class for invokes for chrome, firefox and safari browsers
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowsersInvokes {
    //this method invokes chrome browser
    public WebDriver chrome(){
        System.setProperty("webdriver.chrome.driver","/users/ykaya/Downloads/chromedriver");
        WebDriver driverChrome=new ChromeDriver();
        //driverChrome.get("http://google.com");
        return driverChrome;
    }
    //this method invokes firefox browser
    public  WebDriver firefox(){
        System.setProperty("webdriver.gecko.driver","/users/ykaya/downloads/geckodriver");
        WebDriver driverFireFox=new FirefoxDriver();
        //driverFireFox.get("http://google.com");
        return driverFireFox;
    }
    //this method invokes safari browser
    public  WebDriver safari(){
        WebDriver driverSafari=new SafariDriver();
        //driverSafari.get("http://google.com");
        return driverSafari;

    }
    public WebDriver opera(){
        System.setProperty("webdriver.opera.driver","/users/ykaya/downloads/operadriver/operadriver");
        WebDriver driverOpera=new OperaDriver();
        return driverOpera;
    }
}
