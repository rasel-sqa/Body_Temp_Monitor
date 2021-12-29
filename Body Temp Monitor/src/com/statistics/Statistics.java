package com.statistics;

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


@DisplayName("Statistics")
public class Statistics implements ExceptionsReporter {
  public static IOSDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new IOSDriver<>("6MMJDMg-aapwAcaxOU0zZrkY6GTh-BDywc4uFh6S7qU", getCapabilities(), "Md Rasel");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Statistics")
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

    // 2. Click 'XCUIELEMENTTYPEIMAGE2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeWindow/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    driver.findElement(by).click();

    // 3. Click '14 Days'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("14 Days");
    driver.findElement(by).click();

    // 4. Click '30 Days'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("30 Days");
    driver.findElement(by).click();

    // 5. Click 'c'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("c");
    driver.findElement(by).click();

    // 6. Click '14 Days'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("14 Days");
    driver.findElement(by).click();

    // 7. Click '7 Days'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("7 Days");
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
