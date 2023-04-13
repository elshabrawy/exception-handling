package com.javabuzzy.exceptionhandling.controller;

import com.javabuzzy.exceptionhandling.custom_exception.UserNotFoundException;
import com.javabuzzy.exceptionhandling.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/get-user")
    public ResponseEntity<?> getExampleData() {
        // Some logic here
        User user=null;
        if (user==null) {
            throw new UserNotFoundException("User not found");
        }
        // Return the data
        return ResponseEntity.ok(user);
    }
}
