package com.demo.springconcepts;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springconcepts.component.EmployeeBean;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.classic.Logger;

//UC_1_Use_VSCODE_For_Generating_Spring_Project
@SpringBootApplication
public class SpringConceptsApplication {
	// UC_2_Use_Of_SL4J_Logger
	public static final Logger logger = (Logger) LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("Welcome to Spring Concepts");
		ConfigurableApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = " + demoBean.toString());
		logger.warn("Hello world!");

		// UC_3: Use of EmployeeBean and DepartmentBean and DI using Autowire annotation
		// logger.debug("Checking context: {}", context.getBean(name));
		logger.debug("\n*** Example using @Autowire annotation on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
