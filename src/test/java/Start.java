import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        //wd = new ChromeDriver();
        //wd = new FirefoxDriver();
        //wd.get("https://www.google.com/"); //without history

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);

        wd = new ChromeDriver(options);
        wd.navigate().to("https://www.google.com/"); //with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close(); //only 1 tab (if tab only 1 - close browser)
        //wd.quit(); // close all tabs and browser
    }
}
