package com.moisegui.citizenship.service.impl;

import com.moisegui.citizenship.daos.CitizenDAO;
import com.moisegui.citizenship.entities.Citizen;
import com.moisegui.citizenship.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class CitizenServiceImpl implements CitizenService {
    @Autowired
    CitizenDAO citizenDAO;

    @Override
    public void save(Citizen citizen) throws IOException {
        System.out.println("Saving citizen " + citizen.getName());
        citizenDAO.persist(citizen);
    }
}
