package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utility.BrowserDriver.driver;

public class FormalShoesPage {

    public static String classic_cheltenham_radio_btn = "/html/body/div[2]/table/tbody/tr[1]/td[1]/input";

    public static String color_dropdown_xpath = "/html/body/div[2]/table/tbody/tr[1]/td[3]/select";

    public static String brown_option_click = "/html/body/div[2]/table/tbody/tr[1]/td[3]/select/option[2]";

    public static void click_classiccheltenham_btn() {

        driver.findElement(By.xpath(classic_cheltenham_radio_btn)).click();
    }

    public static void click_dropdown_button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(color_dropdown_xpath)).click();
    }

    public static void click_brownshoes_option() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(brown_option_click)).click();
    }


}
