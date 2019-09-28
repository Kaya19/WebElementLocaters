import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        BrowsersInvokes myBrowser = new BrowsersInvokes();
        WebDriver driver = myBrowser.chrome();
        driver.get("http://echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        int count1= driver.findElements(By.name("group1")).size();
        int count2 =driver.findElements(By.cssSelector("input[type='radio']")).size();
        for (int i=0;i<count2;i++){
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
            Thread.sleep(2000);
        }




    }
}