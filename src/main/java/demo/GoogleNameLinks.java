package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleNameLinks extends TestCases{
    public static void google_name_links(){
        System.out.println("Start Test case: google_name_links");
        //navigate to google homepage  www.google.com
        driver.get("https://www.google.com");
        //  find the search box Using Locator "Name" "q"
        //enter text Pallavi Patil Using Locator "Name" "q"
        driver.findElement(By.name("q")).sendKeys("Pallavi Patil");
        // Locate google search button and click on it.
        driver.findElementByXPath("(//input[@aria-label='Google Search'])[1]").click();
        // verify the text Pallavi Patil is displayed Using Locator "XPath" //*[contains(text(),'Pallavi Patil')]

        //count the number of hyperlinks Using Locator "Partial Link Text" "Pallavi Patil"
        List<WebElement> hyperlinks = driver.findElementsByPartialLinkText("Pallavi Patil");
        int count = hyperlinks.size();
        System.out.println("Number of hyperlinks are: " + count);
        System.out.println("End Test case: google_name_links");
    }
}
