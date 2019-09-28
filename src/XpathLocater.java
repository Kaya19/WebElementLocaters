import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocater {

    public static void main(String[] args) throws InterruptedException {
        BrowsersInvokes myBrowser=new BrowsersInvokes();//creating instance to reach BrowsersInvokes class
        WebDriver driver= myBrowser.chrome();
        driver.get("https://facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("John@john.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pwd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).clear();
        driver.findElement(By.xpath("//input[contains(@type,'ema')]")).sendKeys("qwerty");

    }

}
