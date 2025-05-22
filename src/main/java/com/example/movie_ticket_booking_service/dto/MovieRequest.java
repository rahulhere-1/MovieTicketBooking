package com.example.movie_ticket_booking_service.dto;

import com.example.movie_ticket_booking_service.enums.Genre;
import com.example.movie_ticket_booking_service.enums.Language;

public class MovieRequest {
    private String name;
    private Integer duration;
    private Double rating;
    private Genre genre;
    private Language language;
}
