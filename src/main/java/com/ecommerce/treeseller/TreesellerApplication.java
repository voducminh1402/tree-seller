package com.ecommerce.treeseller;

import com.ecommerce.treeseller.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreesellerApplication {

	public static void main(String[] args) {
		User user = new User();

		SpringApplication.run(TreesellerApplication.class, args);
	}

}
