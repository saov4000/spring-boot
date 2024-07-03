package com.saov.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saov.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
