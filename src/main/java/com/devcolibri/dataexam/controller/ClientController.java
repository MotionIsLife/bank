package com.devcolibri.dataexam.controller;

import com.devcolibri.dataexam.entity.Client;
import com.devcolibri.dataexam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public void addClient(@RequestBody Client client){
        System.out.println("adding client " + client);
        clientService.addClient(client);
    }

    @GetMapping
    public @ResponseBody
    List<Client> findAll() {
        System.out.println("find all");
        return clientService.getAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Client getClient(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteClient(@PathVariable Long id) {
        System.out.println("deleted client with id: " + id);
    }

    @PutMapping
    public void updateClient(@RequestBody Client client) {
        System.out.println("updating client " + client);
    }
}
