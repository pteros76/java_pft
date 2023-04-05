package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{
    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(
                new ContactData("modified name 1"+app.getBrowserName(),
                        "modified surname ",null,"modified test"),false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();

    }
}
