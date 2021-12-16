package com.moisegui.citizenship.daos;

import com.flipkart.hbaseobjectmapper.AbstractHBDAO;
import com.moisegui.citizenship.entities.User;
import org.apache.hadoop.hbase.client.Connection;
import org.springframework.stereotype.Component;

@Component
public class UserDAO extends AbstractHBDAO<String, User> {

    protected UserDAO(Connection connection) {
        super(connection);
    }
}
