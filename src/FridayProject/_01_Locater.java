package FridayProject;

import Methods.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Locater {

    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.lidl.com/register");

            WebElement InputEnterName = driver.findElement(By.id("input0"));
            InputEnterName.click();
            InputEnterName.sendKeys("Burcu");

            WebElement LastName = driver.findElement(By.id("input1"));
            LastName.click();
            LastName.sendKeys("Kiray");

            WebElement Email = driver.findElement(By.id("input2"));
            Email.click();
            Email.sendKeys("burcu_kry@hotmail.com");

            WebElement ConfirmMail=driver.findElement(By.id("input3"));
            ConfirmMail.click();
            ConfirmMail.sendKeys("burcu_kry@hotmail.com");


             WebElement Password=driver.findElement(By.id("input4"));
             Password.click();
             Password.sendKeys("Bkry.123");

             WebElement PhoneNumber=driver.findElement(By.id("input5"));
             PhoneNumber.click();
             PhoneNumber.sendKeys("1234 256 234");

             WebElement ZipCode=driver.findElement(By.id("input6"));
             ZipCode.click();
             ZipCode.sendKeys("77654");

             WebElement Birthday=driver.findElement(By.id("date-picker-dialog"));
             Birthday.click();
             Birthday.sendKeys("05051989");

             WebElement AdressLine=driver.findElement(By.id("input7"));
             AdressLine.click();
             AdressLine.sendKeys("35 Willow Brook");

             WebElement City=driver.findElement(By.id("input8"));
             City.click();
             City.sendKeys("Houston");

             WebElement State=driver.findElement(By.name("mailingState"));
             State.click();
             State.sendKeys("Texas");

             WebElement Devam=driver.findElement(By.id("onetrust-accept-btn-handler"));
             Devam.click();

             WebElement TermsAndConditions=driver.findElement(By.className("square"));
             TermsAndConditions.click();

             WebElement Login=driver.findElement(By.className("spinnie-container"));
             Login.click();


        MyMethods.MyWait(5);
        }
    }


