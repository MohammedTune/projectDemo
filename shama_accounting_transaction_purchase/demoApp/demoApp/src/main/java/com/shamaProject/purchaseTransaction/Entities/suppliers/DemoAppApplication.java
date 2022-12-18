package com.shamaProject.purchaseTransaction.Entities.suppliers;

import com.shamaProject.purchaseTransaction.repositories.SuppRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args)    {

        SpringApplication.run(DemoAppApplication.class, args);
	}
    @Bean
    CommandLineRunner CommandLineRunner(SuppRepo SuppRepo){
        return  args -> {
            Supplier mohammed=new Supplier(
                    "12334",
                    "mohammed",
                    "kemal",
                    "jemal");
            SuppRepo.save(mohammed);
        };
    }
        }
