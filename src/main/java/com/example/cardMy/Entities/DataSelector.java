package com.example.cardMy.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "data_selector")
public class DataSelector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idData;
    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "lastname", nullable = false)
    private String lastname;
    @Column (name = "profession", nullable = false)
    private String profession;
    @Column (name = "email", nullable = true)
    private String email;
    @Column (name = "whatsapp", nullable = true)
    private String whatsapp;
    @Column (name = "linkedin", nullable = true)
    private String linkedin;
    @Column (name = "portal", nullable = true)
    private String portal;
    @Column (name = "facebook", nullable = true)
    private String facebook;
    @Column (name = "twitter", nullable = true)
    private String twitter;
    @Column (name = "instagram", nullable = true)
    private String instagram;
    @Column (name = "location", nullable = true)
    private String location;
    @Column (name = "cbu", nullable = true)
    private String cbu;
}
