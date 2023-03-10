package org.ebank.ebanking_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ebank.ebanking_backend.enums.AccountStatus;

import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 4)
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
     @Id
     private String id;
     private double balance;
     private Data createdAt;
     private AccountStatus status;
     @ManyToOne
     private customer customer;
     @OneToMany(mappedBy = "bankAccount")
     private List<AccountOperation> accountOperations;



}
