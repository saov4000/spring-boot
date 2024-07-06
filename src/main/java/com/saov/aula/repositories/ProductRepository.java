package com.saov.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saov.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
