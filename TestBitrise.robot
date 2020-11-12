| *** Settings *** |
| Library        | AppiumLibrary |
| Library        | Process |
| Library        | BuiltIn |
| Library        | Collections |

| *** Variables *** |
| ${APPIUM_SERVER} | https://DamienLJouve2222:de34c4d6-bbfe-442f-9628-259757d39b22@api.kobiton.com/wd/hub |

| *** Test Cases *** |
| TestBitriseRobot |
|    | Open Application | ${APPIUM_SERVER} | app=com.apple.camera | version=12 | platform=iOS | deviceName=test | platformName=iOS | newCommandTimeout=0 | automationName=XCUITest | usePrebuiltWDA=true |
