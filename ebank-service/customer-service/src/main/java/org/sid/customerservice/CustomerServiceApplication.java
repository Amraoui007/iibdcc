package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }




    @Bean
    CommandLineRunner start(CustomerRepository){

        return args -> {
            CustomerRepository.save(new Customer(null,"Yassine","yassine@mail.com"));
            CustomerRepository.save(new Customer(null,"hamza","hamza@mail.com"));
            CustomerRepository.save(new Customer(null,"mohamed","mohamed@mail.com"));
            CustomerRepository.save(new Customer(null,"ali","ali@mail.com"));
            CustomerRepository.findall().forEach(c->{
                System.out.println(c.ToString());
            });





        };

    }

}
