package com.home;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.ios.IOSDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


 
@DisplayName("Home")
public class Home implements ExceptionsReporter {
  public static IOSDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new IOSDriver<>("6MMJDMg-aapwAcaxOU0zZrkY6GTh-BDywc4uFh6S7qU", getCapabilities(), "Md Rasel");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Home")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Reset App
    //    Clear application data and restart (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.resetApp();

    // 2. Click 'XCUIELEMENTTYPEIMAGE1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage");
    driver.findElement(by).click();

    // 3. Click 'Edit'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Edit' AND visible == 1");
    driver.findElement(by).click();

    // 4. Clear 'XCUIELEMENTTYPETEXTFIELD' contents
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND visible == 1");
    driver.findElement(by).clear();

    // 5. Type 'Mr Sabbir Hossain' in 'XCUIELEMENTTYPETEXTFIELD'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND visible == 1");
    driver.findElement(by).sendKeys("Mr Sabbir Hossain");

    // 6. Click 'Male'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Male' AND visible == 1");
    driver.findElement(by).click();

    // 7. Click 'Save'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Save' AND visible == 1");
    driver.findElement(by).click();

    // 8. Click '09 Dec - 30 Dec'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == ' 09 Dec - 30 Dec' AND visible == 1");
    driver.findElement(by).click();

    // 9. Click '8'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("8");
    driver.findElement(by).click();

    // 10. Click '30'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeCell[33]//XCUIElementTypeStaticText");
    driver.findElement(by).click();

    // 11. Click 'Continue'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Continue' AND visible == 1");
    driver.findElement(by).click();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of());
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
    capabilities.setCapability(MobileCapabilityType.UDID, "00008030-0018096E1E99802E");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 (QA)");
    capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "io.appnap.apn063");
    return capabilities;
  }
}
