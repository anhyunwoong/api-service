package com.heren.apiservice.repository;

import com.heren.apiservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //all curd database methods

}
