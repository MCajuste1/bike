package com.globomatics.bike.controllers;


import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
@Autowired

private BikeRepository bikeRepository;


    //@GetMapping when a get request is issued to a request base path

@GetMapping



    public List<Bike> list(){
        return bikeRepository.findAll();


    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
//When a user submits registration information
    public void create (@RequestBody Bike bike){
    bikeRepository.save( bike );

    }

    @GetMapping("/{id}")
//Gets a particular bike and returns that bike of the id it passes
    public Bike get(@PathVariable("id") long id){
    return bikeRepository.getOne( id );
    }

}