package com.muhardin.endy.belajar.belajarspringdataenvers.helper;

import com.muhardin.endy.belajar.belajarspringdataenvers.dao.UserDao;
import com.muhardin.endy.belajar.belajarspringdataenvers.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EntityModifierAuditorAware implements AuditorAware<User> {

    @Autowired private UserDao userDao;

    @Override
    public Optional<User> getCurrentAuditor() {
        return userDao.findById("user001");
    }
}
