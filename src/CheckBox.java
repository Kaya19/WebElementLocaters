import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException{
        BrowsersInvokes myBrowser=new BrowsersInvokes();
        WebDriver driver= myBrowser.chrome();
        driver.get("http://expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.id("packageDirectFlight-hp-package")).click();
        Thread.sleep(2000);
        System.out.println("is "+driver.findElement(By.cssSelector("input#packageDirectFlight-hp-package")).isSelected());


    }
}
