package com.moisegui.citizenship.service.impl;

import com.flipkart.hbaseobjectmapper.Records;
import com.moisegui.citizenship.daos.UserDAO;
import com.moisegui.citizenship.entities.Customer;
import com.moisegui.citizenship.entities.User;
import com.moisegui.citizenship.service.UserService;
import org.apache.hadoop.hbase.client.Scan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        Scan scan = new Scan();
        try(Records<User> userRecords = userDAO.records(scan)) {
            userRecords.forEach(users::add);
            return users;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User findById(String id) throws IOException {
        return userDAO.get(id);
    }

    @Override
    public User save(User user) throws IOException {
        String id = userDAO.persist(user);
        if(id != null){
            return findById(id);
        }
        return null;
    }

    @Override
    public void deleteById(String id) throws IOException {
        userDAO.delete(id);
    }

    @Override
    public User update(User user) throws IOException {
        return findById(userDAO.persist(user));
    }
}
