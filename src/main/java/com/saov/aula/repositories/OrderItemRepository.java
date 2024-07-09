package com.saov.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saov.aula.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
