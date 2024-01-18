package com.projectzeta.zeta.controllers;

import com.projectzeta.zeta.models.InstadeathDto;
import com.projectzeta.zeta.models.RestDto;
import com.projectzeta.zeta.models.Stage;
import com.projectzeta.zeta.service.GameService;
import com.projectzeta.zeta.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projectz")
public class GameController {

    @Autowired
    GameService gameService;

    @Autowired
    RestService restService;



    @GetMapping("/stage/{idStage}")
    public ResponseEntity<Stage> getStageInfo(@PathVariable Long idStage) {


        try {
            return new ResponseEntity<Stage>(this.gameService.getStageInfoById(idStage), HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<Stage>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/rest/{restModifier}")
    public ResponseEntity<RestDto> getRestInfo(@PathVariable Long restModifier) {


        try {
            RestDto restInfo =	this.restService.getRestInfo(restModifier);

            return new ResponseEntity<RestDto>(restInfo, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<RestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @GetMapping("/instadeath/{idOption}")
    public ResponseEntity<InstadeathDto> getInstadeathInfo(@PathVariable Long idOption) {


        try {
            InstadeathDto instadeathInfo =	this.gameService.getInstadeathInfo(idOption);

            return new ResponseEntity<InstadeathDto>(instadeathInfo, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}


