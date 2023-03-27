import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;


public class Login {

    static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        try {
            login();
        }catch(Exception err) {
            System.out.println(err.getCause());
            System.out.println(err.getMessage());
            err.printStackTrace();
        }

    }

    public static void login() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName","Pixel 6 API 31");
            cap.setCapability("platformName","Android");
            cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("appPackage","nl.moboa.myclay");
        cap.setCapability("appActivity","nl.moboa.myclay.main.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);


        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        for( int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            (new TouchAction(driver)).tap(PointOption.point(508, 1465)).perform();
        }

        WebElement email = driver.findElement(By.className("android.widget.EditText"));
        email.sendKeys("ts@my-clay.com");

        WebElement continueButton = driver.findElement(By.className("android.widget.Button"));
        continueButton.click();
//
//
//        WebElement acceptButton = driver.findElement(By.className("android.widget.Button"));
//        acceptButton.click();
//        WebElement noThanksButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
//        noThanksButton.click();
//
        WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText"));
        password.sendKeys("123456Ab");
        WebElement submitButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[5]/android.widget.Button"));
        submitButton.click();
        WebElement testUser = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"site_4\"]/android.widget.HorizontalScrollView"));
        testUser.click();
        for( int i = 0; i < 3; i++) {
        WebElement next = driver.findElement(By.xpath("//android.widget.Button[@text='NEXT']"));
        next.click();
        Thread.sleep(1500);
        }
        WebElement done = driver.findElement(By.xpath("//android.widget.Button[@text='DONE']"));
        done.click();

        WebElement settings = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]/android.widget.FrameLayout/android.widget.ImageView"));
        settings.click();

//        for( int i = 0; i < 5; i++) {
//            (new TouchAction(driver)).longPress(PointOption.point(498, 1684)).moveTo(PointOption.point(508, 800)).release().perform();
//            Thread.sleep(1500);
//        }


//        Thread.sleep(1500);
//        WebElement logOut = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[8]/android.view.ViewGroup"));
//        logOut.click();

//

    }
}

