package org.example.pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.enums.WaitStrategy;
import org.example.pageobjects.screen.ScreenActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends ScreenActions {

  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
  private static WebElement productPageTitle;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Locks\"]/android.widget.FrameLayout/android.widget.ImageView")
  private static WebElement locks;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"People\"]/android.widget.FrameLayout/android.widget.ImageView")
  private static WebElement people;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Events\"]/android.widget.FrameLayout/android.widget.ImageView")
  private static WebElement events;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"IQs\"]/android.widget.FrameLayout/android.widget.ImageView")
  private static WebElement iqs;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Settings\"]/android.widget.FrameLayout/android.widget.ImageView")
  private static WebElement settings;

  public String getProductPageTitle() {
    return getText(productPageTitle, WaitStrategy.VISIBLE);
  }
  public Boolean isProductPageTitleVisible() {
    return isElementDisplayed(productPageTitle);
  }

  public SettingsPage settingsPage(){
    click(settings);
    return new SettingsPage();
  }

  public PeoplePage navigateToUsers(){
    click(people);
    return new PeoplePage();
  }


}