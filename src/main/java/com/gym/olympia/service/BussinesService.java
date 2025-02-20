package com.gym.olympia.service;

import com.gym.olympia.entity.Bussines;
import com.gym.olympia.repository.BussinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BussinesService {

    @Autowired
    private BussinesRepository bussinesRepository;

    public List<Bussines> listAll() {
        return bussinesRepository.findAll();
    }

    public Optional<Bussines> findById(Long id) {
        return bussinesRepository.findById(id);
    }

}