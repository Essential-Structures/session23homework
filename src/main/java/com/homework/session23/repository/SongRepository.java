package com.homework.session23.repository;

import com.homework.session23.models.entitties.SongEntitty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongEntitty, Byte> {}
