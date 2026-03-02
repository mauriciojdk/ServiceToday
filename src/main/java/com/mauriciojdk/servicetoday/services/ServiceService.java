package com.mauriciojdk.servicetoday.services;

import com.mauriciojdk.servicetoday.dtos.ServiceDTO;
import com.mauriciojdk.servicetoday.models.Service;
import com.mauriciojdk.servicetoday.repositories.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository)
    {
        this.serviceRepository = serviceRepository;
    }

    public Service createService(ServiceDTO dto){
        Service service = new Service();
        service.setName(dto.getName());
        service.setDuration(dto.getDuration());
        service.setPrice(dto.getPrice());

        return serviceRepository.save(service);
    }
}
