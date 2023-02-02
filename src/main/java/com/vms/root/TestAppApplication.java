package com.vms.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = {"Model"})
@EnableJpaRepositories("Repository")
@ComponentScan({"Controller","Service","Repository"})
public class TestAppApplication extends SpringBootServletInitializer implements WebMvcConfigurer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(TestAppApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
	}

}
