package com.gym.olympia.controller;

import com.gym.olympia.entity.Bussines;
import com.gym.olympia.service.BussinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bussines")
public class BussinesController {

    @Autowired
    private BussinesService bussinesService;

    @GetMapping
    public List<Bussines> listAll() {
        return bussinesService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bussines> buscarPorId(@PathVariable Long id) {
        return bussinesService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}