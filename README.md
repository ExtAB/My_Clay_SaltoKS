# My Clay SaltoKS appium BDD

Mobile automation framework using appium - BDD

## :rocket: Quick Start - Appium set up on Windows (Android):

1) Install [Java JDK8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
   and [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
2) Install [Android studio](https://developer.android.com/studio)
3) Install Appium Server (v2.x) using npm (CLI) command `npm install -g appium@next`
```
   Appium server version ${latest}
```
This will install the Appium server only, but no drivers. Install the latest versions of the XCUITest and UiAutomator2 drivers, after installing Appium you would run the following commands:
```
appium driver install uiautomator2
appium driver install xcuitest
```
```
Command to check the installed appium version: `appium --version`
```

5) Install [Appium desktop](https://github.com/appium/appium-desktop/releases/)
6) Install [Appium Inspector](https://github.com/appium/appium-inspector/releases)


## :panda_face: Creating Android Virtual Device (Emulator) from Android Studio:

1) Open Android Studio.
2) Click on Tools -> AVD Manager -> Create Virtual Device -> Select the device and OS version -> Finish.
3) Once Virtual device is created, click on Launch this AVD in the emulator.
4) Command to view the list of devices attached `adb devices`

## :snake: Android Real Device Set up:

1) Connect Android real device to the machine(Desktop/Laptop)
2) Turn on the developer options in android mobile
3) Enable USB debugging
4) Run command `adb devices` in cmd prompt to check whether the device is recognised

## :whale: Mirror android/ios device to your desktop
We can use an existing tool for this
1) Download [Vysor](https://www.vysor.io/)

## :dromedary_camel: Start Android Emulator from Command line

1) Open command prompt, go to `<sdk emulator path>`

```
Command to stard AVD: `emulator -avd <avd_name>`
Command to stop/kill AVD: `adb -e emu kill`
```

## :monkey: Pushing the App (.apk file) to Android Emulator:

1) Copy the .apk file and paste it in the path - `<path to sdk platform-tools>`
2) Open the cmd terminal from the directory where APK file is placed and enter command `adb install <apk filename>`

## :frog: Android - Finding appPackage and appActivity:

If the app is already installed on your device then we can make use of appPackage and appActivity to launch the app

<b> Option 1 : </b>
1) Open the app on the device, for which appPackage and appActivity is required.
2) Open powershell and enter command `adb shell dumpsys window | grep -E 'mCurrentFocus|mFocusedApp'`
NOTE: This command may not work for newer Android OS (10 or 11). In that case, use command:
   `adb shell "dumpsys activity activities | grep mResumedActivity"`

<b> Option 2 : </b>
Install <b> APK info </b> app to retrieve appPackage and appActivity for the app installed in your device

## :baby_chick: Thank you: