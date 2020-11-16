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

Mobile.startExistingApplication('com.jouve.jmcappdemonstrator')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - COMPTE BANCAIRE'), 0)

Mobile.tap(findTestObject('Spy/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Jaccepte'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Carte nationale didentit'), 0)

Mobile.tap(findTestObject('Spy/android.widget.RelativeLayout0 (1)'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Choisir une image'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - rectoCIBC.jpg'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Facture'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Continuer'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Choisir une image'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - judoBC.jpg'), 0)

Mobile.setText(findTestObject('Spy/android.widget.EditText0 - Veuillez saisir votre email'), 'jouve@test.com', 0)

Mobile.setText(findTestObject('Spy/android.widget.EditText0 - Numro de tlphone'), '0612345678', 0)

Mobile.tap(findTestObject('Spy/android.widget.RelativeLayout0 (2)'), 0)

Mobile.tap(findTestObject('Spy/android.widget.Button0 - Non'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Continuer (1)'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Passer cette tape'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Continuer (1)'), 0)

Mobile.scrollToText('Valider')

Mobile.tap(findTestObject('Spy/android.widget.RelativeLayout0 (3)'), 0)

Mobile.tap(findTestObject('Spy/android.widget.TextView0 - Continuer (1)'), 0)

Mobile.closeApplication()

