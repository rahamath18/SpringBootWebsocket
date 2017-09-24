package com.test.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@EnableAutoConfiguration(exclude=
{
DataSourceAutoConfiguration.class,
HibernateJpaAutoConfiguration.class,
//org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
//org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration.class
})

public class Application extends SpringBootServletInitializer { //implements CommandLineRunner {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}

