package com.homework.session23.repositories;

import com.homework.session23.models.DTOs.SongDTO;
import com.homework.session23.models.entitties.SongEntitty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<SongEntitty, Integer> {
}
