package com.stiv.springcloud.mcsv.msvcusuarios.repositories;

import com.stiv.springcloud.mcsv.msvcusuarios.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
