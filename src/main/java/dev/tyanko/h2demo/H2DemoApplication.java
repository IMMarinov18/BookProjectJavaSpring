package dev.tyanko.h2demo;

import dev.tyanko.h2demo.model.Book;
import dev.tyanko.h2demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class H2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);

	}

	@Bean
	 CommandLineRunner commandLineRunner(BookRepository repository){
		return args -> {
			repository.save(new Book(null, "Spring Boot: Up and Running", 442,"Mitio Krika"));
		};
	}

}
