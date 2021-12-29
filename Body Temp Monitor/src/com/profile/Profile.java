package com.profile;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.ios.IOSDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.time.Duration;
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



@DisplayName("Profile")
public class Profile implements ExceptionsReporter {
  public static IOSDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new IOSDriver<>("6MMJDMg-aapwAcaxOU0zZrkY6GTh-BDywc4uFh6S7qU", getCapabilities(), "Md Rasel");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Profile")
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

    // 2. Click 'XCUIELEMENTTYPEIMAGE4'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeImage");
    driver.findElement(by).click();

    // 3. Click 'XCUIELEMENTTYPEIMAGE5'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeCell[17]//XCUIElementTypeImage");
    driver.findElement(by).click();

    // 4. Click 'camera icon'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("camera icon");
    driver.findElement(by).click();

    // 5. Click 'Choose from the Gallery'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Choose from the Gallery' AND visible == 1");
    driver.findElement(by).click();

    // 6. Click 'Female'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Female' AND visible == 1");
    driver.findElement(by).click();

    // 7. Click 'Choose'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("Choose");
    driver.findElement(by).click();

    // 8. Click 'XCUIELEMENTTYPEIMAGE6'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeCell[7]//XCUIElementTypeImage");
    driver.findElement(by).click();

    // 9. Type 'Mr XYZ' in 'XCUIELEMENTTYPETEXTFIELD'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND visible == 1");
    driver.findElement(by).sendKeys("Mr XYZ");

    // 10. Click 'Male'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Male' AND visible == 1");
    driver.findElement(by).click();

    // 11. Click 'Mr I'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("Mr I");
    driver.findElement(by).click();

    // 12. Make a Swipe gesture from ('650','1117') to ('642','1502')
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(650,1117))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(642,1502)).release().perform();

    // 13. Make a Swipe gesture from ('658','1240') to ('669','1423')
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(658,1240))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(669,1423)).release().perform();

    // 14. Click 'Save'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Save' AND visible == 1");
    driver.findElement(by).click();

    // 15. Click 'Save'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Save' AND visible == 1");
    driver.findElement(by).click();

    // 16. Click 'XCUIELEMENTTYPEIMAGE7'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeCell[6]//XCUIElementTypeImage");
    driver.findElement(by).click();

    // 17. Click 'Delete'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Delete' AND visible == 1");
    driver.findElement(by).click();

    // 18. Click 'OK'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'OK' AND visible == 1");
    driver.findElement(by).click();

    // 19. Click 'non selected'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeButton");
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
