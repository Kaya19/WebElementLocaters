import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowserInvoke {
    public static void main(String[] args) {
        OperaBrowserInvoke myBrowser= new OperaBrowserInvoke();
        WebDriver driver=myBrowser.invokeOperaBrowser();
        driver.get("http://google.com");
    }
    public WebDriver invokeOperaBrowser (){
        System.setProperty("webdriver.opera.driver","/users/ykaya/downloads/operadriver/operadriver");
        WebDriver driverOpera=new OperaDriver();
        return driverOpera;
        }

}

