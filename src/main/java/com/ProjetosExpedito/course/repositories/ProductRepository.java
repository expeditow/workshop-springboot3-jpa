package com.ProjetosExpedito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetosExpedito.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
