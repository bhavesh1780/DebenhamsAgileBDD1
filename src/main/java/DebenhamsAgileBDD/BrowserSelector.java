package DebenhamsAgileBDD;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Dell on 24/04/2017.
 */
public class BrowserSelector extends BasePage {

    LoadProp loadprop = new LoadProp();
    //This will Run Browser From Intellij
//    String browser = loadprop.getProperty("browser");

    public static final String USERNAME = "lotus7143";
    public static final String ACCESS_KEY = "2e41d680-4cb6-4418-bd3e-ac6cc8ef6eb2";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void selectBrowser() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "43.0");
        driver = new RemoteWebDriver(new URL(URL), caps);

//    driver.get("https://saucelabs.com/test/guinea-pig");
//    System.out.println("title of page is: " + driver.getTitle());
}
//    public void selectBrowser(){
//
//        if(browser.equalsIgnoreCase("firefox")){
////            DesiredCapabilities firefoxCapabilities = DesiredCapabilities.firefox();
////            firefoxCapabilities.setBrowserName("firefox");
////            firefoxCapabilities.setPlatform(Platform.ANY);
//            driver = new FirefoxDriver();
//
//        }else if(browser.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\IdeaProjects\\DebenhamsAgileBDD\\src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
//            DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
//            driver = new ChromeDriver();
//
//        }else if(browser.equalsIgnoreCase("ie")){
//            System.setProperty("webdriver.ie.driver","C:\\Users\\Dell\\IdeaProjects\\DebenhamsAgileBDD\\src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
//            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
//            driver = new InternetExplorerDriver();
//
//        }else{
//            System.out.println("Browser Name is Wrong");
//        }
//    }
}
