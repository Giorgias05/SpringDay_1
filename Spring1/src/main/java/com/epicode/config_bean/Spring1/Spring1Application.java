package com.epicode.config_bean.Spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.epicode.config_bean.configuration.Test;
import com.epicode.config_bean.configuration.ConfigurationTest;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
		System.out.println("Run....");
		// Metodo 1
		// Configurazione tramite classe @Configuration
		configWith_Bean();
		
	}

	public static void configWith_Bean() {
		
		// Creo un  Container dove utilizzare i Bean
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
		
		Test t1= (Test) appContext.getBean ("paramTest","Costruzione Bean con parametri!");
        System.out.println(t1.readTxt());

	
		//Recupero il Bean ParamTest
		//getBean (param1: appContext.getBean ,param2: parametri da passare al bean..  param)
          Test t2 = (Test) appContext.getBean ("paramTest","Costruzione Bean con parametri!");
          System.out.println(t2.readTxt());
 
          //recupero il bean paramAllTest
          
          Test t3 = (Test) appContext.getBean ("paramAllTest"," Terzo Bean", "parametro");
          System.out.println(t3.readTxt());
		
		
		// Chiudo il Context
		appContext.close();
	}
	
}
