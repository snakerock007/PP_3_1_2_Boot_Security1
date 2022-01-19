package ru.kata.spring.boot_security.demo.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(long id);
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
    User getUserByUsername(String username);
}
