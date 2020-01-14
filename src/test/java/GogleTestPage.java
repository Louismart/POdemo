


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

/* Requirements:
   Given User is on Google home page
   When I search text "automated text info"
   Then I should see first link contains text "automated"
   -----------------------------------------------------------------------------------------------------
   Hints:
   The Class implements the Page
   The Class can return not full Page
   The method has to return Page objects
   The tests run in Test folder
   ----------------------------------------------------------------------------------------------------
 */

public class GogleTestPage {
    private ChromeDriver driver;


    @BeforeSuite
    public void beforeSuite(){

    }
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().version("79.0.3945.36").setup();
        driver = new ChromeDriver();
    }


    @Test
    public void testSearch1(){
        //Arrange
        driver.get("http://google.pl");
        //Act
        ResultPage result = new HomePage(driver).search("automated testing info");
        //Assert
        Assert.assertTrue(result.getResults().get(0).getText().contains("automated"));
   }
   @Test
   public void testSearch2() {
       driver.get("http://google.pl");
       //Act
       ResultPage result = new HomePage(driver).search("automated testing info");
       //Assert
       //Assert.assertTrue(result.getFirstlink().contains("automated"));


   }

    @AfterTest
    public void tearDown(){
        if (driver != null) driver.quit();
    }
}


