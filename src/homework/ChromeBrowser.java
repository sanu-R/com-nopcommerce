package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // 1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get(baseUrl);

        //Maximize screen
        driver.manage().window().maximize();

        //Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page
        System.out.println("Page title is :"+driver.getTitle());

        // 4. Print the current url
        System.out.println("Current url is :" +driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("Page source is :"+driver.getPageSource());

        //6.Enter the email to email field
        // find the email element
        WebElement emailField = driver.findElement(By.name("Email"));

        //Action is to type username
       emailField.sendKeys("reall123@gamil.com");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));

       //Action is to type password
        passwordField.sendKeys("rail123");

        //Hold Screen
        Thread.sleep(2000);

        //8. Close the browser
        driver.close();





    }
}
