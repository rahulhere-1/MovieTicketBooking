package com.example.movie_ticket_booking_service.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Show {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "id")
    @ManyToOne
    private Movie movie;

    @Column
    private Date time;

}
