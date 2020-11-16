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
@BancaireAndroid
Feature: Ouverture bancaire OK
  En tant qu'utilisateur je peux ouvrir un compte

  @Valid
  Scenario Outline: Ouverture OK
    Given Je suis sur la page de connexion JMCAndroid
    When Je vois la page de connexion JMCAndroid
    And Je clique sur le bouton Se connecterAndroid
    And Je démarre une inscription Facture et CI
    Then Je vois l'inscription finie

    Examples: 
      | pseudo   | password   |
      | dleneveu | 0dleneveu0* |