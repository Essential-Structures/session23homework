package com.homework.session23.models.entitties;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "songs")
public class SongEntitty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name = "song_title")
    private String title;
    @Column(name = "composer")
    private String composer;
    @Column(name="year_of_release")
    private Date yearOfRelease;
}
