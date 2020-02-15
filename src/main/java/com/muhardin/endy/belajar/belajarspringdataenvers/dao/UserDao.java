package com.muhardin.endy.belajar.belajarspringdataenvers.dao;

import com.muhardin.endy.belajar.belajarspringdataenvers.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
