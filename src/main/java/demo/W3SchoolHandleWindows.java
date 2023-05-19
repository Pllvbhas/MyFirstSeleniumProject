package demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class W3SchoolHandleWindows extends TestCases{
    public static void w3school_Window(){
        System.out.println("Start Test case: w3school_Window");
//        navigate to site w3school  W3Schools Tryit Editor - The prompt() Method
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        driver.switchTo().frame(driver.findElementByXPath("//*[@name='iframeResult']"));
        //click on tryit button Using Locator "XPath" //button[@onclick='myFunction()']
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Try it']")));
        driver.findElementByXPath("//button[text()='Try it']").click();
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
                System.out.println(driver.switchTo().window(child_window).getTitle());
                //Take the screenshot
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                //Copy the file to a location and use try catch block to handle exception
                try {
                    FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                driver.close();
            }

        }
//switch to the parent window
        driver.switchTo().window(parent);
        System.out.println("End Test case: Window handled successfully");
    }
}
