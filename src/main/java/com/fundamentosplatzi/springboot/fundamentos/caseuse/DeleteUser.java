package com.fundamentosplatzi.springboot.fundamentos.caseuse;

import com.fundamentosplatzi.springboot.fundamentos.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    public UserService userService;

    public CreateUser(UserService userService) {
        this.userService = userService;
    }
}
