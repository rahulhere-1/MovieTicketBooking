package com.example.movie_ticket_booking_service.model;

import com.example.movie_ticket_booking_service.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_movie")
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

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

}
