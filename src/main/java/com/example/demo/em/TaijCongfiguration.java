package com.example.demo.em;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FooProperties.class)
public class TaijCongfiguration {
	@Autowired 
	private FooProperties fooPro;
	public String toString() {
		return fooPro.toString();
		
	}
}
