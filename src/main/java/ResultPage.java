import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By resultsLocator = By.xpath("//h3");
    private By firstlink = By.xpath("");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public List<WebElement> getResults(){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(resultsLocator));
    }


    public WebElement getFirstlink() {
        WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(firstlink));
        return result;
    }
}
