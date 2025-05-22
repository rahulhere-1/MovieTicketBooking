package com.example.movie_ticket_booking_service.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Movie {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private Integer duration;

    @Column
    private Date releaseDate;


}
