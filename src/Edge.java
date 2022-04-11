import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;



public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver  = new EdgeDriver();
        // Launch the Url
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // Give Implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Get title page in console
        String title = driver.getTitle();
        System.out.println(title);

        // Get current Url
        driver.getCurrentUrl();
        System.out.println("Current URL = " +driver.getCurrentUrl());

        // Get current Url login functionality
        String loginUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " +driver.getCurrentUrl());
        // Find the email field element
        WebElement emailfield = driver.findElement(By.id("txtUsername"));
        emailfield.sendKeys("Xyz@gmail.com");
        // Find the password field element
        WebElement passwordfield = driver.findElement(By.name("txtPassword"));
        //Sending Password to Password field
        passwordfield.sendKeys("xyz123456@");
        driver.getPageSource();
        System.out.println("Page Source =" + driver.getPageSource());
        // Close the browser Automatically
        driver.close();


    }
}
