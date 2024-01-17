package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> listUsers();

    User getUserById(int id);

    void deleteUserById(int id);

    void editUser(int id, User userNew);

}
