import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){

        // by tag name
        WebElement el = wd.findElement(By.tagName("div"));
        WebElement el1 = wd.findElement(By.cssSelector("div"));

        WebElement elm = wd.findElement(By.tagName("button"));
        WebElement elm1 = wd.findElement(By.cssSelector("button"));
        WebElement web = wd.findElement(By.xpath("//button"));

        WebElement elm2 = wd.findElement(By.tagName("a"));
        WebElement elm3 = wd.findElement(By.cssSelector("a"));

        WebElement elm4 = wd.findElement(By.tagName("h1"));
        WebElement elm5 = wd.findElement(By.cssSelector("h1"));

        // by class
        WebElement el2 = wd.findElement(By.className("container"));
        WebElement el3 = wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//*[@class='container']"));


        WebElement el4 = wd.findElement(By.className("active"));
        WebElement el5 = wd.findElement(By.cssSelector(".active"));

        //By id
        WebElement el6 = wd.findElement(By.id("root"));
        WebElement el7 = wd.findElement(By.cssSelector("#root"));

        // by attribute
        WebElement el8 = wd.findElement(By.cssSelector("[class='container']"));
        WebElement el9 = wd.findElement(By.cssSelector("[aria-current='page']"));

        // one of elements find by attribute ==> start & end & contains value
        WebElement el10 = wd.findElement(By.cssSelector("[name^='reg']"));
        WebElement el11 = wd.findElement(By.cssSelector("[name$='ation']"));
        WebElement el12 = wd.findElement(By.cssSelector("[name*='istr']"));

        //Start
        WebElement we = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));

        //contains
        WebElement we1 = wd.findElement(By.xpath("//input[contains(@placeholder, 'ss')]"));

    }

}
