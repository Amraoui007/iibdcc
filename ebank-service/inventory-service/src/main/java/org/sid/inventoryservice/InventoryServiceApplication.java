package org.sid.inventoryservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository){
        return args -> {
            ProductRepository.save(new Product(null,"ordinateur",885,23));
            ProductRepository.save(new Product(null,"imprimante",451,21));
            ProductRepository.save(new Product(null,"smartphone",521,14));
            ProductRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });

        };
    }
}
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
class product{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private double quantity;

}
@RepositoryRestResource
interface ProductRepository extends JpaRepository<Product,Long>{


}