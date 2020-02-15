package com.muhardin.endy.belajar.belajarspringdataenvers.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotEmpty @Size(min = 5, max = 100)
    private String code;

    @NotEmpty @Size(min = 5, max = 200)
    private String name;

    @NotNull @Min(1000)
    private BigDecimal price;
}
