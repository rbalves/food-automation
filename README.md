# Mobile Automation Test

Mobile automation project: Food application, installed through APK.

## Features

This is an automation project of the Food application. He advances the tutorial, accesses the registration page and submits the information. After that, submit a valid token and proceed to the home page.

## Environment Setting

To execute the project, it was necessary to install and configure the following programs:

- [JDK](https://www.oracle.com/technetwork/java/javase/14-0-1-relnotes-5972653.html)
	
After installing the JDK, it was necessary to perform the following steps:
1. Create the JAVA_HOME variable with the default JDK path which is usually C: \ Program Files \ Java \ <jdk_version>
2. Edit the Path variable by adding% JAVA_HOME% \ bin;
3. Confirm the installation using the java -version command


- [Eclipse](https://www.eclipse.org/downloads/packages/)

- [Appium Desktop 1.3.2](https://github.com/appium/appium-desktop/releases/tag/v1.3.2)

- [Android Studio](https://developer.android.com/studio/?gclid=CjwKCAjwztL2BRATEiwAvnALcrHVy1uI94z9zNuuiesgZmRlkJQJRXPDbt001Iv58jfVMCN9qLUPZhoCL1IQAvD_BwE&gclsrc=aw.ds)

After installing Android Studio, some tools were installed through the SDK Manager> Appearance & Behavior> Android SDK:
1. In SDK Platforms, Android 7.0 was selected
2. In SDK Tools, Android Emulator, Android SDK Build-Tools, Android SDK Platform-Tools and Android SDK Tools were selected.

I copied the Android SDK Location to create the ANDROID_HOME variable.

It was also necessary to edit the Path variable and add the following paths:
1. %ANDROID_HOME%\tools
2. %ANDROID_HOME%\tools\bin
3. %ANDROID_HOME%\platform-tools

To test the changes, the following commands were run: adb, emulator and uiautomatorviewer.

To configure the emulator, a standard project was created in Android Studio. After that, AVD Manager was accessed and a new Virtual Device Nexus 5X API 24, Android 7.0 was created.

The process of booting the emulator through Android Studio would be very costly. The alternative found was to create a file called start_emulator.bat with the following commands:
```shell
cd c:\\Users\\<user>\\AppData\\Local\\Android\\Sdk\\tools
emulator @Nexus_5x_API_24	
```

## Creating and running the project
A standard Maven project has been created. The test packages created have been removed, as as an automation project, tests are developed and executed in the main classes. The dependencies are managed by Maven through the pom.xml file. The XML portions of the facilities were consulted at [MVNRepository](https://mvnrepository.com/).

To run the test class, you need to access Run > Run as > JUnit Test.

## Dependencies
- Appium Java Client 5.0.4
- JUnit 4.12
- Cucumber Java 1.2.6
- Cucumber JUnit 1.2.6

## View project online execution

To see the automation working, just access the link below:
- [Automation video](https://www.loom.com/share/ad7ab4b02cbd44beb8e24f9ba4d340a6)