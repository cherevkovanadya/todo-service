package com.example.todo_service.repository;

import com.example.todo_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}