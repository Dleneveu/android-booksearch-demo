import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.TakesScreenshot
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.Scenario
import cucumber.api.java.After
import cucumber.api.java.BeforeStep
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import java.nio.file.Files

class StepJMC{

	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String filePath = Mobile.takeScreenshot()
			File file = new File(filePath)
			scenario.embed(Files.readAllBytes(file.toPath()), "image/png")
		}
	}

	/////////////
	//////////////////////////
	// VERSION MÊME KEYWORD MAIS MARCHE POUR ANDROID ET IOS
	//////////////////////////
	/////////////
	@Given("Je suis sur la page de connexion JMC")
	def Je_suis_sur_la_page_de_connexion_JMC() {
		if(Mobile.getDeviceOS() == "iOS"){
			Mobile.startExistingApplication('com.jouve.jmc.demo')
		}
		else{
			sleep(10000) // plus parlant pour l'exemple de parallel
			Mobile.startExistingApplication('com.jouve.jmcappdemonstrator')
		}
	}

	@When("Je vois la page de connexion JMC")
	def Je_vois_la_page_de_connexion_JMC() {
		if(Mobile.getDeviceOS() == "iOS"){
			Mobile.verifyElementVisible(findTestObject('Spy/XCUIElementTypeTextField - Login (2)'), 0)
		}
		else{
			Mobile.verifyElementVisible(findTestObject('Object Repository/Spy/android/android.widget.TextView0 - Se connecter'), 0)
		}
	}

	@And("J'écris le pseudo (.*) et le mot de passe (.*)")
	def J_ecris_le_pseudo_et_le_mot_de_passe(String pseudo, String password) {
		if(Mobile.getDeviceOS() == "iOS"){
			Mobile.setText(findTestObject('Spy/XCUIElementTypeTextField - Login (2)'), pseudo, 0)
			Mobile.setText(findTestObject('Spy/XCUIElementTypeSecureTextField - Mot de passe (2)'), password, 0)
		}
		else{
			// Je ne fais rien ici car pré rempli dans Android
		}
	}

	@And("Je clique sur le bouton Se connecter")
	def Je_clique_sur_le_bouton_Se_connecter(){
		if(Mobile.getDeviceOS() == "iOS")
			Mobile.tap(findTestObject('Spy/XCUIElementTypeButton - Se connecter (2)'), 0)
		else
			Mobile.tap(findTestObject('Object Repository/Spy/android/android.widget.TextView0 - Se connecter'), 0)
	}

	@Then("Je dois être sur la page d'accueil de JMC")
	def Je_dois_etre_sur_la_page_d_accueil_de_JMC(){
		if(Mobile.getDeviceOS() == "iOS")
			Mobile.verifyElementVisible(findTestObject('Spy/XCUIElementTypeStaticText - COMPTE  BANCAIRE'), 0)
		else
			Mobile.verifyElementVisible(findTestObject('Spy/android.widget.TextView0 - COMPTE BANCAIRE'), 0)
		// mais aussi DEVIS, KYC ...
	}


	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////
	/////////////

	@Then("Je dois voir les 4 menus qui composent la page d'accueil")
	def Je_dois_voir_les_4_menus(){
		Mobile.verifyElementVisible(findTestObject('Spy/XCUIElementTypeStaticText - COMPTE  BANCAIRE'), 0)
		Mobile.verifyElementVisible(findTestObject('Spy/XCUIElementTypeStaticText - ASSURANCE  AUTOMOBILE'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Spy/XCUIElementTypeStaticText - PRT  IMMOBILIER'),0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Spy/XCUIElementTypeStaticText - KYC'),0)
	}

	@Then("Je dois voir l'alerte d'erreur d'authentification")
	def Je_dois_voir_l_alerte_errer_auth(){
		Mobile.verifyElementVisible(findTestObject('Object Repository/Spy/XCUIElementTypeStaticText - Erreur'), 0)
	}




	@Given("Je suis sur la page de connexion JMCAndroid")
	def Je_suis_sur_la_page_de_connexion_JMCAndroid() {
		Mobile.startExistingApplication('com.jouve.jmcappdemonstrator')
	}

	@When("Je vois la page de connexion JMCAndroid")
	def Je_vois_la_page_de_connexion_JMCAndroid() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Spy/android/android.widget.TextView0 - Se connecter'), 0)
	}


	@And("Je clique sur le bouton Se connecterAndroid")
	def Je_clique_sur_le_bouton_Se_connecterAndroid(){
		Mobile.tap(findTestObject('Object Repository/Spy/android/android.widget.TextView0 - Se connecter'), 0)
	}


	@And("Je démarre une inscription Facture et CI")
	def registerCI(){


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
	}

	@Then("Je vois l'inscription finie")
	def registerdone(){
		Mobile.verifyElementVisible(findTestObject('Object Repository/Spy/android/android.widget.TextView0 - Bienvenue chez Jouve Bank'), 0)
	}
}