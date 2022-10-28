package com.example.webfluxservermicro;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		Person p1 = new Person("Erika", "Palma", 38);
		Flux <Person> fluxp1 = Flux.just(p1).delayElements(Duration.ofSeconds(5));
				return fluxp1;
	}
		

	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		Person p2 = new Person("Ana", "García", 21);
		Flux <Person> fluxp2 = Flux.just(p2).delayElements(Duration.ofSeconds(5));
				return fluxp2;
		
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		Person p3 = new Person("Pepe", "Pérez", 21);
		Flux <Person> fluxp3 = Flux.just(p3).delayElements(Duration.ofSeconds(5));
				return fluxp3;
		
	}	
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		Person p4 = new Person("Diego", "Gómez", 21);
		Flux <Person> fluxp4 = Flux.just(p4).delayElements(Duration.ofSeconds(5));
				return fluxp4;
		
	}	

}
