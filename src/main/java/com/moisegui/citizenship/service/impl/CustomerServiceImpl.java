package com.moisegui.citizenship.service.impl;

import com.flipkart.hbaseobjectmapper.Records;
import com.moisegui.citizenship.daos.CustomerDAO;
import com.moisegui.citizenship.entities.Customer;
import com.moisegui.citizenship.service.CustomerService;
import org.apache.hadoop.hbase.client.Scan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Override
    public Customer findByROwKey(String rowKey) throws IOException {
        return customerDAO.get(rowKey);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Scan scan = new Scan();
        try(Records<Customer> customerRecords = customerDAO.records(scan)) {
            customerRecords.forEach(customers::add);
            return customers;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
