package org.skillbrain.web.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.skillbrain.web.utils.ScreenshotUtil;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        ScreenshotUtil screenshotUtil = new ScreenshotUtil();


        driver.manage().window().maximize();
        
        //go to page
        driver.get("https://demoqa.com");

//        WebElement homePageImage = driver.findElement(By.cssSelector("[href='https://demoqa.com']"));
//        homePageImage.click();

//        WebElement elements = driver.findElement(By.cssSelector("[class='card mt-4 top-card']"));
//        elements.click();
//
//        List<WebElement> liList = driver.findElements(By.id("item-0"));
//        WebElement firstElement = liList.get(0);
//        firstElement.click();

        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Adriana");

        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        email.sendKeys("adriana.test@email.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Strada Sperantei nr 15");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Strada Sperantei nr 20");

        WebElement submit = driver.findElement(By.id("submit"));
        //in caz de primim ElementClickInterceptedException
//        Actions actions = new Actions(driver);
//        actions.moveToElement(submit).click().build().perform();
        submit.click();

        WebElement name = driver.findElement(By.id("name"));
        WebElement email1 = driver.findElement(By.id("email"));
        WebElement currentAddress1 = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress1 = driver.findElement(By.id("permanentAddress"));

        System.out.println(name.getText());
        System.out.println(email1.getText());
        System.out.println(currentAddress1.getText());
        System.out.println(permanentAddress1.getText());

        screenshotUtil.screenshot(driver);
        // 5 secunde
        Thread.sleep(500);

        //close the driver
        driver.close();


    }
}
