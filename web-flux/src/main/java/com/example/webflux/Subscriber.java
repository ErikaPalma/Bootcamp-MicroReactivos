package com.example.webflux;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

public class Subscriber {
	public static void print(Integer n) {
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Subscriber" + n);
		
	}
	
	
	
	
}
