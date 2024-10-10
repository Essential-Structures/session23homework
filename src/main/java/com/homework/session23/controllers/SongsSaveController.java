package com.homework.session23.controllers;

import com.homework.session23.models.DTOs.SongDTO;
import com.homework.session23.models.entitties.SongEntitty;
import com.homework.session23.services.SongServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongsSaveController {

    @Autowired
    private SongServiceable songService;

    @PostMapping("/api/songs")
    public ResponseEntity<SongDTO> saveSong(@RequestBody SongDTO songToSave){
        return ResponseEntity.ok (songService.saveSong(songToSave));

    }

}
