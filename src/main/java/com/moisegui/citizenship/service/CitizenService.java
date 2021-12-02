package com.moisegui.citizenship.service;

import com.moisegui.citizenship.entities.Citizen;

import java.io.IOException;

public interface CitizenService {
    public void save(Citizen citizen) throws IOException;
}
