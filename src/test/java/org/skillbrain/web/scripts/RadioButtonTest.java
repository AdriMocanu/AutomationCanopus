package org.skillbrain.web.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        WebElement noRadio = driver.findElement(By.id("noRadio"));

        boolean isEnabled = noRadio.isEnabled();

        if (isEnabled) {
            System.out.println("Button is enabled");
        } else {
            System.out.println("Button is disabled");
        }

        driver.close();

    }
}
