package com.devcolibri.dataexam.service;

import com.devcolibri.dataexam.entity.Bank;
import com.devcolibri.dataexam.entity.Client;

import java.util.List;

public interface ClientService {

    Client addClient(Client client);
    void delete(long id);
    Client getByName(String name);
    Client editClient(Client client);
    List<Client> getAll();

}
