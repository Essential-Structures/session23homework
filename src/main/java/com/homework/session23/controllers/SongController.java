package com.homework.session23.controllers;

import com.homework.session23.models.entitties.SongEntitty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @GetMapping("/songs_api/")
    public ResponseEntity<SongEntitty> returnSongsMetadata(@RequestBody String songTitle)
    {return ResponseEntity.ok(songMetadata);
    }
}
