package com.enjoy.cap8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.enjoy.cap8.bean.Bird;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource(value="classpath:/test.properties")
@PropertySources({
	@PropertySource(value="classpath:/test.properties"),
		@PropertySource(value="classpath:/test.properties")
})
public class Cap8MainConfig {
	@Bean
	public Bird bird(){
		return new Bird();
	}
}
