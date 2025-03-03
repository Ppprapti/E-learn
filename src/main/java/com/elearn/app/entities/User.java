package com.elearn.app.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String id;
    private String name;
    private String email;
    private String phnno;
    private String password;
    private boolean emailVerified;
    private boolean phnVerified;
    private String savedOtp;

}
