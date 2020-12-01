| *** Settings *** |
| Library        | AppiumLibrary |
| Library        | Process |
| Library        | BuiltIn |
| Library        | Collections |

| *** Variables *** |
| ${APPIUM_SERVER} | testingcloud.perfectomobile.com/nexperience/perfectomobile/wd/hub |
| ${Security_Token} | eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmZjE2YTM1ZS05ZDg3LTRkMjYtOTEyYS0xZmY0MzgwM2RjNjEifQ.eyJqdGkiOiI0ZGFiZDE4MS01MGJmLTQ2NjgtOTUyOS01OGE1YzVkZWViMzQiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNjA2NzU1MTc0LCJpc3MiOiJodHRwczovL2F1dGgyLnBlcmZlY3RvbW9iaWxlLmNvbS9hdXRoL3JlYWxtcy90ZXN0aW5nY2xvdWQtcGVyZmVjdG9tb2JpbGUtY29tIiwiYXVkIjoiaHR0cHM6Ly9hdXRoMi5wZXJmZWN0b21vYmlsZS5jb20vYXV0aC9yZWFsbXMvdGVzdGluZ2Nsb3VkLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6ImUwYWI5ZDljLTMyMDMtNGMxNC1hOWY1LTlmZTA0MmZiNzg2NSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzBkNzMyZGEtMDJjYy00Zjk2LThiMGYtNDNkMTkzNzE2NzgwIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiYmU3ZTRjMDMtZjgxYS00MDQ2LTljNTktMWM5NjU3MjAzZTVlIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBvZmZsaW5lX2FjY2VzcyBwcm9maWxlIGVtYWlsIn0.ykEM69qa2R16YSwOuY9ufJvZPZB4NLJ3z-M4iJm2zqo |

| *** Test Cases *** |
| TestBitriseRobot |
|    | Open Application | ${APPIUM_SERVER} | securityToken=${Security_Token} | app=PRIVATE:iOS-Jouve-2(2.7.0).ipa | deviceName=D50FDCE8126915EFB3AA2D177758454666F0D9AE | udid=D50FDCE8126915EFB3AA2D177758454666F0D9AE | platformName=iOS | automationName=XCUITest | noReset=True | bundleId=com.jouve.jmc.demo |
|    | Log Source |
