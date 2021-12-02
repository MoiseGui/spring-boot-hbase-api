package com.moisegui.citizenship.daos;

import com.flipkart.hbaseobjectmapper.AbstractHBDAO;
import com.moisegui.citizenship.entities.Citizen;
import org.apache.hadoop.hbase.client.Connection;
import org.springframework.stereotype.Component;

@Component
public class CitizenDAO extends AbstractHBDAO<String, Citizen> {

    public CitizenDAO(Connection connection) {
        super(connection);
    }
}
