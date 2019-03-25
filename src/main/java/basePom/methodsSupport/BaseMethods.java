package basePom.methodsSupport;

import basePom.base.DriverBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public abstract class BaseMethods {

  protected static final Logger log = LogManager.getLogger();

  protected WebDriver getDriver() {
    return DriverBase.drivers.get();
  }


}
