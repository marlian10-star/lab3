package com.example.lab;


import com.example.lab.User.User;
import com.example.lab.dtos.UserDto;
import com.example.lab.repositories.UserRepository;
import com.example.lab.services.UserMapper;
import com.example.lab.services.UserService;
import com.example.lab.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.findAllUsers()
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

}