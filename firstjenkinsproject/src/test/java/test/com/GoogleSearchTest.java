/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Shouvik
 */
public class GoogleSearchTest {
    private static WebDriver driver;

    
    public GoogleSearchTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        
         // Path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");

        // Initialize the driver
        driver = new ChromeDriver();

        // Optional: maximize the window
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        driver.close();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
     @Test
    public void testGoogleSearch() {
        // Open Google
        driver.get("https://www.google.com");

        // Find the search box by its name attribute and type "Selenium"
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

        // Wait for a second to get results
        

        // Assert that the title contains "Selenium"
     assertTrue(driver.getTitle().contains("Selenium"), "Title does not contain search query.");
    }
}
