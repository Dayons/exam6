package com.example.test;

import com.example.test.entity.Role;
import com.example.test.entity.User;
import com.example.test.enums.Status;
import com.example.test.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication

public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return arg -> {

			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			userService.saveUser(new User(null, "Админ", "admin", Status.ACTIVE,"2405", new ArrayList<>()));
			userService.saveUser(new User(null, "пользователь1", "user1",Status.ACTIVE, "7777", new ArrayList<>()));
			userService.saveUser(new User(null, "пользователь2", "user2",Status.ACTIVE, "5454", new ArrayList<>()));
			userService.addRoleToUser("user1", "ROLE_USER");
			userService.addRoleToUser("user2", "ROLE_USER");
			userService.addRoleToUser("admin", "ROLE_SUPER_ADMIN");


		};
	}
}
