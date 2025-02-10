package com.ProjetosExpedito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetosExpedito.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
