package com.moisegui.citizenship.service;

import com.moisegui.citizenship.entities.User;

import java.io.IOException;
import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(String id) throws IOException;
    public User save(User user) throws IOException;
    public void deleteById(String id) throws IOException;
    public User update(User user) throws IOException;
}
