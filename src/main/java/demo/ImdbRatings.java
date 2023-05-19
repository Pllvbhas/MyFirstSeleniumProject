package demo;

import org.openqa.selenium.WebElement;

public class ImdbRatings extends TestCases{
    public static void imdb_ratings() throws InterruptedException {
        boolean status;
        System.out.println("Start Test case: imdb_ratings");
//        navigate to imdb site  https://www.imdb.com/chart/top
        driver.get("https://www.imdb.com/chart/top");
//verify sort by button is displayed Using Locator "Class" Name lister-sort-by-label
        status = driver.findElementByClassName("lister-sort-by-label").isDisplayed();
        //click on dropdown Using Locator "Class" Name lister-sort-by"
        WebElement sort_dropdown = driver.findElementByClassName("lister-sort-by");
        sort_dropdown.click();
        //Thread.sleep(3000);
        //select imdb ratings Using Locator "XPath" //option[@value='ir:descending']
        driver.findElementByXPath("//option[@value='ir:descending']").click();
        //Thread.sleep(5000);
        //find top rated movie
        String top_rated_movie = driver.findElementsByXPath("//td[@class='titleColumn']").get(0).getText();
        System.out.println("IMDB Top rated movie is: " + top_rated_movie);
        //check the title of table Using Locator "XPath" //span[contains(text(),'Top 250 Movies')]
        String TOP_listed = driver.findElementByXPath("//h1[contains(text(),'Top 250 Movies')]").getText();
        System.out.println(TOP_listed);
        //select release date Using Locator "XPath" //option[@value='us:descending']
        sort_dropdown.click();
        driver.findElementByXPath("//option[@value='us:descending']").click();
        //select ascending order button Using Locator "XPath" //span[@title="Ascending order"]
        WebElement order = driver.findElementByXPath("//span[starts-with(@class,'global-sprite lister-sort-reverse ')]");
        order.click();

        //get tiltle of oldest movie Using Locator "Link Text" The Kid
        String oldest_movie = driver.findElementsByXPath("//td[@class='titleColumn']").get(0).getText();
        System.out.println("Oldest movie is: " + oldest_movie);
        //select descending order button.
        order.click();
        //select latest released movie and get 1st movie from the list Using Locator "Tag Name" a
        String latest_movie = driver.findElementsByXPath("//td[@class='titleColumn']").get(0).getText();
        System.out.println("Latest movie is: " + latest_movie);
        //click on dropdown Using Locator "Class" Name lister-sort-by"
        sort_dropdown.click();
        //select number of ratings Using Locator "XPath" //option[@value='nv:descending']
        driver.findElementByXPath("//option[@value='nv:descending']").click();
        //select the first movie from the list
        String top_user_rated = driver.findElementsByXPath("//td[@class='titleColumn']").get(0).getText();
        System.out.println("Top user rated movie is: " + top_user_rated);
        System.out.println("End Test case: imdb_ratings");
    }
}
