package com.epicode.config_bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationTest{

	@Bean
	@Scope ("singleton")
	public Test test() {
		return new Test("primo Bean", "Costruzione primo bean da file configuration");
	
	}
	

	@Bean
	@Scope("prototype")
	  public Test paramTest(String txt) {
		return new Test("Secondo Bean", txt);
	 }
	@Bean
	@Scope("prototype")
	  public Test paramAllTest(String title, String txt) {
		return new Test(title, txt);
	 }
}