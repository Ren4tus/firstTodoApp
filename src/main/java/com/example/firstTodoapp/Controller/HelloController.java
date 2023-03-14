package com.example.firstTodoapp.Controller;

import com.example.firstTodoapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    private final UserService userService;
    public HelloController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String index(Model model){
        userService.getUsers(model);
        return "todos";
    }



}
