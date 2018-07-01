package com.devcolibri.dataexam.service;

import com.devcolibri.dataexam.entity.Bank;
import com.devcolibri.dataexam.entity.BankAccount;

import java.util.List;

public interface BankAccountService {

    BankAccount addBankAccount(BankAccount bankAccount);
    void delete(long id);
    BankAccount getByName(String name);
    BankAccount editBankAccount(BankAccount bankAccount);
    List<BankAccount> getAll();

}
