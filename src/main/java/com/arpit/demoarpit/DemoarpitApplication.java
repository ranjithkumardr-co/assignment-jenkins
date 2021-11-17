package com.arpit.demoarpit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoarpitApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoarpitApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

}
