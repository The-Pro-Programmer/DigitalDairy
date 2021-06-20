package com.springBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		
		/*ConfigurableApplicationContext context = SpringApplication.run(SpringBasicsApplication.class, args);
		
		Customer c = context.getBean(Customer.class);
		c.display();
		*/
		
		SpringApplication.run(SpringBasicsApplication.class, args);
		
	}

}
