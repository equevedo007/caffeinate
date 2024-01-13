Feature: Order a Coffe
  In order to save tome when I pick up my morning Coffee
  as a coffe lover
  I want to be able to order my coffe in advance

  Scenario: Buyer order a coffee when the are close to the coffee shop
    Given Cathy is  100 meters from the coffe shop
    When Cathy orders a "Capiccino"
    Then Barry should receive the order
    And Barry should know that the coffee is Urgent