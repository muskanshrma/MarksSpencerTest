package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuItems {
    WebDriver driver;



    public MenuItems(WebDriver driver) {
        this.driver = driver;
    }

    public void menu(String locator, String expected) throws InterruptedException {

        WebElement category = driver.findElement(By.xpath("//a[@class=\"nav-primary__menu-link icon--hdr-arrow-right\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(category).perform();

        driver.findElement(By.xpath("(//a[contains(text(),'View All')])[1]")).click();
        String actual = driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.equals(expected),"Expected does not match actual result");

    }
}


