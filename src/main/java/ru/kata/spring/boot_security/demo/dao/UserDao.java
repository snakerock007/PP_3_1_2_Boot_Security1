package ru.kata.spring.boot_security.demo.dao;

import org.apache.catalina.User;

import java.util.List;

public interface UserDao {
    User getUserById(Long id);

    List<User> getAllUsers();
    User getUser(long id);
    void addUser(User user);
    void deleteUser(User user);

    void deleteUser(Long id);

    void editUser(User user);
    User getUserByUsername(String username);
}
