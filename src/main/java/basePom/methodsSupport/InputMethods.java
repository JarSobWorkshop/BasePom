package basePom.methodsSupport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputMethods extends BaseMethods {
  protected static WebDriverWait wait;

  public void inputText(WebElement element, String text) {
    wait = new WebDriverWait(getDriver(), 10);
    wait.until(ExpectedConditions.elementToBeClickable(element));
    try {
      element.clear();
    } catch (Exception e) {
      e.getMessage();
    }
    log.info("Input text \"" + text + "\" to element \"" + element.getText() + "\"");
    element.sendKeys(text);
  }
}
