import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd = new ChromeDriver();
        //wd = new FirefoxDriver();
        //wd.get("https://www.google.com/"); //without history
        wd.navigate().to("https://www.google.com/"); //with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close(); //only 1 tab (if tab only 1 - close browser)
        //wd.quit(); // close all tabs and browser
    }
}
