Feature: Order a Coffe
  In order to sabe tome when I pick up my morning Coffee
  as a coffe lover
  I want to be able to order my coffe in advance

  Scenario: Buyer order a coffee when the area close to the coffee shop
    Given Cathy is  100 meters from the coffe shop
    When Cathy orders a large cappuccino
    Then Barry shoud receive the order
    And Barry should know that the coffee is Irgent