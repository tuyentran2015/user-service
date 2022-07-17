package com.vn.tuyentg.userservice.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringFoxConfig {

	@Bean
	GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("User service").packagesToScan("com.vn.tuyentg.userservice")
				.pathsToMatch("/**").build();
	}
}
