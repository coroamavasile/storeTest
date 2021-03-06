package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class MyAccountPage {
    public WebDriver driver;


    @FindBy(xpath="//*[@class='info-account']")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//*[@class='logout']")
    private WebElement logOut;

    @FindBy(id = "contact-link")
    private WebElement contactUsButtom;

    @FindBy(xpath = "//*[@class='icon-user']")
    private WebElement myPersonalInformationButtom;

    @FindBy(xpath ="(//a[@title='Dresses'])[2]")
    private WebElement dressesButton;

    @FindBy(xpath = "//a[@title='Addresses']")
    private WebElement myAddressesButton;

    @FindBy(xpath = "//a[@title='My wishlists']")
    private WebElement myWishlistButton;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkWelcomeMessage(String expectedWelcomeMessage)
    {
        Assert.assertTrue(expectedWelcomeMessage.equals(welcomeMessage.getText()));
    }

    public void loggingOut()
    {
        logOut.click();
    }

    public void checkContactUsButtom(){
        contactUsButtom.click();
    }

    public void checkMyPersonalInformationButtom()
    {
        myPersonalInformationButtom.click();
    }

    public void checkDressesButton()
    {
        dressesButton.click();
    }

    public void clickMyAdrressesButton(){
        myAddressesButton.click();
    }

    public void clickMyWishlistButton()
    {
        myWishlistButton.click();
    }

}
