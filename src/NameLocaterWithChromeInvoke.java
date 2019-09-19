import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocaterWithChromeInvoke {
    static WebDriver chromeDriver;
    public static void main(String[] args) {
        chromeBrowserInvoke();
        chromeDriver.get("http://facebook.com");
        chromeDriver.findElement(By.name("firstname")).sendKeys("John");
        chromeDriver.findElement(By.name("lastname")).sendKeys("Smith");

    }

    public static void chromeBrowserInvoke(){
        System.setProperty("webdriver.chrome.driver","/users/ykaya/downloads/chromedriver");
        chromeDriver=new ChromeDriver();

    }
}
