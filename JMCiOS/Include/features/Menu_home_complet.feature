#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@MenuHomeOK
Feature: Menu home complet
  En tant qu'utilisateur, je veux m'assurer que le menu home est complet (BANCAIRE,DEVIS,PRET,KYC)

  @Valid
  Scenario Outline: Menu OK
    Given Je suis sur la page de connexion JMC
    When Je vois la page de connexion JMC
    And J'écris le pseudo <pseudo> et le mot de passe <password>
    And Je clique sur le bouton Se connecter
		Then Je dois voir les 4 menus qui composent la page d'accueil
		
    Examples: 
      | pseudo   | password    |
      | dleneveu | 0dleneveu0* |
