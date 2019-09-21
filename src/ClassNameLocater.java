import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocater {
static WebDriver firefoxdriver;
    public static void invokeFireFox (){
        System.setProperty("webdriver.gecko.driver","/users/ykaya/downloads/geckodriver");
        firefoxdriver=new FirefoxDriver();
    }

    public static void main(String[] args) throws InterruptedException {
        invokeFireFox();
        firefoxdriver.get("http://facebook.com");
        Thread.sleep(3000);
        firefoxdriver.findElement(By.className("_8esa")).click();

    }


}
