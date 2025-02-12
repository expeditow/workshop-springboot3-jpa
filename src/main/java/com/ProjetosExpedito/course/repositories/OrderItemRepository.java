package com.ProjetosExpedito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetosExpedito.course.entities.OrderItem;
import com.ProjetosExpedito.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
