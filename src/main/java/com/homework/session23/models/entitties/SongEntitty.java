package com.homework.session23.models.entitties;

import java.time.LocalDate;

@Data
public class Song {
    @Id
    @GeneratedValue(strategy = Generated)
    private int ID;
    private String name, composer;
    private LocalDate yearOfRelease;
}
