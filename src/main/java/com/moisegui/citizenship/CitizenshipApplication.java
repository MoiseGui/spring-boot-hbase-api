package com.moisegui.citizenship;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class CitizenshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitizenshipApplication.class, args);
    }


    @Bean
    Connection getConnection() throws IOException {
        return ConnectionFactory.createConnection(HBaseConfiguration.create());
    }
}
