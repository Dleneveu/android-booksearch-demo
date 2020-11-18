| *** Settings *** |
| Library        | AppiumLibrary |
| Library        | Process |
| Library        | BuiltIn |
| Library        | Collections |

| *** Variables *** |
| ${APPIUM_SERVER} | testingcloud.perfectomobile.com/nexperience/perfectomobile/wd/hub |
| ${Security_Token} | eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmZjE2YTM1ZS05ZDg3LTRkMjYtOTEyYS0xZmY0MzgwM2RjNjEifQ.eyJqdGkiOiI1ZjI2MWQxZC1lYjI2LTRmZWEtOTJiMS1hNjljYmYyNWYzNWUiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNjA1MTc5ODA1LCJpc3MiOiJodHRwczovL2F1dGgyLnBlcmZlY3RvbW9iaWxlLmNvbS9hdXRoL3JlYWxtcy90ZXN0aW5nY2xvdWQtcGVyZmVjdG9tb2JpbGUtY29tIiwiYXVkIjoiaHR0cHM6Ly9hdXRoMi5wZXJmZWN0b21vYmlsZS5jb20vYXV0aC9yZWFsbXMvdGVzdGluZ2Nsb3VkLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6IjBjMTYxZTFhLWFiN2MtNDJjZi05Y2NkLWQzM2MwYjQ2NDNkOCIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiNDcyMDYxOGItMDY4Yy00ZGUzLThkM2YtNjAzYzIyM2Q0OTkzIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNjUxZTE1N2UtYWU4Ni00NmQzLWFjNjQtZjBiNmE2ZDZmZDM1IiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBvZmZsaW5lX2FjY2VzcyBwcm9maWxlIGVtYWlsIn0.VJHUZ6rx0ion6HaOHZpdyyuJTCQ8bEuWHNLzRHIbNhQ |

| *** Test Cases *** |
| TestBitriseRobot |
|    | Open Application | ${APPIUM_SERVER} | securityToken=${Security_Token} | deviceName=00008020-000209200291002E | udid=00008020-000209200291002E | platformName=iOS | automationName=XCUITest | noReset=True | bundleId=com.apple.camera |
|    | Log Source |
