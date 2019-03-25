package basePom;

import basePom.base.BaseTest;
import basePom.pages.MainPage;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {

  @Test
  public void shouldAnswerWithTrue() {
    new MainPage().clickInELement();
  }
}
