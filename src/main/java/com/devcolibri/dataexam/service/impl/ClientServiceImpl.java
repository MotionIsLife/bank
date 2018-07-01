package com.devcolibri.dataexam.service.impl;

import com.devcolibri.dataexam.entity.BankAccount;
import com.devcolibri.dataexam.entity.Client;
import com.devcolibri.dataexam.repository.BankAccountRepositroy;
import com.devcolibri.dataexam.repository.ClientRepository;
import com.devcolibri.dataexam.service.BankAccountService;
import com.devcolibri.dataexam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Client getByName(String name) {
        return null;
    }

    @Override
    public Client editClient(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }
}
