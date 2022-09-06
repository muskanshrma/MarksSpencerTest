package Test;

import Pages.MenuItems;
import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class BaseClass {
        static WebDriver driver;
         static PageFactory pagefactory;
        public static void setup(){
            driver= new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver.get("https://www.marksandspencer.com/");
            pagefactory = new PageFactory(driver);
        }
        public static void close()
        {
            driver.close();
        }

    }

