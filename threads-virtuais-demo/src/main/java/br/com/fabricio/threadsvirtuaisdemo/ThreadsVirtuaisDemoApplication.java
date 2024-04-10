package br.com.fabricio.threadsvirtuaisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ThreadsVirtuaisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadsVirtuaisDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/demo")
class DemoController{

	@GetMapping
	public String get() throws InterruptedException {
		Thread.sleep(3000);
		return "Hello";
	}

}

//hey -n 32 -c 32 http://localhost:8080/demo


