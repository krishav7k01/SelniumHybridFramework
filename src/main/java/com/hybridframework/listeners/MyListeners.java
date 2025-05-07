package com.hybridframework.listeners;


import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.hybridframework.base.DriverManager;
import com.hybridframework.utils.ScreenshotUtil;
import com.hybridframework.utils.reports.ExtentManager;


public class MyListeners implements ITestListener {
	
	private static final Logger logger = LoggerFactory.getLogger(MyListeners.class);
	

	@Override
	public void onStart(ITestContext context) {
	    ExtentManager.startReport();  // Initialize ExtentReports here
	    
	}
	
    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test started: {}", result.getMethod().getMethodName());
        ExtentManager.startTestCase(result.getTestClass().getName());
        if(result.getMethod() != null)
        {
        ExtentManager.setNode(result.getMethod().getMethodName());
        }
        }

    @Override
    public void onTestSuccess(ITestResult result) {
    	ExtentManager.getTest().pass("Test passed");
    	 WebDriver driver = DriverManager.getDriver();
         String path = ScreenshotUtil.captureScreenshot(driver, ExtentManager.getTestName());
         ExtentManager.getTest().addScreenCaptureFromPath(path);

    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test failed: {}", result.getMethod().getMethodName(), result.getThrowable());
        ExtentManager.getTest().fail(result.getThrowable());
        WebDriver driver = DriverManager.getDriver();
        String path = ScreenshotUtil.captureScreenshot(driver, ExtentManager.getTestName());
        ExtentManager.getTest().addScreenCaptureFromPath(path);
        ;
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("Test skipped: {}", result.getMethod().getMethodName());
        
    }
    
    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.flushReport();  // Flush after all tests
    }
}
