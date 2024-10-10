package com.homework.session23.services;

import com.homework.session23.models.DTOs.SongDTO;
import com.homework.session23.models.entitties.SongEntitty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongServiceable {
    @Override
    public SongDTO saveSong() {
        return null;
    }
}
