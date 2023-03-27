package org.example.pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.example.enums.WaitStrategy;
import org.example.pageobjects.screen.ScreenActions;
import org.openqa.selenium.WebElement;

public class LoginPage extends ScreenActions {

  @AndroidFindBy(className = "android.widget.EditText")
  @iOSXCUITFindBy(className = "android.widget.EditText")
  private static WebElement textUsernameField;

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
  @iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
  private static WebElement textPasswordField;

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[5]/android.widget.Button")
  @iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[5]/android.widget.Button")
  private static WebElement loginButton;

  @AndroidFindBy(tagName = "android.widget.Text.Errormessage")
  private static WebElement errorMessage;

  public boolean isLoginPageDisplayed() {
    return isElementDisplayed(textUsernameField);
  }

  public LoginPage setUsername(String username) {
    enter(textUsernameField, username);
    return this;
  }

  public LoginPage setPassword(String password) {
    enter(textPasswordField, password);
    return this;
  }

  public ProductPage tapOnLogin() {
    click(loginButton);
    return new ProductPage();
  }

  public ProductPage login(String username, String password) {
    setUsername(username)
      .setPassword(password)
      .tapOnLogin();

    return new ProductPage();
  }

  public String getErrorText() {
    return getText(errorMessage, WaitStrategy.VISIBLE);
  }
}
