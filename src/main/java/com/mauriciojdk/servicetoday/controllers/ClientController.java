package com.mauriciojdk.servicetoday.controllers;

import com.mauriciojdk.servicetoday.models.Client;
import com.mauriciojdk.servicetoday.repositories.ClientRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("client")
public class ClientController {

    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostMapping
    public Client salvar(@RequestBody Client client) {
        System.out.println("Salvando usuário " + client);
        clientRepository.save(client);
        return client;
    }

}
