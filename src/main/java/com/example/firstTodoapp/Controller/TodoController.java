package com.example.firstTodoapp.Controller;

import com.example.firstTodoapp.domain.ToDo;
import com.example.firstTodoapp.dto.UserCreateRequest;
import com.example.firstTodoapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class TodoController {
    private final UserService userService;

    public TodoController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addTodo")
    public String addTodoV2(@ModelAttribute UserCreateRequest request, RedirectAttributes redirectAttributes)
    {
        userService.saveUser(request);
        redirectAttributes.addFlashAttribute("message", "일정이 성공적으로 추가되었습니다.");
        return "redirect:/";
    }

}
