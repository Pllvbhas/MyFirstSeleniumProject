package demo;

import org.openqa.selenium.Alert;

public class W3SchoolAlert extends TestCases{
    public static void w3school_Alert(){
        System.out.println("Start Test case: w3school_Alert");
//        navigate to site w3school  W3Schools Tryit Editor - The prompt() Method
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        driver.switchTo().frame(driver.findElementByXPath("//*[@name='iframeResult']"));
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Try it']")));
        driver.findElementByXPath("//button[text()='Try it']").click();
        //switch focus to alert
        Alert a = driver.switchTo().alert();
        //send alert text
        driver.switchTo().alert().sendKeys("Pallavi Patil");
        driver.switchTo().alert().accept();
        //get alert text
        // driver.switchTo().frame(driver.findElementByXPath("//*[@name='iframeResult']"));
        boolean status = driver.findElementByXPath("//p[starts-with(text(),'Hello ')]").isDisplayed();
        String s = driver.findElementByXPath("//p[starts-with(text(),'Hello ')]").getText();
        System.out.println("Alert text is: " + s);
        System.out.println("End Test case: Alert handled successfully");
    }
}
