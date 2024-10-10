package com.homework.session23.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homework.session23.models.DTOs.SongDTO;
import com.homework.session23.models.entitties.SongEntitty;
import com.homework.session23.repository.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SongServiceImpl implements SongServiceable {

    private final SongRepository supository;
    private final ObjectMapper objectMapper;

    public SongServiceImpl(SongRepository supository, ObjectMapper objectMapper) {
        this.supository = supository;
        this.objectMapper = objectMapper;
    }

    @Override
    public SongDTO saveSong(SongDTO songDTOtoPersist) {
        SongEntitty entittyToPersist = objectMapper.convertValue(songDTOtoPersist,SongEntitty.class);
        SongEntitty saved = supository.save(entittyToPersist);
        log.info("We just persisted: "+saved.toString());
        return objectMapper.convertValue(saved, SongDTO.class);
    }
}
