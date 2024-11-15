package com.example.lab.services;

import com.example.lab.User.User;
import com.example.lab.dtos.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user) {
        return new UserDto(
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getContactNumber()
        );

    }
}
