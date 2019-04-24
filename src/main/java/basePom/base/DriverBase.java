package basePom.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverBase {

  public static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
  private String browser = null;

  public DriverBase(String browser) {
    switch (browser) {
      case ("chrome"):
        WebDriverManager.chromedriver().setup();
        drivers.set(new ChromeDriver());
        break;
      case ("firefox"):
        WebDriverManager.firefoxdriver().setup();
        drivers.set(new FirefoxDriver());
        break;
    }
    drivers.get().manage().window().maximize();
    drivers.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  }

  public static void main(String[] args) {
    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    Integer sum = 0;
    Integer delta = 2;
    map1.put("x", 1);
    map1.put("y", 4);
    map2.put("x", 3);
    map2.put("y", 9);
    for (String s : map1.keySet()) {
      if (map1.containsKey(s) == map2.containsKey(s)) {
        sum = Math.abs(map1.get(s) - map2.get(s));
        System.out.println(sum);
      }
    }

  }

  public String getBrowser() {
    return this.browser;
  }

  public WebDriver getDriver() {
    return this.drivers.get();
  }


}

