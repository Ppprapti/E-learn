package com.elearn.app.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Cource {

    private String id;
    private String title;
    private String shortDesc;
    private String longDesc;
    private Double price;
    private Double discount;
    private String banner;
    private Boolean live = true;
    private Date addedDate;



}
