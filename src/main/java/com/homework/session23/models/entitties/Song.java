package com.homework.session23.models.entitties;

import java.util.Date;

@Data
public class Song {
    @Id
    @GeneratedValue(strategy = Geerated)
    private int ID;
    private String name, composer;
    private Date yearOfRelease;
}
