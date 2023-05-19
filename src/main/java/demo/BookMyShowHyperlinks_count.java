package demo;

import org.openqa.selenium.By;

public class BookMyShowHyperlinks_count extends TestCases{
    public  static void hyperlinks_count(){
        System.out.println("Start Test case: hyperlinks_count");
        //navigate to google homepage  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        //Inspect all the links available on the page  Using Locator "Tag Name" "a"
        // count the number of links using getsize().
        int count = driver.findElements(By.tagName("a")).size();

        //print the count of links.
        System.out.println("hyperlinks_count is: " + count);
        System.out.println("End Test case: hyperlinks_count");
    }
}
