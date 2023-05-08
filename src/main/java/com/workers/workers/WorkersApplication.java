package com.workers.workers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkersApplication.class, args);
		User user=new User();
		user.setFirstName("Mawazo");
		user.setLastName("Jackson");
		user.setEmmail("mawazojak@gmail.com");
	}
public static void main(String arg[]){
	MainFrame myFrame=new MainFrame();
	}

}
