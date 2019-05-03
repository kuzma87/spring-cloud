package com.kuzmenko.userservice.service;

import com.kuzmenko.userservice.domain.Role;
import com.kuzmenko.userservice.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAll() {
        User user1 = new User(1L, "Valera", "valera@test.com", Role.ROLE_USER);
        User user2 = new User(2L, "Alex", "alex@test.com", Role.ROLE_USER);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }
}
