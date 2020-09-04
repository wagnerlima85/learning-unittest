package br.com.wagnerlima85.unittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.wagnerlima85.unittest")
@EnableJpaRepositories("br.com.wagnerlima85.unittest.repositories")
public class UnittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnittestApplication.class, args);
	}

}
