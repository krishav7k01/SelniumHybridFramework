package com.hybridframework.base;
import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	 // ThreadLocal so that in case of parallel testing, Each Test should have own thread
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // set the driver
    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    //get the driver
    public static WebDriver getDriver() {
        return driver.get();
    }

    //remove the driver
    public static void removeDriver() {
        driver.remove();
    }

}
