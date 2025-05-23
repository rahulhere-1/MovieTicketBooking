package com.example.movie_ticket_booking_service.dto;

import com.example.movie_ticket_booking_service.enums.Genre;
import com.example.movie_ticket_booking_service.enums.Language;
import lombok.Data;

@Data
public class MovieDTO {
    private Long movieId;
    private String movieName;
    private Integer duration;
    private Double rating;
    private Genre genre;
    private Language language;
}
