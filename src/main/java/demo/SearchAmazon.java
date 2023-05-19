package demo;

import org.openqa.selenium.By;

public class SearchAmazon extends TestCases {
    public static void amazonSearch(){
        System.out.println("Start Test case: amazonSearch");
//        navigate to google homepage  www.google.com
        driver.get("https://www.google.com");
//        find the search box Using Locator "Name" "q"
        driver.findElement(By.name("q")).sendKeys("Amazon");
//        enter text Amazon Using Locator "Name" "q"
        driver.findElementByXPath("(//input[@aria-label='Google Search'])[1]").click();
//        verify the text Amazon.in is displayed Using Locator "XPath" //*[contains(text(),'Amazon.in')]
        String text = driver.findElement(By.xpath("//*[contains(text(),'Amazon.in')]")).getText();
        System.out.println("search result is: " + text);
        System.out.println("End Test case: amazonSearch");
    }
}
