package Test;

public class HomeTest extends BaseClass{

        public static void main(String[] args) throws InterruptedException {
            setup();
            pagefactory.getLandingPage().landing();
            pagefactory.getMenuItems().menu("//h1[@class='product-listing__title']","Women's New In");
            close();
        }
    }

