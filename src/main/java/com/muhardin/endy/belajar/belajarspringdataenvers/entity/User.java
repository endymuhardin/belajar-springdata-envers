package com.muhardin.endy.belajar.belajarspringdataenvers.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data @Entity @Table(name = "s_user")
public class User {
    @Id
    private String username;
}
