package demo;

import org.openqa.selenium.WebElement;

public class PostOnLinkedin extends TestCases{
    public static void post_on_linkedin(){
        System.out.println("Start Test case: post_on_linkedin");
        //navigate to google homepage  https://www.linkedin.com/
        //navigate to google homepage  https://www.linkedin.com/
        driver.get("https://www.linkedin.com/");
        //find textbox for email ID or phone Using Locator "ID" "session_key
        //enter email ID  pllvbhas@gmail.com
        WebElement email = driver.findElementById("session_key");
        email.clear();
        email.sendKeys("pllvbhas@gmail.com");
        //find password textbox Using Locator "ID" "session_password" and enter password  "osssr05@#"
        WebElement password = driver.findElementById("session_password");
        password.clear();
        password.sendKeys("osssr05@#");
        //click on sign in button Using Locator "XPath" //button[@data-id='sign-in-form__submit-btn']
        driver.findElementByXPath("//button[@data-id='sign-in-form__submit-btn']").click();
        //find the element for who viewed your profile and click on it. Using Locator "XPath" //span[contains(text(),'viewed your profile')]
        driver.findElementByXPath("//span[contains(text(),'viewed your profile')]").click();
        //print the count of views Using Locator "XPath" //p[@class='text-body-medium-bold pr1 text-heading-large']
        WebElement count = driver.findElementByXPath("//p[@class='text-body-medium-bold pr1 text-heading-large']");
        System.out.println("number of peoples viewed profile: " + count.getText());
        //navigate to home page
        driver.findElementByXPath("//li-icon[@type='home']").click();
        //verify button for start a post and click on it Using Locator "XPath" //span[text()='Start a post']
        driver.findElementByXPath("//span[text()='Start a post']").click();
        //find button for who can see your post and click on that Using Locator "XPath" (//span[@class="share-state-change-button__label"])[1]
        WebElement check_viewer =  driver.findElementByXPath("(//span[@class=\"share-state-change-button__label\"])[1]");
        if(!check_viewer.getText().equalsIgnoreCase("Connections only")) {
            check_viewer.click();
            //select connections only radio button Using Locator "XPath" //strong[contains(text(),'Connections only')]
            WebElement connections_only = driver.findElementByXPath("//strong[contains(text(),'Connections only')]");
            connections_only.click();
            //click on save button Using Locator "XPath" //span[text()='Save']
            driver.findElementByXPath("//span[text()='Save']").click();
        }else {
            driver.findElementByXPath("//span[text()='Connections']").getText();
        }

        //find the texbox what do you want to talk about Using Locator "Class" Name "ql-editor ql-blank"
        WebElement Post_text = driver.findElementByTagName("br");
        //enter text in searchbox   "Drop by drop is the water pot filled. Likewise, the wise man, gathering it little by little, fills himself with good."
        Post_text.sendKeys( "Ardently do today what must be done. Who knows about Tomorrow");
        //click on post Using Locator "XPath" //span[text()='Post']
        driver.findElementByXPath("//span[text()='Post']");
        System.out.println("End Test case: posted_on_linkedin Successfully");
    }
}
