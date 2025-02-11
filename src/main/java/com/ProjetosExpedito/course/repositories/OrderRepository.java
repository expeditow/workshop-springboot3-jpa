package com.ProjetosExpedito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetosExpedito.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
