package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LandingPage {
        WebDriver driver;

        By logo = By.xpath("//a[@class='navigation-mns-logo navigation-logo']");

        public LandingPage(WebDriver driver) {
            this.driver = driver;
        }
        public void landing() throws InterruptedException {
            driver.manage().window().maximize();
            Thread.sleep(3000);

            driver.findElement(logo).click();
//            Thread.sleep(3000);
//            driver.findElement(search).

        }
    }


