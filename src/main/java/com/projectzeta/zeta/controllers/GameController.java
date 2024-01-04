package com.projectzeta.zeta.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projectz")
public class GameController {


    @GetMapping("/elnombre")
    public ResponseEntity<String> getNombre(){

        String elnombre = "el nombre";
        return new ResponseEntity<String>(elnombre, HttpStatus.OK);

    }
}
