package com.moisegui.citizenship.ws;

import com.moisegui.citizenship.entities.Customer;
import com.moisegui.citizenship.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/rowKey/{rowKey}")
    public Customer index(@PathVariable String rowKey) {
        try {
            return customerService.findByROwKey(rowKey);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/all")
    public List<Customer> findAll() {
        try {
            return customerService.findAll();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
