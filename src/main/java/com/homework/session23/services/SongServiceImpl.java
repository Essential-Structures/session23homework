package com.homework.session23.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homework.session23.models.DTOs.SongDTO;
import com.homework.session23.models.entitties.SongEntitty;
import com.homework.session23.repositories.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SongServiceImpl implements SongServiceable {
    private final ObjectMapper objectMapper;
    private final SongRepository songRepository;

    public SongServiceImpl(ObjectMapper objectMapper, SongRepository songRepository) {
        this.objectMapper = objectMapper;
        this.songRepository = songRepository;
    }

    @Override
    public SongDTO saveSong(SongDTO songDTOToSave) {
       SongEntitty songEntityToSaveToPersistance = objectMapper.convertValue(songDTOToSave, SongEntitty.class);
       SongEntitty databaseConfirmation = songRepository.save(songEntityToSaveToPersistance);
       log.info("Saved to persistance song: "+ databaseConfirmation.toString());

        return null;
    }
}
