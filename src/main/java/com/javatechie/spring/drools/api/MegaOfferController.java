package com.javatechie.spring.drools.api;

import org.drools.core.base.RuleNameEqualsAgendaFilter;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MegaOfferController {
	@Autowired
	private KieSession session;

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {
		session.insert(order);
		session.fireAllRules();
//		session.dispose();
//		session.destroy();\
	return order;
	}

	@PostMapping("/fire-rule")
	public Order fireRuleByName(@RequestParam("ruleName") String ruleName, @RequestBody Order order) {
		session.insert(order);
		session.fireAllRules(new RuleNameEqualsAgendaFilter(ruleName));
		return order;
	}

	@GetMapping("/rule/{ruleName}")
	public void fireRule(@PathVariable String ruleName) {
		// Create a rule name equals agenda filter
		RuleNameEqualsAgendaFilter filter = new RuleNameEqualsAgendaFilter(ruleName);


		// Fire the rule
		session.fireAllRules(filter);
	}


//	@GetMapping("/ruleName/{ruleName}")
//	public Object fireRuleWithName(@PathVariable String ruleName) {
//		// Create a rule name equals agenda filter
//		RuleNameEqualsAgendaFilter filter = new RuleNameEqualsAgendaFilter(ruleName);
//
//		// Fire the rule until it halts
//		session.fireUntilHalt(filter);
//
//		// Get the result of the last rule that was fired
//		Object result = session.getResult();
//
//		// Return the result
//		return result;
//	}


}
