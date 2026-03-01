package com.mauriciojdk.servicetoday.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public class AppointmentDTO {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private UUID clientId;
    private UUID serviceId;

    public AppointmentDTO() {}

    public AppointmentDTO(LocalDateTime startTime, LocalDateTime endTime, UUID clientId, UUID serviceId) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.clientId = clientId;
        this.serviceId = serviceId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public UUID getServiceId() {
        return serviceId;
    }

    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }
}
