package com.vn.tuyentg.userservice.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
@OpenAPIDefinition(info = @Info(title = "${app.api.title}", description = "${app.api.description}", version = "${app.api.version}", license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"), termsOfService = ""))
public class SpringFoxConfig {

	@Value("${app.api.group}")
	private String group;

	@Bean
	GroupedOpenApi publicApi() {

		return GroupedOpenApi.builder().group(group).packagesToScan("com.vn.tuyentg.userservice").pathsToMatch("/**")
				.build();
	}
}
