package com.xmacedo.SpringWithWsdl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithWsdlApplication implements CommandLineRunner {

	@Autowired
	private SoapClientService soapClientService;

	public static void main(String[] args) {
		SpringApplication.run(SpringWithWsdlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Test ping
		String pingResponse = soapClientService.ping("Hello");
		System.out.println("Ping Response: " + pingResponse);

		// Test findById
		String findByIdResponse = soapClientService.findById(123);
		System.out.println("FindById Response: " + findByIdResponse);
	}
}
