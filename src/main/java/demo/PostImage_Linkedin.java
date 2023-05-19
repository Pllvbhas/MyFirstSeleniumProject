package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PostImage_Linkedin extends TestCases{
    public static void post_image() throws AWTException, InterruptedException {
        System.out.println("Start Test case: post_image");
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
        //find photos button and click on it
        driver.findElementByXPath("//button[@aria-label='Add a photo']").click();
        // creating object of Robot class
        Robot rb = new Robot();
        // copying File path to Clipboard
        StringSelection str = new StringSelection("E:\\software-testing-principles.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        //click on select image to share button Using Locator "ID" "image-sharing-detour-container__file-input"
//        driver.findElementById("image-sharing-detour-container__file-input").click();
        Thread.sleep(3000); // suspending execution for specified time period

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        // Click on the "done" button Using Locator "XPath" //span[text()='Done']
        WebElement doneButton = driver.findElement(By.xpath("//span[text()='Done']"));
        doneButton.click();
        //click on the "What do you want to talk about" field and send text "This image is uploaded through selenium script"
        WebElement field = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
        field.sendKeys("This Trial image is uploaded through selenium script using Robot class");

        // Click on the "post" button Using Locator "XPath" //span[text()='Post']
        WebElement postBttn = driver.findElement(By.xpath("//span[text()='Post']"));
        postBttn.click();
        // click on dismiss the post successfull notification popup using locator xpath  //button[contains(@class,'artdeco-toast')]
        WebElement dismiss = driver.findElement(By.xpath("//button[contains(@class,'artdeco-toast')]"));
        dismiss.click();
        System.out.println("End Test case: image posted on linkedin successfully");
    }
}
