package com.mine.task3_1_2.service;

import com.mine.task3_1_2.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    void deleteUserById(Long id);
    void editUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
}
