package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{
    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(
                new ContactData("new name 1"+app.getBrowserName(),"new surname ",
                        "test1 firefox","new test"),true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
}
