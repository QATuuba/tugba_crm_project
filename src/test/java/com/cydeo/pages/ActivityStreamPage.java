package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Activity Stream')]")
    public WebElement activityStreamPageTitle;

    @FindBy(xpath = "//div[@class=\"user-block\"]")
    public WebElement userBlockMenu;

    @FindBy(xpath = "//span[.=\"Log out\"]")
    public WebElement logOutButton;

}
