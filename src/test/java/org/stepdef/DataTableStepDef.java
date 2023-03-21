package org.stepdef;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DataTableStepDef {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(DataTable dt) {
		List<Map<String, String>> mps = dt.asMaps();
		System.out.println(mps);
		System.out.println(mps.get(0));
		System.out.println(mps.get(1));
		System.out.println(mps.get(2));
		System.out.println(mps.get(0).get("Username"));
		System.out.println(mps.get(0).get("Password"));
		System.out.println(mps.get(1).get("Username"));
		System.out.println(mps.get(1).get("Password"));
		System.out.println(mps.get(2).get("Username"));
		System.out.println(mps.get(2).get("Password"));		

	}

	@When("I complete action")
	public void i_complete_action() {

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}
}

//asList
//List<String> ls = dt.asList();
//System.out.println("List " + ls);
//System.out.println(ls.get(0));
//System.out.println(ls.get(1));
//System.out.println(ls.get(2));

//asLists
//List<List<String>> ls2 = dt.asLists();
//System.out.println(ls2);
//System.out.println(ls2.get(0));
//System.out.println(ls2.get(1));
//System.out.println(ls2.get(2));
//System.out.println(ls2.get(0).get(0));
//System.out.println(ls2.get(0).get(1));
//System.out.println(ls2.get(0).get(2));
//System.out.println(ls2.get(1).get(0));
//System.out.println(ls2.get(1).get(1));
//System.out.println(ls2.get(1).get(2));
//System.out.println(ls2.get(2).get(0));
//System.out.println(ls2.get(2).get(1));
//System.out.println(ls2.get(2).get(2));

//asMap
//Map<String, String> mp = dt.asMap(String.class, String.class);
//System.out.println(mp);
//System.out.println(mp.get("1"));
//System.out.println(mp.get("2"));
//System.out.println(mp.get("3"));

//asMaps
//List<Map<String, String>> mps = dt.asMaps();
//System.out.println(mps);
//System.out.println(mps.get(0));
//System.out.println(mps.get(1));
//System.out.println(mps.get(2));
//System.out.println(mps.get(0).get("Username"));
//System.out.println(mps.get(0).get("Password"));
//System.out.println(mps.get(1).get("Username"));
//System.out.println(mps.get(1).get("Password"));
//System.out.println(mps.get(2).get("Username"));
//System.out.println(mps.get(2).get("Password"));