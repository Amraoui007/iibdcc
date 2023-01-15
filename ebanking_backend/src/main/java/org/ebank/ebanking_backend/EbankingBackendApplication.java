package org.ebank.ebanking_backend;

import org.ebank.ebanking_backend.repositories.BankAccountOperationRepository;
import org.ebank.ebanking_backend.repositories.BankAccountRepository;
import org.ebank.ebanking_backend.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EbankingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankingBackendApplication.class, args);
    }
@Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            BankAccountRepository bankAccountRepository,
                            BankAccountOperationRepository bankAccountOperationRepository){
        return args -> {

        };
    }



}
