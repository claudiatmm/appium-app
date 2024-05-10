package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import xmlUtility.GeneralXml;
import xmlUtility.xmlNode.Configuration;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

public class Connection {


   public static AppiumDriverLocalService service;
   public static AndroidDriver driver;
   public static Configuration configuration = GeneralXml.createConfig(Configuration.class);



    @BeforeClass
    public static void prepareConnection() throws MalformedURLException {
        startAppiumServer();
        setCapClient();

    }

    public static void startAppiumServer() {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\claud\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress(configuration.serverConfiguration.IPaddress).usingPort(4723)
                .withTimeout(Duration.ofSeconds(300))
                .build();
        service.start();

    }

    public static void setCapClient() throws MalformedURLException {
//        URL url = new URL("http://192.168.0.59:4723/wd/hub");
        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName(configuration.capabilities.deviceName)
                    .setApp(System.getProperty("user.dir")+"\\src\\main\\resources\\ApiDemos-debug.apk")
                    .setUdid(configuration.capabilities.udId)
                    .setPlatformName(configuration.capabilities.platformName)
                    .setPlatformVersion(configuration.capabilities.platformVersion);

//          AndroidDriver driver = new AndroidDriver(options);
            driver = new AndroidDriver(options);

            System.out.println("Application has started : --------->>>>>");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        catch (Exception e) {
            System.out.println("Error message!! " + e.getMessage());
            System.out.println("Error !! " + e.getCause());
        }
    }


    @AfterClass
    public static void closeConnection() {
        driver.quit();
        service.stop();
    }



}
