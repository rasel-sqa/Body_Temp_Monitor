package com.plusbutton;

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


 
@DisplayName("Plus button")
public class PlusButton implements ExceptionsReporter {
  public static IOSDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new IOSDriver<>("6MMJDMg-aapwAcaxOU0zZrkY6GTh-BDywc4uFh6S7qU", getCapabilities(), "Md Rasel");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Plus button")
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

    // 2. Click 'XCUIELEMENTTYPEIMAGE3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeImage");
    driver.findElement(by).click();

    // 3. Make a Swipe gesture from ('358','904') to ('238','913')
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(358,904))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(238,913)).release().perform();

    // 4. Click 'Continue'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Continue' AND visible == 1");
    driver.findElement(by).click();

    // 5. Click 'Good'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Good' AND visible == 1");
    driver.findElement(by).click();

    // 6. Click 'Normal'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton[2]/XCUIElementTypeStaticText");
    driver.findElement(by).click();

    // 7. Click 'Oral'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Oral' AND visible == 1");
    driver.findElement(by).click();

    // 8. Click 'Forehead'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Forehead' AND visible == 1");
    driver.findElement(by).click();

    // 9. Click 'Cold'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("Cold");
    driver.findElement(by).click();

    // 10. Click 'Dry Cough'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("Dry Cough");
    driver.findElement(by).click();

    // 11. Click 'XCUIELEMENTTYPETEXTVIEW'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextView' AND visible == 1");
    driver.findElement(by).click();

    // 12. Type 'Test Data' in 'XCUIELEMENTTYPETEXTVIEW'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextView' AND visible == 1");
    driver.findElement(by).sendKeys("Test Data");

    // 13. Click 'Save1'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND label == 'Save' AND visible == 1");
    driver.findElement(by).click();

    // 14. Click 'XCUIELEMENTTYPEIMAGE3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeImage");
    driver.findElement(by).click();

    // 15. Click 'Fahrenheit'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("Fahrenheit");
    driver.findElement(by).click();

    // 16. Make a Swipe gesture from ('409','929') to ('285','932')
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(409,929))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(285,932)).release().perform();

    // 17. Click 'Continue'
    GeneratedUtils.sleep(500);
    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND label == 'Continue' AND visible == 1");
    driver.findElement(by).click();

    // 18. Click 'back'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("back");
    driver.findElement(by).click();

    // 19. Click 'Close Button'
    GeneratedUtils.sleep(500);
    by = MobileBy.AccessibilityId("Close Button");
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
