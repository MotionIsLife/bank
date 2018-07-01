package com.devcolibri.dataexam.controller;

import com.devcolibri.dataexam.entity.Bank;
import com.devcolibri.dataexam.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping
    public void addBank(@RequestBody Bank bank){
        System.out.println("adding bank " + bank);
        bankService.addBank(bank);
    }

    @GetMapping
    public @ResponseBody
    List<Bank> findAll() {
        System.out.println("find all");
        return bankService.getAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Bank getBank(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBank(@PathVariable Long id) {
        System.out.println("deleted bank with id: " + id);
    }

    @PutMapping
    public void updateBank(@RequestBody Bank bank) {
        System.out.println("updating bank " + bank);
    }
}
