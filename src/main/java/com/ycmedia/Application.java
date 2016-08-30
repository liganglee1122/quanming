package com.ycmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ycmedia.service.UserService;

@SpringBootApplication
@EnableAutoConfiguration
public class Application extends WebMvcConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserService();
	}
    

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
