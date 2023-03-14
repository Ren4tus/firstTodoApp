package com.example.firstTodoapp.domain;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ToDo, Long> {

}
