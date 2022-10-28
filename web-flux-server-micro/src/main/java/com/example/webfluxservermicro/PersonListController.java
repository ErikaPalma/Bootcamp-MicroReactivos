package com.example.webfluxservermicro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	
	@Autowired
	PersonService personService;
		
	@GetMapping(path="/person-list")
	public String personList( Model model) {
		 Flux<Person> flux = personService.allPersons();
		
		model.addAttribute("personlist", flux);
		return "personList";
	}
	
	


}
