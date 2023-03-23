package com.fundamentosplatzi.springboot.fundamentos.caseuse;

import com.fundamentosplatzi.springboot.fundamentos.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UpdateteUser {
    public UserService userService;

    public UpdateteUser(UserService userService) {
        this.userService = userService;
    }
}
