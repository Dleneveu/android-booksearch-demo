import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startExistingApplication('com.apple.camera')

Mobile.tap(findTestObject('Spy/XCUIElementTypeButton - PhotoCapture'), 0)

String dossierIfuse = org.apache.commons.lang.RandomStringUtils.random(9, true, true)

System.out.println(dossierIfuse)

Runtime.getRuntime().exec('mkdir /Users/dleneveu/Desktop/' + dossierIfuse)

Runtime.getRuntime().exec('ifuse -u 91ee03901876994b0a6304721fb6ad9f50b7c7e2 /Users/dleneveu/Desktop/' + dossierIfuse)

Mobile.delay(3)

String one = '/Users/dleneveu/Desktop/'

String two = dossierIfuse

String three = '/DCIM/100APPLE/'

String dossierIphone = one + two + three

System.out.println(dossierIphone)

File dir = new File(dossierIphone)

File[] files = dir.listFiles()

if (files == null || files.length == 0) {
}

String fichier = files[files.length - 1]

System.out.println(fichier)

String nomFichier = files[files.length - 1].getName()

Runtime.getRuntime().exec('rm ' + fichier)

Runtime.getRuntime().exec('cp /Users/dleneveu/Desktop/rectoCIBC.jpg ' + dossierIphone)

Runtime.getRuntime().exec('mv ' + dossierIphone + '/rectoCIBC.jpg ' + dossierIphone + '' + nomFichier + '')

Mobile.delay(3)

Mobile.tap(findTestObject('Spy/XCUIElementTypeButton - PhotoCapture'), 0)

Mobile.delay(3)

String dossierIfuse2 = org.apache.commons.lang.RandomStringUtils.random(9, true, true)

System.out.println(dossierIfuse2)

Runtime.getRuntime().exec('mkdir /Users/dleneveu/Desktop/' + dossierIfuse2)

Runtime.getRuntime().exec('ifuse -u 91ee03901876994b0a6304721fb6ad9f50b7c7e2 /Users/dleneveu/Desktop/' + dossierIfuse2)

Mobile.delay(3)

String one2 = '/Users/dleneveu/Desktop/'

String two2 = dossierIfuse2

String three2 = '/DCIM/100APPLE/'

String dossierIphone2 = one2 + two2 + three2

System.out.println(dossierIphone2)

File dir2 = new File(dossierIphone2)

File[] files2 = dir2.listFiles()

if (files2 == null || files2.length == 0) {
}

String fichier2 = files2[files2.length - 1]

System.out.println(fichier2)

String nomFichier2 = files2[files2.length - 1].getName()

Runtime.getRuntime().exec('rm ' + fichier2)

Runtime.getRuntime().exec('cp /Users/dleneveu/Desktop/judoBC.jpg ' + dossierIphone2)

Runtime.getRuntime().exec('mv ' + dossierIphone2 + '/judoBC.jpg ' + dossierIphone2 + '' + nomFichier2 + '')

Mobile.startApplication('com.jouve.jmc.demo', false)
Mobile.setText(findTestObject('Spy/XCUIElementTypeTextField - Login (2)'), 'dleneveu', 0)
Mobile.setText(findTestObject('Spy/XCUIElementTypeSecureTextField - Mot de passe (2)'), '0dleneveu0*', 0)
Mobile.tap(findTestObject('Spy/XCUIElementTypeButton - Se connecter (2)'), 0)
Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - COMPTE  BANCAIRE'), 0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Dmarrer linscription'), 0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Jaccepte'), 0)
Mobile.tap(findTestObject('Object Repository/Spy/CI'), 0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Continuer'), 0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Choisir une image'),0)
Mobile.tap(findTestObject('Object Repository/Spy/CIOK'),0)
Mobile.tap(findTestObject('Object Repository/Spy/Facture'),0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Continuer'), 0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Choisir une image'),0)
Mobile.tap(findTestObject('Object Repository/Spy/FACTUREOK'),0)
Mobile.setText(findTestObject('Object Repository/Spy/email'), 'dleneveu@jouve.com', 0)
Mobile.setText(findTestObject('Object Repository/Spy/no tel'), '0645295455', 0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Continuer (3)'),0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Continuer (3)'),0)
Mobile.tap(findTestObject('Object Repository/Spy/XCUIElementTypeButton - Continuer (3)'),0)
Mobile.closeApplication()

