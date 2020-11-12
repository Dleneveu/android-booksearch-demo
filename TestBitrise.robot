| *** Settings *** |
| Library        | AppiumLibrary |
| Library        | Process |
| Library        | BuiltIn |
| Library        | Collections |

| *** Variables *** |
| ${APPIUM_SERVER_URL} | http://127.0.0.1:4723 |
| ${ANDROID_DRIVER} | iautomator2 |
| ${PLATFORM_NAME} | Android |
| ${DEVICE_NAME} | mobile de test |
| ${DEVICE_ID}   | 910e89cfccac |
| ${APP_PACKAGE} | com.jouve.jmcappdemonstrator |
| ${RESET_OFF}   | true |
| ${LAUNCH_ACTIVITY} | com.jouve.jmcappdemonstrator.onboarding.splashscreen.SplashScreenActivity |

| *** Test Cases *** |
| TestBitriseRobot |
|    | Open Application | ${APPIUM_SERVER_URL}/wd/hub | automationName=${ANDROID_DRIVER} | platformName=${PLATFORM_NAME} | deviceName=${DEVICE_NAME} | udid=${DEVICE_ID} | appPackage=${APP_PACKAGE} | noReset=${RESET_OFF} | appWaitForLaunch=true | appActivity=${LAUNCH_ACTIVITY} | appWaitActivity=${LAUNCH_ACTIVITY} | newCommandTimeout=5000 |
