package com.test.selinum;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");

                WebDriver driver = new ChromeDriver(chromeOptions);

                driver.get("http://ec2-3-15-148-238.us-east-2.compute.amazonaws.com:8082/");

                Thread.sleep(1000);

                if (driver.getPageSource().contains("Home")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
		 driver.findElement(By.linkText("Home")).click();
                String at = driver.getTitle();
                //System.out.println(at);
                String et = "Home";
                driver.close();
                if (at.contains(et)) {
                        System.out.println("Test Successfull");
                } else {
                        System.out.println("Test is not successful");

		}
                driver.quit();
        }
}