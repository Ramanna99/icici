package com.bank.icici;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableSwagger2
@ComponentScan({ "com.bank.icici" })
public class IciciBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IciciBankAppApplication.class, args);
	}

	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.
	 * basePackage("com.bank")) .build(); }
	 */

}
