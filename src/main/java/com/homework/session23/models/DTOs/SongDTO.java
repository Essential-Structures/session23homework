package com.homework.session23.models.DTOs;

import lombok.Data;
import java.util.Date;

@Data
public class SongDTO {
    private String title,
                    composer;
    private Date yearOfRelease;
}
