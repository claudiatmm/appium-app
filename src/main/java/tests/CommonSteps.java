package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CommonSteps {


    public void goToMainPage(AndroidDriver driver){
        driver.findElement(By.xpath("ss"));
    }

}
