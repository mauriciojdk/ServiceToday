package com.mauriciojdk.servicetoday.controllers;


import com.mauriciojdk.servicetoday.models.Service;
import com.mauriciojdk.servicetoday.repositories.ServiceRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("service")
public class ServiceController {

    private ServiceRepository serviceRepository;

    public ServiceController(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @PostMapping
    public Service salvar(@RequestBody Service service) {
        System.out.println("Salvando serviço " + service);
        serviceRepository.save(service);
        return service;
    }
}
