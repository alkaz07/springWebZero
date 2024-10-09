package com.example.springWebZero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class SpringWebZeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebZeroApplication.class, args);
	}

	@GetMapping("/page2")
	public String page2(@RequestParam(value = "name", defaultValue = "Неизвестный") String name) {
	//	return String.format("Hello %s!", name);
		System.out.println("введено имя " + name);//для отладки
		return "Привет, "+name+"!";
	}

	@GetMapping("/page4")
	public String page4(@RequestParam(value = "username", defaultValue = "Неизвестный") String name) {
		System.out.println("получено имя " + name);//для отладки
		return "Здравствуй, "+name+"!";
	}
}
