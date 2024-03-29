import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombo {
    public static void main(String[] args) throws InterruptedException {
        BrowsersInvokes myBrowser=new BrowsersInvokes();
        WebDriver driver= myBrowser.chrome();
        driver.get("http://expedia.com");
        Thread.sleep(2000);
        //driver.findElement(By.id("package-advanced-preferred-class-hp-package")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.cssSelector("option[value='p']")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.cssSelector("option[value='p']")).sendKeys(Keys.RETURN);
        Select s=new Select(driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
        Thread.sleep(1000);
        s.selectByValue("p");
        Thread.sleep(1000);
        s.selectByIndex(0);
        Thread.sleep(1000);
        s.selectByVisibleText("Business");
        Thread.sleep(1000);
        s.deselectAll();


    }

}
