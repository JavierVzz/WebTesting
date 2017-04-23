/**
 * Created by Javier on 4/22/2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");

        // I am in the home page.
        WebElement input =
                driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("selenium webdriver books");
        WebElement searchIcon =
                driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
        searchIcon.click();

        // Now I am in the result page!
        WebElement status =
                driver.findElement(By.id("s-result-count"));
        System.out.println(status.getText());

        //driver.quit();
    }

}
