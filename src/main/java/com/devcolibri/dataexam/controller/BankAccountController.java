package com.devcolibri.dataexam.controller;

import com.devcolibri.dataexam.entity.BankAccount;
import com.devcolibri.dataexam.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bankAccount")
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping
    public void addBankAccount(@RequestBody BankAccount bankAccount){
        System.out.println("adding bankAccount " + bankAccount);
        bankAccountService.addBankAccount(bankAccount);
    }

    @GetMapping
    public @ResponseBody
    List<BankAccount> findAll() {
        System.out.println("find all");
        return bankAccountService.getAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody BankAccount getBankAccount(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBankAccount(@PathVariable Long id) {
        System.out.println("deleted bankAccount with id: " + id);
    }

    @PutMapping
    public void updateBankAccount(@RequestBody BankAccount bankAccount) {
        System.out.println("updating bankAccount " + bankAccount);
    }
}
