package com.mauriciojdk.servicetoday.services;

import com.mauriciojdk.servicetoday.dtos.AppointmentDTO;
import com.mauriciojdk.servicetoday.models.Appointment;
import com.mauriciojdk.servicetoday.models.Client;
import com.mauriciojdk.servicetoday.models.Service;
import com.mauriciojdk.servicetoday.repositories.AppointmentRepository;
import com.mauriciojdk.servicetoday.repositories.ClientRepository;
import com.mauriciojdk.servicetoday.repositories.ServiceRepository;



@org.springframework.stereotype.Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final ClientRepository clientRepository;
    private final ServiceRepository serviceRepository;

    public AppointmentService(AppointmentRepository appointmentRepository,ClientRepository clientRepository, ServiceRepository serviceRepository) {
        this.appointmentRepository = appointmentRepository;
        this.clientRepository = clientRepository;
        this.serviceRepository = serviceRepository;
    }

    public Appointment createAppointment(AppointmentDTO dto) {

        Client client = clientRepository.findById(dto.getClientId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        Service service = serviceRepository.findById(dto.getServiceId())
                .orElseThrow(() -> new RuntimeException("Serviço não encontrado"));

        Appointment appointment = new Appointment();
        appointment.setStartTime(dto.getStartTime());
        appointment.setEndTime(dto.getEndTime());
        appointment.setClient(client);
        appointment.setService(service);

        return appointmentRepository.save(appointment);
    }
}
