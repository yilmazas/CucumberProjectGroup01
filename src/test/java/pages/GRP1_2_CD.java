package pages;

import utilities.GWD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GRP1_2_CD extends Parent {
    public GRP1_2_CD() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css="[name='username']")
    public WebElement username;

    @FindBy(css="[name='password']")
    public WebElement password;

    @FindBy(css="[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath="//span[text()='Admin']")
    public WebElement adminLink;

    @FindBy(xpath="(//div[@class='orangehrm-paper-container'] // button) [1]")
    public WebElement addButton;

    @FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
    public WebElement userRole;

    @FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
    public WebElement status;

    @FindBy(css="[placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath="//*[text()='Odis  Adalwin']")
    public WebElement OdisAdalwin;

    @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usernameEss;

    @FindBy(xpath="(//*[@type='password'])[1]")
    public WebElement passwordEss;

    @FindBy(xpath="(//*[@type='password'])[2]")
    public WebElement confirmPasswordEss;

    @FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
    public WebElement saveButton;

    @FindBy(xpath="//*[text()='Success']")
    public WebElement successMessage;


}
