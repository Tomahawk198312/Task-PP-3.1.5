package com.example.TaskPP315.service;

import com.example.TaskPP315.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User getById(long id);

    void save(User user);

    void deleteById(long id);

    User findByUsername(String username);

    void update(User user);

    User passwordCoder(User user);

}