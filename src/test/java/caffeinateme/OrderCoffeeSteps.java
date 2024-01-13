package caffeinateme;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
public class OrderCoffeeSteps {

    Customer Cathy = new Customer();
    Barrista Barry = new Barrista();
    String CathyOrde;
    @Given("Cathy is  {int} meters from the coffe shop")
    public void cathy_is_meters_from_the_coffe_shop(int Distancia) {

        Cathy.setDistanceFromChop(Distancia);

    }
    @When("Cathy orders a {string}")
    public void cathyOrdersA(String Orden) {

        CathyOrde=Orden;

       Cathy.placesOrderFot(CathyOrde);
    }

    @Then("Barry should receive the order")
    public void barry_should_receive_the_order() {

       assertThat(Barry.getPedingOrders(),hasItem(CathyOrde));

    }
    @Then("Barry should know that the coffee is Urgent")
    public void barry_should_know_that_the_coffee_is_urgent() {

        assertThat(Barry.getUrgentOrders(),hasItem(CathyOrde));

    }



}
