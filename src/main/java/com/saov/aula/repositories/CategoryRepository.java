package com.saov.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saov.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
