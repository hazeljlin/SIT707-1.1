package sit707;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Selenium test...");

        // Path to chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/jxl/desktop/2025T1/SIT707/chromedriver-mac-arm64/chromedriver");

        // Tell Selenium to use the correct Chrome binary
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Users/jxl/desktop/2025T1/SIT707/chrome-mac-arm64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");

        WebDriver driver = new ChromeDriver(options);
        System.out.println("ChromeDriver launched.");

        driver.get("https://www.google.com");
        System.out.println("Opened Google.");

        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test finished.");
    }
}






