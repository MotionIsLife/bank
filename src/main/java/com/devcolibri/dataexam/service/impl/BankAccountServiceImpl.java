package com.devcolibri.dataexam.service.impl;

import com.devcolibri.dataexam.entity.BankAccount;
import com.devcolibri.dataexam.repository.BankAccountRepositroy;
import com.devcolibri.dataexam.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    BankAccountRepositroy bankAccountRepositroy;
    @Override
    public BankAccount addBankAccount(BankAccount bankAccount) {
        return bankAccountRepositroy.saveAndFlush(bankAccount);
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public BankAccount getByName(String name) {
        return null;
    }

    @Override
    public BankAccount editBankAccount(BankAccount bankAccount) {
        return null;
    }

    @Override
    public List<BankAccount> getAll() {
        return null;
    }
}
