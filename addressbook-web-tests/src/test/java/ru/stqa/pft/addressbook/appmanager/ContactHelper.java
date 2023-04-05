package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactModification() {
        //click(By.xpath("/html/body/div/div[4]/form[1]/input[22]"));
        click(By.name("update"));
    }
    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void returnToHomePage()
    {
        click(By.linkText("home page"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        typeText(By.name("firstname"), contactData.name());
        typeText(By.name("lastname"), contactData.surname());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.group());
        }else {
            //если при модификации откуда то возник список групп то валим тест
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
        typeText(By.name("notes"), contactData.notes());
    }


    public void initContactModification() {
       // click(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a"));
        click(By.cssSelector("img[alt='Edit']"));
    }
}
