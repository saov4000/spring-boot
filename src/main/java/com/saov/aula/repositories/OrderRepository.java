package com.saov.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saov.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
