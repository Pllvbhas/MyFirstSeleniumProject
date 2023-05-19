package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HerokuAppFrames extends TestCases{
    public static void herokuapp_frames(){
        System.out.println("Start Test case: herokuapp_frames");
//        navigate to google homepage  www.google.com
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        //Locate the frame1 on the webPage
        WebElement frame1=driver.findElementByXPath("//frame[@name='frame-top']");

        //Switch to Frame1
        driver.switchTo().frame(frame1);

//        //Number of Frames on a Frame1
        int countIframesInFrame1 =driver. findElements(By. tagName("frame")). size();
        System.out.println("Number of Frames inside the Frame1:"+countIframesInFrame1);
        //Switch to child frame
        driver.switchTo().frame(0);
        String Frame1_child1_text = driver.findElementByTagName("body").getText();
        System.out.println(Frame1_child1_text);
        //Switch to Parent iFrame
        driver.switchTo().parentFrame();
        //Switch to child frame
        driver.switchTo().frame(1);
        String Frame1_child2_text = driver.findElementByTagName("body").getText();
        System.out.println(Frame1_child2_text);
        //Switch to Parent iFrame
        driver.switchTo().parentFrame();
        //Switch to child frame
        driver.switchTo().frame(2);
        String Frame1_child3_text = driver.findElementByTagName("body").getText();
        System.out.println(Frame1_child3_text);
        //driver.switchTo().parentFrame();
        //Switch to default content
        driver.switchTo().defaultContent();
        //Locate the frame2 on the webPage
        WebElement frame2=driver.findElementByXPath("//frame[@name='frame-bottom']");
        //Switch to Frame2
        driver.switchTo().frame(frame2);
        String Frame2_text = driver.findElementByTagName("body").getText();
        System.out.println(Frame2_text);
        System.out.println("End Test case: herokuapp_frames");
    }
}
