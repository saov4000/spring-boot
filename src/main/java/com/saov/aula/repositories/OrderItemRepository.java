package com.saov.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saov.aula.entities.OrderItem;
import com.saov.aula.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
