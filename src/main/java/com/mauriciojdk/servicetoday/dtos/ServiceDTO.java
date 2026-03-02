package com.mauriciojdk.servicetoday.dtos;

import java.math.BigDecimal;

public class ServiceDTO {
    private String name;
    private BigDecimal price;
    private Integer duration;

    public ServiceDTO() {}

    public ServiceDTO(String name, BigDecimal price, Integer duration) {
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
