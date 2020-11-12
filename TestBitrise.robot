| *** Settings *** |
| Library        | AppiumLibrary |
| Library        | Process |
| Library        | BuiltIn |
| Library        | Collections |

| *** Variables *** |
| ${APPIUM_SERVER_URL} | https://DamienLJouve2222:de34c4d6-bbfe-442f-9628-259757d39b22@api.kobiton.com/wd/hub |
| ${ANDROID_DRIVER} | iautomator2 |
| ${PLATFORM_NAME} | Android |
| ${DEVICE_NAME} | Galaxy A5(2016) |
| ${APP_PACKAGE} | com.jouve.jmcappdemonstrator |
| ${LAUNCH_ACTIVITY} | com.jouve.jmcappdemonstrator.onboarding.splashscreen.SplashScreenActivity |

| *** Test Cases *** |
| TestBitriseRobot |
|    | Open Application | ${APPIUM_SERVER_URL}/wd/hub | automationName=${ANDROID_DRIVER} | platformName=${PLATFORM_NAME} | deviceName=${DEVICE_NAME} | appPackage=${APP_PACKAGE} | appWaitForLaunch=true | appActivity=${LAUNCH_ACTIVITY} | appWaitActivity=${LAUNCH_ACTIVITY} | newCommandTimeout=5000 |
