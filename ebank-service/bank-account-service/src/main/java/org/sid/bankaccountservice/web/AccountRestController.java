package org.sid.bankaccountservice.web;

import org.sid.bankaccountservice.entities.BankAccount;
import org.sid.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;


    @GetMapping("/bankAccounts")


    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")


    public BankAccount bankAccounts(@PathVariable String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found,id")));
    }
    PostMapping("/bankAccounts")

    public BankAccount save(@RequestBody BankAccount bankAccount){
        return BankAccountRepository.save(bankAccount);

    }


    @PutMapping("/bankAccounts/{id}")

    public BankAccount update(@PathVariable String id,@RequestBody BankAccount bankAccount){

    BankAccount account=bankAccountRepository.findById(id).orElseThrow();
    account.setBalance(bankAccount.getBalance());
    account.setCreatedAt(new Date());
    account.setType(bankAccount.getType());
    account.setCurrency(bankAccount.getCurrency());

        return BankAccountRepository.save(bankAccount);

    }

}
