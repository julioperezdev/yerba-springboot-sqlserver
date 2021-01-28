package com.mate.yerba.controller;

import com.mate.yerba.model.Yerba;
import com.mate.yerba.service.implementation.YerbaServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("yerba")
public class YerbaController {

    @Autowired
    YerbaServiceImplementation yerbaServiceImplementation;


    @GetMapping("/all")
    public List<Yerba> getAllYerbas(){
        return yerbaServiceImplementation.getAllYerbas();
    }

    @GetMapping("/{idYerba}")
    public Optional<Yerba> getYerbaById(@PathVariable int idYerba){
        return yerbaServiceImplementation.getYerbaById(idYerba);
    }

    @PostMapping
    public String saveYerba(@RequestBody Yerba yerba){
        return yerbaServiceImplementation.saveYerba(yerba);
    }



}