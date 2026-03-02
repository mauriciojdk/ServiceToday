package com.mauriciojdk.servicetoday.controllers;

import com.mauriciojdk.servicetoday.dtos.ClientDTO;
import com.mauriciojdk.servicetoday.models.Client;
import com.mauriciojdk.servicetoday.repositories.ClientRepository;
import com.mauriciojdk.servicetoday.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client salvar(@RequestBody ClientDTO dto) {
        return clientService.createClient(dto);
    }

}
