package com.mauriciojdk.servicetoday.dtos;

import java.util.UUID;

public class ClientDTO {
    private UUID id;
    private String name;
    private String email;
    private Long number;

    public ClientDTO() {}

    public ClientDTO(String name, String email, Long number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
