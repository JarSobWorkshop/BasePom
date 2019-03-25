package basePom.methodsSupport;

public class BrowserMethods extends BaseMethods {

  public String getTitle() {
    return getDriver().getTitle();
  }
}

