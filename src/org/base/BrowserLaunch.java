package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\seleniumpalanivelsir\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("");
driver.manage().window().maximize();


}
}
