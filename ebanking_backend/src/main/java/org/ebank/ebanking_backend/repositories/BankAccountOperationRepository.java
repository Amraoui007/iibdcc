package org.ebank.ebanking_backend.repositories;

import org.ebank.ebanking_backend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountOperationRepository extends JpaRepository<AccountOperation,long> {
}
