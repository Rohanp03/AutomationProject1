package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ExclusiveCollectionPage {

    public static String exclusivecollection_btn_xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn ') and contains(concat(' ', normalize-space(@class), ' '), ' btn-info ') and contains(concat(' ', normalize-space(@class), ' '), ' FormalShoes ')]";


    public static void click_exclusivecollection_btn() {

        driver.findElement(By.xpath(exclusivecollection_btn_xpath)).click();
    }


}

