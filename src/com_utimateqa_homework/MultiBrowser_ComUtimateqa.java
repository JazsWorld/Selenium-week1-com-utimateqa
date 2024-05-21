package com_utimateqa_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class MultiBrowser_ComUtimateqa {

    // 1. Setup  Browser.
    static String browser = "Edge";
    static String BaseUrl =  "https://courses.ultimateqa.com/";
    static WebDriver driver;

    //IF-Else loop for selecting different browser
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser has been selected");
        }
        //Maximise the Browser window
        driver.manage().window().maximize();

        //2. Open URL.
        driver.get(BaseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3. Print the title of the page.
        System.out.println("The title of the page is: " + driver.getTitle());

        // 4. Print the current url.
        System.out.println("The current url of the page is:" + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The page source is:" + driver.getPageSource());

        //6. Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();

        //7. Print the current url
        System.out.println("The Current url is: " + driver.getCurrentUrl());

        //8. Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("jagrutijadeaj1717@gmail.com");

        //9. Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("Jaymaadi@17");

        //10. Click on Login Button.
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));

        //11. Navigate to baseUrl.
        driver.navigate().to(BaseUrl);

        //12. Navigate forward to Homepage.
        driver.navigate().forward();

        //13. Navigate back to baseUrl.
        driver.navigate().back();

        //14. Refresh the page.
        driver.navigate().refresh();

        //15. Close the browser.
        driver.quit();
    }
}
