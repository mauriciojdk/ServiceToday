package com.mauriciojdk.servicetoday.repositories;

import com.mauriciojdk.servicetoday.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {
}
