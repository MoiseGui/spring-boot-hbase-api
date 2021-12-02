package com.moisegui.citizenship.daos;

import com.flipkart.hbaseobjectmapper.AbstractHBDAO;
import com.flipkart.hbaseobjectmapper.Records;
import com.moisegui.citizenship.entities.Customer;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Scan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDAO extends AbstractHBDAO<String, Customer> {

    public CustomerDAO(Connection connection) {
        super(connection);
    }
}
