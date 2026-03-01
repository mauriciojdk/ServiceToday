package com.mauriciojdk.servicetoday.repositories;

import com.mauriciojdk.servicetoday.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiceRepository extends JpaRepository<Service, UUID> {
}
