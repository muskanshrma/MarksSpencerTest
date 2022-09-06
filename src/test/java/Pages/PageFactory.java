package Pages;
import org.openqa.selenium.WebDriver;


    public class PageFactory {
     static    WebDriver driver;
        private LandingPage landing;
        private MenuItems menu;

        public PageFactory(WebDriver driver){
            this.driver=driver;

        }
        public LandingPage getLandingPage() {
            if(landing==null){
                landing = new LandingPage(driver);
            }
            return  landing;
        }
        public MenuItems getMenuItems() {
            if(menu==null){
                menu = new MenuItems(driver);
            }
            return  menu;
        }
    }



