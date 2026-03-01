package com.mauriciojdk.servicetoday.repositories;

import com.mauriciojdk.servicetoday.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
