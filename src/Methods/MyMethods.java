package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyMethods {

    public static void MyWait(int time) {
        WebDriver element=new ChromeDriver();

        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.quit();
    }
}
