package pages;

import org.openqa.selenium.By;

import utility.BrowserDriver;


public class OnlineProductsPage extends BrowserDriver {


    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";

    public static String onlineproducts_link_xpath = "//*[@id=\"menu\"]/a[3]/li";




    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_onlineProducts_Link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineproducts_link_xpath)).click();
    }

}
