package com.custommenuhub;

import org.springframework.boot.SpringApplication;

public class TestCustomMenuHubApplication {

	public static void main(String[] args) {
		SpringApplication.from(CustomMenuHubApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
