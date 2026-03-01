package com.mauriciojdk.servicetoday.controllers;

import com.mauriciojdk.servicetoday.dtos.AppointmentDTO;
import com.mauriciojdk.servicetoday.models.Appointment;
import com.mauriciojdk.servicetoday.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment salvar(@RequestBody AppointmentDTO dto) {
        return appointmentService.createAppointment(dto);
    }

}
