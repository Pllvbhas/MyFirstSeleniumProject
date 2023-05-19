package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookMyShow_ImageUrls extends TestCases{
    public static void scrollDownHalfPage(WebDriver driver, String yAxis) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy({ top: " + yAxis + ", behavior: 'smooth' })");
    }
    public static void image_urls() throws InterruptedException {
        System.out.println("Start Test case for Book my show: image_urls");
        //navigate to google homepage  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        //Inspect all the  recomanded movie links available on the page  Using Locator "XPath" //div[@class='sc-lnhrs7-2 eQezya']/child::div/a
        List<WebElement> recommanded_movie_list = driver.findElements(By.xpath("//div[@class='sc-lnhrs7-2 eQezya']/child::div/a/div/div/div/img"));
        //print urls of all recomanded movies
        for (WebElement movie: recommanded_movie_list){
            //movie.getAttribute("src");
            System.out.println("URL is: " + movie.getAttribute("src"));
        }
        // 1100 is pixel value
        scrollDownHalfPage(driver, "1100");
        System.out.println("Image urls printed successfully");


    }
}
