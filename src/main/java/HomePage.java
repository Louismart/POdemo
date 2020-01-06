import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Chromedriver input parameters

public class HomePage {
    private WebDriver driver;
    private By SearchText = By.xpath("//input[@class='gLFyf gsfi']");

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public ResultPage search(String text) {
        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys(text + Keys.ENTER);
        //search.sendKeys(Keys.ENTER);
        return new ResultPage(driver);
    }
}
