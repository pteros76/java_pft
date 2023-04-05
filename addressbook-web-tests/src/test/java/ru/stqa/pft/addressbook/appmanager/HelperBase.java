package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {


    protected WebDriver driver;

    public  HelperBase(WebDriver driver)
    {
        this.driver=driver;
    }
    protected void click(By locator) {
        driver.findElement(locator).click();
    }
    protected void typeText(By locator, String text) {
        if(text!=null) {
            String existingText = driver.findElement(locator).getAttribute("value");
            if(!text.equals(existingText)) {
                click(locator);
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }
    }

    public boolean isAlertPresnt()
    {
        try{
            driver.switchTo().alert();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }

    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;

        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
