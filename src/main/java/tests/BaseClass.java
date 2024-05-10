//package tests;
////import org.junit.Test;
////import org.junit.Before;
//
//import com.google.common.annotations.VisibleForTesting;
//import io.appium.java_client.AppiumDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.net.URL;
//
//public class BaseClass {
//
//    AppiumDriver appiumDriver;
//
//
//@BeforeClass
//    public void setup() {
//        try{
//            DesiredCapabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("platformVersion", "14.0");
//            capabilities.setCapability("deviceName", "MyPixel 5 API 34");
//            capabilities.setCapability("automationName", "UiAutomator2");
//
//            URL url = new URL("http://192.168.0.59:4723/wd/hub");
//
//            appiumDriver = new AppiumDriver(url, capabilities);
//        }
//        catch (Exception e){
//            System.out.println("Cause is : " + e.getCause());
//            System.out.println("Message is : " +e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//
//    public void teardown(){
//
//    }
//
//
//
//    @Test
//    public void sampleTest(){
//        System.out.println("HERE:");
//    }
//
//
//}
