import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        // Launch the URL.

        driver.get(baseUrl);

        // Maximise Window

        driver.manage().window().maximize();

        // Give implicit time to driver

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get the title of the page in console

        String title = driver.getTitle();

        System.out.println(title);

        // Get current Url

        driver.getCurrentUrl();

        System.out.println("Current Url = " +driver.getCurrentUrl());

        // Get current Url (Login Functionality)

        String loginUrl = "https://opensource-demo.orangehrmlive.com/";

        driver.navigate().to(loginUrl);

        System.out.println("Current Url = " +driver.getCurrentUrl());

        // Find the PasswordField Element

        WebElement emailField = driver.findElement(By.id("txtUsername"));

        emailField.sendKeys("xyz@gmail.com");

        // Find the Passwordfield element

        WebElement passwordField = driver.findElement(By.name("txtPassword"));

        //Sending Password to Passwordfield element

        passwordField.sendKeys ("Xyz123456@");

        // Getting Page source

        driver.getPageSource();

        System.out.println("Page Source" + driver.getPageSource());

        // Close the browser automatically#

        driver.close();

    }
}
