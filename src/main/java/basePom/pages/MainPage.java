package basePom.pages;

import basePom.methodsSupport.ClickMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

  @FindBy(xpath = "//div[@class='FPdoLc VlcLAe']")
  WebElement element;

  public MainPage() {
    super();
  }

  public MainPage clickInELement() {
    new ClickMethods().clickOnElement(element);
    return this;
  }
}
