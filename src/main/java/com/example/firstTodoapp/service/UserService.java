package com.example.firstTodoapp.service;

import com.example.firstTodoapp.domain.ToDo;
import com.example.firstTodoapp.domain.UserRepository;
import com.example.firstTodoapp.dto.UserCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public void saveUser(@ModelAttribute UserCreateRequest request) {
        userRepository.save(new ToDo(request.getTodo()));
    }

    @Transactional()
    public void getUsers(Model model) {
        List<ToDo> todos = userRepository.findAll();
        model.addAttribute("todos",todos);
    }
}
