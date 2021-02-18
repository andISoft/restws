package com.retoback.restws;

import com.retoback.restws.service.CallWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class RestwsApplication{

	public static void main(String[] args) {
		SpringApplication.run(RestwsApplication.class, args);
	}

}
