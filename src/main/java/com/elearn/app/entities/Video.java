package com.elearn.app.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Video {
    private String id;
    private String title;
    private String description;
    private String filePath;
    private String contentType;

}
