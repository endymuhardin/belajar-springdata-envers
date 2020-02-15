package com.muhardin.endy.belajar.belajarspringdataenvers.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Data
@Entity
@Audited(targetAuditMode = NOT_AUDITED)
@EntityListeners(AuditingEntityListener.class)
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

    @CreatedBy
    @ManyToOne @JoinColumn(name = "id_user_create")
    private User createdBy;

    @LastModifiedBy
    @ManyToOne @JoinColumn(name = "id_user_update")
    private User lastUpdatedBy;

    @CreatedDate
    private LocalDateTime createdTime;

    @LastModifiedDate
    private LocalDateTime lastUpdatedTime;
}
