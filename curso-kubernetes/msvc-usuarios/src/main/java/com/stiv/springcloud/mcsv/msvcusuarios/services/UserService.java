package com.stiv.springcloud.mcsv.msvcusuarios.services;

import com.stiv.springcloud.mcsv.msvcusuarios.models.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    void delete(Long id);

}
