package org.skillbrain.web.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsTest {
//static -> first
// dynamic (non static keyword) -> after static
    private static ChromeDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        windowTabTest();
    }

    private static void windowTabTest() {
        try {
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/browser-windows");
            //este o lista cu elemente unice
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println(windowHandles);
            WebElement tabButton = driver.findElement(By.id("tabButton"));
            tabButton.click();
            windowHandles = driver.getWindowHandles();
            System.out.println(windowHandles);

            Iterator<String> iterator = windowHandles.iterator();
            String parentWindow = iterator.next();
            String childWindow = iterator.next();

            driver.switchTo().window(childWindow);

            WebElement newPageHeading = driver.findElement(By.id("sampleHeading"));
            System.out.println(newPageHeading.getText());

            driver.switchTo().window(parentWindow);
            
        } catch (Exception e) {
            e.getMessage();
        }
        finally {
            //close active window
            driver.close();
            //close all windows (tabs)
            driver.quit();
        }
    }
}
