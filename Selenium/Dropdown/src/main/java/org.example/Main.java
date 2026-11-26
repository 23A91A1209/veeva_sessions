
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Click Dropdown link
        driver.findElement(By.xpath("//a[.='Dropdown']")).click();

        Thread.sleep(3000);

        // Locate dropdown
        WebElement dropdownElement =
                driver.findElement(By.xpath("//select[@id='dropdown']"));

        // Create Select object
        Select course = new Select(dropdownElement);

        // Select Option 1
        course.selectByVisibleText("Option 1");

        Thread.sleep(1000);

        // Select Option 2
        course.selectByValue("2");

        Thread.sleep(1000);

        // Select Option 1 using index
        course.selectByIndex(1);

        Thread.sleep(1000);

        driver.quit();
    }
}
