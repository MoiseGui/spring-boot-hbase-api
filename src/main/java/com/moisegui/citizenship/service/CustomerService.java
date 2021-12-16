package com.moisegui.citizenship.service;

import com.moisegui.citizenship.entities.Customer;

import java.io.IOException;
import java.util.List;

public interface CustomerService {
    Customer findByROwKey(String rowKey) throws IOException;
    List<Customer> findAll() throws IOException;

}
