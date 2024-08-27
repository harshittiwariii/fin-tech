package com.fintech.fin_tech;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "FinTech" ,
				description = "Backend Rest APIs for FinTech",
				version = "v1.0",
				contact = @Contact(
						name = "Harshit",
						email = "sendmailtoharshit@gmail.com",
						url = "https://github.com/harshittiwariii/FinTech.git"
				),
				license = @License(
						name = "FinTech",
						url = "https://github.com/harshittiwariii/FinTech.git"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "FinTech Documentation",
				url = "https://github.com/harshittiwariii/FinTech.git"
		)
)
public class FinTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinTechApplication.class, args);
	}

}
