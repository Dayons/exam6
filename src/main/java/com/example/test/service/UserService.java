package com.example.test.service;

import com.example.test.entity.Role;
import com.example.test.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

    void createUser(User user);
    void blockUserById(Long id);
    void deleteUserByUserId(Long id);
    void unblockUserByUserId(Long id);
}
