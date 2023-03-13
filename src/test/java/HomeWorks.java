import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){

        // by tag name

        WebElement el = wd.findElement(By.tagName("div"));
        WebElement element = wd.findElement(By.cssSelector("div"));
        WebElement we = wd.findElement(By.xpath("//div"));

        WebElement el1 = wd.findElement(By.tagName("button"));
        WebElement element1 = wd.findElement(By.cssSelector("button"));
        WebElement we1 = wd.findElement(By.xpath("//button"));

        WebElement el2 = wd.findElement(By.tagName("a"));
        WebElement element2 = wd.findElement(By.cssSelector("a"));
        WebElement we2 = wd.findElement(By.xpath("//a"));

        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement element3 = wd.findElement(By.cssSelector("h1"));
        WebElement we3 = wd.findElement(By.xpath("//h1"));

        WebElement el4 = wd.findElement(By.tagName("body"));
        WebElement element4 = wd.findElement(By.cssSelector("body"));
        WebElement we4 = wd.findElement(By.xpath("//body"));

        WebElement el5 = wd.findElement(By.tagName("form"));
        WebElement element5 = wd.findElement(By.cssSelector("form"));
        WebElement we5 = wd.findElement(By.xpath("//form"));

        WebElement el6= wd.findElement(By.tagName("input"));
        WebElement element6 = wd.findElement(By.cssSelector("input"));
        WebElement we6 = wd.findElement(By.xpath("//input"));

        // by class
        WebElement el7 = wd.findElement(By.className("container"));
        WebElement element7 = wd.findElement(By.cssSelector(".container"));
        WebElement we7 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el8 = wd.findElement(By.className("active"));
        WebElement element8 = wd.findElement(By.cssSelector(".active"));
        WebElement we8 = wd.findElement(By.xpath("//*[@class = 'active']"));

        WebElement el9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element9 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement we9 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        //By id
        WebElement el10 = wd.findElement(By.id("root"));
        WebElement element10 = wd.findElement(By.cssSelector("#root"));
        WebElement we10 = wd.findElement(By.xpath("//*[@id = 'root']"));

        // by attribute
        WebElement el11 = wd.findElement(By.cssSelector("[class='container']"));
        WebElement we11 = wd.findElement(By.xpath("//*[@class = 'container']"));

        WebElement el12 = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement we12 = wd.findElement(By.xpath("//*[@aria-current = 'page']"));

        // one of elements find by attribute ==> start & end & contains value
        WebElement el13 = wd.findElement(By.cssSelector("[name^='reg']"));
        WebElement we13 = wd.findElement(By.xpath("//*[starts-with(@name, 'reg')]"));

        WebElement el14 = wd.findElement(By.cssSelector("[name$='ation']"));

        WebElement el15 = wd.findElement(By.cssSelector("[name*='istr']"));
        WebElement we15 = wd.findElement(By.xpath("//*[contains(@name, 'istr')]"));

        //Start
        WebElement we16 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));

        //contains
        WebElement we17 = wd.findElement(By.xpath("//input[contains(@placeholder, 'ss')]"));

    }

}
